/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import exceptions.DatoErroneoException;
import exceptions.ExceptionsMensajes;
import modelos.Cliente;
import modelos.Transferencia;
import repositorios.RepositorioClientes;
import repositorios.RepositorioTransferencias;

/**
 *
 * @author nicol
 */
public class ServicioTransferencia {

    private static final int CAMPO_NULO = 0;

    private RepositorioClientes repositorioClientes;

    private RepositorioTransferencias repositorioTransferencias;

    private ExceptionsMensajes exceptionsMensajes;

    public ServicioTransferencia() {
        this.repositorioClientes = new RepositorioClientes();
        this.repositorioTransferencias = new RepositorioTransferencias();
        this.exceptionsMensajes = new ExceptionsMensajes();
    }

    public void transferir(String monto, Cliente transferirDesde, Cliente transferirHacia) throws DatoErroneoException {

        verificarDatos(monto, transferirDesde, transferirHacia);

        verificarMonto(monto, transferirDesde);

        
        
        ejecutarTransaccion(Double.parseDouble(monto), transferirDesde, transferirHacia);

    }

    private boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esCampoVacio(String cadena) {
        if (cadena.length() == CAMPO_NULO) {
            return true;
        }
        return false;
    }

    private void verificarMonto(String monto, Cliente transferirDesde) throws DatoErroneoException {

        if (Double.parseDouble(monto) <= transferirDesde.getImporteCliente()) {
            return;
        }

        exceptionsMensajes.setError("monto", "Saldo insuficiante");

        throw new DatoErroneoException(exceptionsMensajes);

    }

    private void verificarDatos(String monto, Cliente transferirDesde, Cliente transferirHacia) throws DatoErroneoException {

        if (esCampoVacio(monto)) {
            exceptionsMensajes.setError("monto", "No a ingresado ningun monto");
        } else if (!esNumero(monto)) {
            exceptionsMensajes.setError("monto", "Monto ingresado invalido");
        }

        if (transferirDesde.getDni() == (transferirHacia.getDni())) {
            exceptionsMensajes.setError("hacia", "Un usuario no se puede auto transferir");
        }

        if (exceptionsMensajes.getError().size() != 0) {
            throw new DatoErroneoException(exceptionsMensajes);
        }

    }

    private void ejecutarTransaccion(double monto,Cliente transferirDesde,Cliente transferirHacia) {

        for (Cliente cliente : repositorioClientes.getListaClientes()) {

            if (cliente.getDni() == transferirDesde.getDni()) {
                cliente.descontar(monto);
            }

            if (cliente.getDni() == transferirHacia.getDni()) {
                cliente.sumar(monto);
            }

        }
        Transferencia transferencia = new Transferencia(monto,transferirDesde,transferirHacia);

        repositorioTransferencias.setListaTransferencias(transferencia);

    }

}
