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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Silla s=new Silla("A-3","OCUPADO");
//        System.out.println();
//        Sala sal=new Sala("3D",2);
//        sal.agregarSillas();
//        sal.agregarSillas();
//        sal.agregarSillas();
//        sal.eliminarSilla();
//        sal.agregarSillas();
//        System.out.println(sal.tostring());
//        sal.mostrarSillas();
//        //System.out.println(sal.mostrarSilla("A-4"));
       Cine c=new Cine();
       c.agregarPelicula("Emanuelle 3", "3 horas", "Pasion", "DVD", 1);
       System.out.println(c.getPeliculas().get(0).tostring());
    }
    
}
