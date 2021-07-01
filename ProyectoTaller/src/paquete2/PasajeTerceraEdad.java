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
public class PasajeTerceraEdad extends PasajeInterCantonal {

    private double valorPasaje;

    public PasajeTerceraEdad(String n, int c, String o, String d, double nKD,
            double tB) {
        super(n, c, o, d, nKD, tB);

    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    @Override
    public void calcularValorPasaje() {
        valorPasaje = (numeroKmDistancia * 0.5) + (tarifaBase / 2);
    }

    @Override
    public String toString() {
        return String.format("%sValor Pasaje: %.2f\n",
                super.toString(), valorPasaje);
    }
}
