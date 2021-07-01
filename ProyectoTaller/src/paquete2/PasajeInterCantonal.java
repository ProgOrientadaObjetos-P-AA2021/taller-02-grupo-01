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
public abstract class PasajeInterCantonal implements Serializable {

    protected String nombre;
    protected int cedula;
    protected String origen;
    protected String destino;
    protected double numeroKmDistancia;
    protected double tarifaBase;
    protected double valorPasaje;

    public PasajeInterCantonal(String n, int c, String o, String d, double nKD,
            double tB) {
        nombre = n;
        cedula = c;
        origen = o;
        destino = d;
        numeroKmDistancia = nKD;
        tarifaBase = tB;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int c) {
        cedula = c;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String o) {
        origen = o;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String d) {
        destino = d;
    }

    public double getNumeroKmDistancia() {
        return numeroKmDistancia;
    }

    public void setNumeroKmDistancia(double nKD) {
        numeroKmDistancia = nKD;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tB) {
        tarifaBase = tB;
    }
    
    public abstract void calcularValorPasaje();

    @Override
    public String toString() {
        return String.format("Pasaje.");
    }

}
