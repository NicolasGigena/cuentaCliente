/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelos.Transferencia;


public class RepositorioTransferencias {
    
    private static ArrayList<Transferencia> listaTransferencias = new  ArrayList<>();

    public void setListaTransferencias(Transferencia transferencia) {
        this.listaTransferencias.add(transferencia);
    }

    public ArrayList<Transferencia> getListaTransferencias() {
        return this.listaTransferencias;
    }
    public ArrayList<Transferencia> optenerPorDni(int dni) {
        
        ArrayList<Transferencia> arrayTransferencia = new ArrayList<>();
        
        for (Transferencia transferencia : this.listaTransferencias) {
            if (transferencia.getDesde().getDni() == dni) {
               arrayTransferencia.add(transferencia);
            }
        }
        return arrayTransferencia;
    }
    public int getCantidadDeTranferencias(){
        return listaTransferencias.size();
    }
      
}

