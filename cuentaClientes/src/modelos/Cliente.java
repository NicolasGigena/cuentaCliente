/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


public class Cliente {
    
    private String nombre;
   
    private String apellido;
    
    private int dni;
    
    private double importeCliente;

    public Cliente(String nombre, String apellido,int dni, double montoInicial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.importeCliente = montoInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public double getImporteCliente() {
        return importeCliente;
    }
    
    public void descontar(double resta){
     this.importeCliente -= resta;
    }
    
    public void sumar(double suma){
     this.importeCliente += suma;
    }

    @Override
    public String toString() {
        return nombre + ": "+ dni ; 
    }
    
    
    
    
}
