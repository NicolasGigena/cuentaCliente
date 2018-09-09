/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentadores;

import modelos.Cliente;
import modelos.Transferencia;
import repositorios.RepositorioClientes;
import repositorios.RepositorioTransferencias;
import vistas.VistaAltaClientes;
import vistas.VistaMovimientos;
import vistas.VistaTransferencias;

public class PresentadorMovimientos {

    VistaMovimientos vistaMovimientos;

    RepositorioTransferencias RepositorioTransferencias;

    RepositorioClientes repositorioClientes;

    public PresentadorMovimientos(VistaMovimientos vistaMovimientos) {
        this.vistaMovimientos = vistaMovimientos;
        this.RepositorioTransferencias = new RepositorioTransferencias();
        this.repositorioClientes = new RepositorioClientes();
    }

    public void imprimirLista() {

        Cliente imprimirMovimientosDe = (Cliente) vistaMovimientos.getImprimirDejComboBox().getSelectedItem();

        vistaMovimientos.limpiarMovimientos();

        Transferencia[] transferencias = new Transferencia[RepositorioTransferencias.getCantidadDeTranferencias()];

        int contador = 0;

        for (Transferencia transferencia : RepositorioTransferencias.optenerPorDni(imprimirMovimientosDe.getDni())) {

            transferencias[contador] = transferencia;
            
            contador++;

        }
        vistaMovimientos.imprimirTransferencias(transferencias);

        vistaMovimientos.imprimirSaldoCliente(String.valueOf(repositorioClientes.optenerPorDni(imprimirMovimientosDe.getDni()).getImporteCliente()));

    }

    public void haciaAltaCliente() {
        VistaAltaClientes vistaAltaClientes = new VistaAltaClientes();
        vistaAltaClientes.setVisible(true);
        vistaMovimientos.setVisible(false);
    }

    public void haciaTransferencias() {
        VistaTransferencias vistaTransferencias = new VistaTransferencias();
        vistaTransferencias.setVisible(true);
        vistaMovimientos.setVisible(false);
    }

    public void inicializarClientes() {
        
        Cliente[] clientes = new Cliente[repositorioClientes.cantidadDeClientes()];
        int contador = 0;
        for (Cliente cliente : repositorioClientes.getListaClientes()) {
            clientes[contador] = cliente;
            contador++;
        }
        
        vistaMovimientos.cargarClientes(clientes);
    }

}
