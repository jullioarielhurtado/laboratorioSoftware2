/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.numeroscomplejos;

/**
 *
 * @author ahurtado
 */
public class Complejo {
    
    private double real;
    private double imaginaria;

    public Complejo(double d, double d0) {
        real = d;
        imaginaria = d0;
    }
    
    public double getReal(){
        return real;
    }
    
    public double getImaginario(){
        return imaginaria;
    }
    
    @Override
    public String toString(){
        return ""+real+"+"+imaginaria+"i";
    }

    public void sumar(Complejo sumando) {
        real = real + sumando.getReal();
        imaginaria = imaginaria + sumando.getImaginario();
  
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @param imaginaria the imaginaria to set
     */
    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }
    
    
}
