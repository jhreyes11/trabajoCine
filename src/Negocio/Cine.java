/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class Cine {

    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private ArrayList<Sala> salas = new ArrayList<>();
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private int numeroSalas3D = 2;
    private int numeroSalas2D = 2;

    public Cine() {
        salas = new ArrayList<>();
        peliculas = new ArrayList<>();
        vendedores = new ArrayList<>();
    }

    public boolean agregarSala(String tipo, int numero) {
        if (contarTipoSala(tipo)) {
            Sala sala = new Sala(tipo, numero);
            salas.add(sala);
            return true;
        }
        return false;
    }

    public boolean eliminarSala(int numeroSala) {
        int enc = buscarSala(numeroSala);
        if (enc != -1) {
            salas.remove(enc);
            return true;
        }
        return false;
    }

    public String mostrarSala(int numeroSala) {//Retorna la información de la sala si existe, de lo contrario retorna una cadena indicando que no existe la sala
        int enc = buscarSala(numeroSala);
        if (enc != -1) {
            return salas.get(enc).tostring();
        }
        return "No existe una sala con el número insertado\n";
    }

    public boolean agregarPelicula(String nombre, String duracion, String genero, String formato, int numeroSala) throws Exception {
        validarSala(formato, numeroSala);
        if (peliculas.size() < 5) {
            Pelicula pel = new Pelicula(nombre, duracion, genero, formato, numeroSala);
            peliculas.add(pel);
            return true;
        }
        return false;
    }

    public boolean eliminarPelicula(String nombre) {
        int enc = buscarPelicula(nombre);
        if (enc != -1) {
            peliculas.remove(enc);
            return true;
        }
        return false;
    }

    public String mostrarPelicula(String nombre) {
        int pos = buscarPelicula(nombre);
        if (pos != -1) {
            String pel = peliculas.get(pos).tostring();
            return pel;
        }
        return "";
    }

    public boolean agregarVendedor(String apellido, String direccion, String telefono, int cedula) {
        Vendedor v = new Vendedor(apellido, direccion, telefono, cedula);
        if(buscarVendedor(cedula)==-1){            
            vendedores.add(v);
            return true;
        }
        return false;
    }

    public boolean eliminarVendedor(int cedula) {
        int pos = buscarVendedor(cedula);
        if (pos != -1) {
            vendedores.remove(pos);
            return true;
        }
        return false;
    }

    public ArrayList<Vendedor> retornarVendedores(){
        return this.vendedores;
    }
    
    public String mostrarVendedor(int cedula) {
        int pos = buscarVendedor(cedula);
        if (pos != -1) {
            return vendedores.get(pos).tostring();
        }
        return "";
    }

    public boolean contarTipoSala(String tipo) {
        if (tipo.equals("2D") && contarSalas(tipo) < numeroSalas2D) {
            return true;
        }
        if (tipo.equals("3D") && contarSalas(tipo) < numeroSalas3D) {
            return true;
        }
        return false;
    }

    public int contarSalas(String tipo) {
        int cont = 0;
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).getTipo().equals(tipo)) {
                cont += 1;
            }
        }
        return cont;
    }

    public int buscarSala(int numero) { //retorna la posicíon en la lista del " de la sala especificada si esta se encuentra de lo contrario retorna -1
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    public int buscarPelicula(String nombre) { //retorna la posicíon en la lista del " de la sala especificada si esta se encuentra de lo contrario retorna -1
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void validarSala(String formato, int numero) throws Exception {
        for (int i = 0; i < salas.size(); i++) {
            if (salas.get(i).getTipo().equals(formato) && salas.get(i).getNumero() == numero) {
                return;
            }

        }
        throw new Exception("La sala no soporta este formato");
    }

    public int buscarVendedor(int cedula) {
        for (int i = 0; i < vendedores.size(); i++) {
            if (cedula == vendedores.get(i).getCedula()) {
                return i;
            }
        }
        return -1;
    }
}
