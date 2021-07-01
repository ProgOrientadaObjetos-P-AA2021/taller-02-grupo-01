/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();
        PasajeMenorEdad pasajeM = new PasajeMenorEdad("Jhoel", 1900691161, "Yantzaza",
        "loja", 40, 5, 10);
        
        PasajeNormal pasajeNormal = new PasajeNormal("Ximena", 1900452897, "Loja", 
        "Cuenca", 213.3, 12, 5);
                
        PasajeTerceraEdad pasajeTer = new PasajeTerceraEdad("Patricio", 1900810502, 
        "Zamora", "Quito", 696.6, 20);
        
        PasajeUniversitario pasajeUni = new PasajeUniversitario("Sheila", 1900897425,
        "Panguintza", "Machala", 329.2, 15, "UTPL");
        
        pasajes.add(pasajeM);
        pasajes.add(pasajeNormal);
        pasajes.add(pasajeTer);
        pasajes.add(pasajeUni);
        
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);


        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).calcularValorPasaje();
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
            
        }

        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
