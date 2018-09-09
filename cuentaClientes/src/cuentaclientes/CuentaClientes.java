
package cuentaclientes;

import vistas.VistaAltaClientes;

/**
 *
 * @author nicolas
 */
public class CuentaClientes {

  
    public static void main(String[] args) {
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAltaClientes().setVisible(true);
            }
        });
    }
    }
    

