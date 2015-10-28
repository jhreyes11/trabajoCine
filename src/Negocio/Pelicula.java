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

    public Pelicula(String nombre, String duracion, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
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
    
    public String tostring() {
        String cadena = "Nombre de la pelicula: " + this.nombre + "\nDuración de la película: " + this.duracion + "\nGénero de la película: " + this.genero;
        return cadena;
    }
    
}
