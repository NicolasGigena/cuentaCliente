/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.interfaces;

import modelos.Cliente;
import modelos.Transferencia;

/**
 *
 * @author nicol
 */
public interface IvistaMoviemientosInterface {
    
    public abstract void imprimirSaldoCliente(String saldo);
    
    public abstract void imprimirTransferencias(Transferencia[] transferencias);
    
    public abstract void limpiarMovimientos();
    
    public abstract void cargarClientes(Cliente[] clientes);
    
}
