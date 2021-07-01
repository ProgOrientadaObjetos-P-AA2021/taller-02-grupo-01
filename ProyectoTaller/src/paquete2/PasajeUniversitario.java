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
public class PasajeUniversitario extends PasajeInterCantonal {

    private String nombreUniversidad;
    private double valorPasaje;

    public PasajeUniversitario(String n, int c, String o, String d, double nKD,
            double tB, String nU) {
        super(n, c, o, d, nKD, tB);
        nombreUniversidad = nU;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nU) {
        nombreUniversidad = nU;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    @Override
    public void calcularValorPasaje() {
        valorPasaje = tarifaBase / 2;
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
