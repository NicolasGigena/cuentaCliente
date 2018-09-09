/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.interfaces;

import modelos.Cliente;


public interface IvistaTransferenciasInterface {
    
    public abstract void tranferenciaRealizada();

    public abstract void setErrorHacia(String error);

    public abstract void setErrorMonto(String error);
    
    public abstract void  limpiarErrores();
    
    public abstract void cargarClientes(Cliente[] clientes);
}
