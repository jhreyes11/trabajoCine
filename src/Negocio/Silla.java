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
public class Silla {
    private String ubicacion;
    private String estado;

    public Silla(String ubicacion, String estado) {
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String tostring() {
        String cadena = "Ubicación de la silla: " + this.ubicacion + "\nEstado de la silla: " + this.estado;
        return cadena;
    }
    
}
