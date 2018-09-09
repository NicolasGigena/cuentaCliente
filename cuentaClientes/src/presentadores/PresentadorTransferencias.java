package presentadores;

import exceptions.DatoErroneoException;
import exceptions.ExceptionsMensajes;
import java.awt.Color;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelos.Cliente;
import repositorios.RepositorioClientes;
import servicios.ServicioTransferencia;
import vistas.VistaAltaClientes;
import vistas.VistaMovimientos;
import vistas.VistaTransferencias;

public class PresentadorTransferencias {
    
    private VistaTransferencias vistaTransferencias;
    
    private RepositorioClientes repositorioClientes;
    
    private ServicioTransferencia servicioTransferencia;
    
    public PresentadorTransferencias(VistaTransferencias vistaTransferencias) {
        this.vistaTransferencias = vistaTransferencias;
        this.repositorioClientes = new RepositorioClientes();
        this.servicioTransferencia = new ServicioTransferencia();
    }
    
    public void transferir() {
        
        vistaTransferencias.limpiarErrores();
        
        Cliente transferirHacia = (Cliente) vistaTransferencias.getHaciajComboBoxTransferencia().getSelectedItem();
        
        Cliente transferenciaDesde = (Cliente) vistaTransferencias.getDesdejComboBoxTransferencia().getSelectedItem();
        
        String monto = vistaTransferencias.getMontojTextFieldTransferencia().getText();
        
        try {
            servicioTransferencia.transferir(monto, transferenciaDesde, transferirHacia);
            
            vistaTransferencias.tranferenciaRealizada();
            
        } catch (DatoErroneoException exception) {
            
            errorDatosIngresados(exception);
            
        }
        
    }
    
    private void errorDatosIngresados(DatoErroneoException exception) {
        
        ExceptionsMensajes exceptionsMensajes = exception.getExceptionsMensajes();
        
        Enumeration<String> clave = exceptionsMensajes.getError().keys();
        Enumeration<String> valor = exceptionsMensajes.getError().elements();
        
        while (clave.hasMoreElements()) {
            
            switch (clave.nextElement()) {
                case "monto":
                    vistaTransferencias.setErrorMonto(valor.nextElement());
                    break;
                case "hacia":
                    vistaTransferencias.setErrorHacia(valor.nextElement());
                    break;
            }
        }
        exceptionsMensajes.getError().clear();
        
    }
    
    public void inicializarClientes() {   
        Cliente[] clientes = new Cliente[repositorioClientes.cantidadDeClientes()];
        int contador = 0;
        for (Cliente cliente : repositorioClientes.getListaClientes()) {
            clientes[contador] = cliente;
            contador++;
        }
        
        vistaTransferencias.cargarClientes(clientes);

    }
    
    public void haciaAltaClientes() {
        VistaAltaClientes vistaAltaClientes = new VistaAltaClientes();
        vistaAltaClientes.setVisible(true);
        vistaTransferencias.setVisible(false);
    }
    
    public void haciaMovimientos() {
        VistaMovimientos vistaMovimientos = new VistaMovimientos();
        vistaMovimientos.setVisible(true);
        vistaTransferencias.setVisible(false);
    }
    
}
