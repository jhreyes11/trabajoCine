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
public class Pelicula {

    private String nombre;
    private String duracion;
    private String genero;
    private int numeroSala;
    private String formato;

    public Pelicula(String nombre, String duracion, String genero, String formato, int numeroSala) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.numeroSala = numeroSala;
        this.formato = formato;
    }

    public String tostring() {
        String cadena = "Nombre: " + this.nombre + "\nDuración: " + this.duracion + "\nGénero: " + this.genero + "\nFormato: " + this.formato + "\nNumero de sala: " + this.numeroSala;
        return cadena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
