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
    
    private double porcentajeDescuento;
    private double valorPasaje;
    
    public PasajeMenorEdad(String n, int c, String o, String d, double nKD, double tB, double pD){
        super(n, c, o, d, nKD, tB);
        porcentajeDescuento = pD;
    }

    public double getDescuento() {
        return porcentajeDescuento;
    }

    public void setDescuento(double pD) {
        porcentajeDescuento = pD;
    }

    @Override
    public void calcularValorPasaje(){
        valorPasaje = (numeroKmDistancia * 0.10) + (tarifaBase - (tarifaBase * 
                (porcentajeDescuento / 100)));
    }
        
    public double getValorPasaje() {
        return valorPasaje;
    }
    
    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
    
}
