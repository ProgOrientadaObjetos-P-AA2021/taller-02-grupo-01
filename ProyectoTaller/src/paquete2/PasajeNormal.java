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
public class PasajeNormal extends PasajeInterCantonal
        implements Serializable {

    private double porcentajeAdicional;
    private double valorPasaje;

    public PasajeNormal(String n, int c, String o, String d, double nKD,
            double tB, double pA) {
        super(n, c, o, d, nKD, tB);
        porcentajeAdicional = pA;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double pA) {
        porcentajeAdicional = pA;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    @Override
    public void calcularValorPasaje() {
        valorPasaje = (numeroKmDistancia * 0.15) + (tarifaBase
                - (tarifaBase * (porcentajeAdicional / 100)));
    }

    @Override
    public String toString() {
        return String.format("%sProcentaje Adicional: %.2f\nValor Pasaje: %.2f\n",
                super.toString(), porcentajeAdicional, valorPasaje);
    }

}
