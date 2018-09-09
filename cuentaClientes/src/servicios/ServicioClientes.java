package servicios;

import exceptions.DatoErroneoException;
import exceptions.ExceptionsMensajes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelos.Cliente;
import repositorios.RepositorioClientes;

public class ServicioClientes {

    private static final int CAMPO_NULO = 0;

    private RepositorioClientes repositorioClientes;
    private ExceptionsMensajes exceptionsMensajes;

    public ServicioClientes() {
        this.repositorioClientes = new RepositorioClientes();
        this.exceptionsMensajes = new ExceptionsMensajes();
    }

    public void darDeAltaCliente(String nombre, String apellido, String dni, String FondoInicial) throws DatoErroneoException {

        datosCorrectos(nombre, apellido, dni, FondoInicial);

        Cliente cliente = new Cliente(nombre, apellido, Integer.parseInt(dni), Double.parseDouble(FondoInicial));

        repositorioClientes.setListaClientes(cliente);

    }

    private void datosCorrectos(String nombre, String apellido, String dni, String FondoInicial) throws DatoErroneoException {

        if (esCampoVacio(nombre)) {
            exceptionsMensajes.setError("nombre", "No a ingresado ningun nombre");
        } else if (!esSoloLetras(nombre)) {
            exceptionsMensajes.setError("nombre", "Nombre invalido");
        }

        if (esCampoVacio(apellido)) {
            exceptionsMensajes.setError("apellido", "No a ingresado ningun apellido");
        } else if (!esSoloLetras(apellido)) {
            exceptionsMensajes.setError("apellido", "Apellido invalido");
        }

        if (esCampoVacio(dni)) {
            exceptionsMensajes.setError("dni", "No a ingresado ningun dni");
        } else if (!esNumero(dni)) {
            exceptionsMensajes.setError("dni", "Dni invalido");
        } else if (dniRedundante(dni)) {
            exceptionsMensajes.setError("dni", "Dni ya registrado");
        }

        if (esCampoVacio(FondoInicial)) {
            exceptionsMensajes.setError("fondo inicial", "No a ingresado ningun Fondo inicial");
        } else if (!esNumero(FondoInicial)) {
            exceptionsMensajes.setError("fondo inicial", "Fondo inicial invalido");
        }

        if (exceptionsMensajes.getError().size() != 0 ) {
            throw new DatoErroneoException(exceptionsMensajes);
        }

    }

    private boolean dniRedundante(String dni) {

        for (Cliente cliente : repositorioClientes.getListaClientes()) {
            if (cliente.getDni() == Integer.valueOf(dni)) {
                return true;
            }
        }
        return false;
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

    private boolean esSoloLetras(String cadena) {
        Pattern pat = Pattern.compile("[a-zA-Z]+");
        Matcher mat = pat.matcher(cadena);

        if (!mat.matches()) {
            return false;
        }
        return true;
    }

}
