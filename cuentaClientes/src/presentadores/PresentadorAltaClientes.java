/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentadores;

import exceptions.DatoErroneoException;
import exceptions.ExceptionsMensajes;
import java.util.Enumeration;
import servicios.ServicioClientes;
import vistas.VistaAltaClientes;
import vistas.VistaMovimientos;
import vistas.VistaTransferencias;

public class PresentadorAltaClientes {
    
    private VistaAltaClientes vistaAltaClientes;
    
    private ServicioClientes servicioClientes;
    
    public PresentadorAltaClientes(VistaAltaClientes vistaAltaClientes) {
        this.vistaAltaClientes = vistaAltaClientes;
        this.servicioClientes = new ServicioClientes();
    }
    
    public void darDeAltaCliente() {
        
        vistaAltaClientes.limpiarErrores();
        
        String nombre = vistaAltaClientes.getNombrejTextFieldAltaClinente().getText();
        
        String apellido = vistaAltaClientes.getApellidojTextFieldAltaClinente().getText();
        
        String dni = vistaAltaClientes.getDnijTextFieldAltaClinente().getText();
        
        String sueldoInicial = vistaAltaClientes.getFondoInicialjTextFieldAltaClinente().getText();
        
        try {
            
            servicioClientes.darDeAltaCliente(nombre, apellido, dni, sueldoInicial);
            
            vistaAltaClientes.mensajeGuardadoConExito();
            
            vistaAltaClientes.LimpiarInputText();
            
        } catch (DatoErroneoException exception) {
            
            imprimirErrorDatosIngresados(exception);
            
        }
        
    }
    
    private void imprimirErrorDatosIngresados(DatoErroneoException exception) {
        
        ExceptionsMensajes exceptionsMensajes = exception.getExceptionsMensajes();
        
        Enumeration<String> clave = exceptionsMensajes.getError().keys();
        Enumeration<String> valor = exceptionsMensajes.getError().elements();
        
        while (clave.hasMoreElements()) {
            
            switch (clave.nextElement()) {
                case "nombre":
                    vistaAltaClientes.setErrorNombre(valor.nextElement());
                    break;
                case "apellido":
                    vistaAltaClientes.setErrorApellido(valor.nextElement());
                    break;
                case "dni":
                    vistaAltaClientes.setErrorDni(valor.nextElement());
                    break;
                case "fondo inicial":
                    vistaAltaClientes.setErrorFondoInicial(valor.nextElement());
                    break;
                
            }
        }
        exceptionsMensajes.getError().clear();
    }
    
    public void haciaVistaTransferencias() {
        
        VistaTransferencias vistaTransferencias = new VistaTransferencias();
        vistaTransferencias.setVisible(true);
        vistaAltaClientes.setVisible(false);
        
    }
    
    public void haciaMovimientos() {
        VistaMovimientos vistaMovimientos = new VistaMovimientos();
        vistaMovimientos.setVisible(true);
        vistaAltaClientes.setVisible(false);
        
    }
    
}
