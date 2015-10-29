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
public class Vendedor {
    private String apellido;
    private String direccion;
    private String telefono;
    private int cedula;

    public String tostring() {
        String cadena = "Apellido : " + this.apellido + "\nCedula : " + this.cedula +"\nDireccion: " + this.direccion+ "\nTelefono: " + this.telefono;
        return cadena;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Vendedor(String apellido, String direccion, String telefono,int cedula) {
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula=cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
