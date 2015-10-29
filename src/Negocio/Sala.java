/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;


public class Sala {

    private String Tipo;
    private int numero;
    private int capacidad = 220;//escalabilidad
    private ArrayList<Silla> sillas;
    static String[] ub=new String[220];

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    public Sala(String Tipo, int numero) {
        this.Tipo = Tipo;
        this.numero = numero;
        this.sillas = new ArrayList<>();
        asignarUbicacionSillas();
    }

    public String tostring() {
        String cadena = "Numero de Sala: " + this.numero + "\nTipo de sala: " + this.Tipo + "\nNumero de sillas: " + sillas.size() + "\nCapacidad: " + this.capacidad;
        return cadena;
    }

    public boolean agregarSillas(){
        if(sillas.size()<capacidad){
            Silla s=new Silla(ub[sillas.size()],"libre");
            sillas.add(s);
            return true;
        }
        return false;
    }
    
    public boolean eliminarSilla() { //si hay sillas en el
        if (sillas.size() > 0) {
            sillas.remove(sillas.size() - 1);
            return true;
        }
        return false;
    }
    
  
    public String mostrarSilla(String ubicacion){//Retorna la información de la silla si existe, de lo contrario retorna una cadena indicando que no existe la silla
        int enc = buscarSilla(ubicacion);
        if (enc != -1) {
            return sillas.get(enc).tostring();
        }
        return "No existe una sala con el número insertado\n";
    }
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

     public int buscarSilla(String ubicacion) { //retorna la posicíon en la lista del " de la sala especificada si esta se encuentra de lo contrario retorna -1
        for (int i = 0; i < sillas.size(); i++) {
            if (sillas.get(i).getUbicacion().equals(ubicacion)) {
                return i;
            }
        }
        return -1;
    }
     
    public void mostrarSillas(){
        for (int i = 0; i < sillas.size(); i++) {
            System.out.println(sillas.get(i).tostring());
            }
    }
    
    public void asignarUbicacionSillas() {
        String[] numeros = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20".split(",");
        String[] letras = "A,B,C,D,E,F,G,H,I,J,K".split(",");
        int cont=0;
        for (int l = 0; l < letras.length; l++) {
            for (int n = 0; n < numeros.length; n++) {
                ub[cont] = letras[l] + "-" + numeros[n];
                cont+=1;
            }
        }
        
    }

}
