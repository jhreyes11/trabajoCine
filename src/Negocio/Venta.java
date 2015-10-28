/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Jhon
 */
public class Venta {

    private int numBoleto;
    private String fecha;
    private String ubicacionSilla;
    private int numSala;

    public String tostring() {
        String cadena = "Numero Boleto: " + this.numBoleto + "\nFecha de la venta: " + this.fecha + "Numero de sala: " + this.numSala + "\nUbicación de la silla: " + this.ubicacionSilla;
        return cadena;
    }

    public Venta(int numBoleto, String fecha, String ubicacionSilla, int numSala) {
        this.numBoleto = numBoleto;
        this.fecha = fecha;
        this.ubicacionSilla = ubicacionSilla;
        this.numSala = numSala;
        
    }
    
    
    
    public int getNumBoleto() {
        return numBoleto;
    }

    public void setNumBoleto(int numBoleto) {
        this.numBoleto = numBoleto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacionSilla() {
        return ubicacionSilla;
    }

    public void setUbicacionSilla(String ubicacionSilla) {
        this.ubicacionSilla = ubicacionSilla;
    }

}
