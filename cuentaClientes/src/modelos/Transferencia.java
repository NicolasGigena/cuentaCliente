/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author nicol
 */
public class Transferencia {
    
    private double monto;
    
    private Cliente desde;
    
    private Cliente Hacia;

    public Transferencia(double monto,Cliente desde,Cliente Hacia) {
        this.monto = monto;
        this.desde = desde;
        this.Hacia = Hacia;
    }

    public double getMonto() {
        return monto;
    }

    public Cliente getDesde() {
        return desde;
    }

    public Cliente getHacia() {
        return Hacia;
    }

    @Override
    public String toString() {
        return String.valueOf(monto);
    }
    
    
    
}
