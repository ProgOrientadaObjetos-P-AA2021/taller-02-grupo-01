/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    private double descuento;
    private double valorPasaje;
    
    public PasajeMenorEdad(double d){
        descuento = d;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double d) {
        descuento = d;
    }

    @Override
    public void calcularValorPasaje(){
        valorPasaje = (numeroKmDistancia * 0.10) + (tarifaBase - (tarifaBase * 
                (descuento / 100)));
    }
        
    public double getValorPasaje() {
        return valorPasaje;
    }
    
    
}
