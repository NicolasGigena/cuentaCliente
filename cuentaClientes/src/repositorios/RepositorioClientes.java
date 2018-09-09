/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Cliente;
import modelos.Transferencia;

public class RepositorioClientes {

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void setListaClientes(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public ArrayList<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    public Cliente optenerPorDni(int dni) {

        for (Cliente cliente : this.listaClientes) {
            if (cliente.getDni() == dni) {
                return cliente;
            }
        }
        return new Cliente("","",0,0);
    }
    
    public int cantidadDeClientes(){
        return listaClientes.size();
    }

}
