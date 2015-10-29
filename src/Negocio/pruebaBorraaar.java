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
public class pruebaBorraaar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cine c=new Cine();
        c.agregarVendedor("Reyes", "residencias", "312sdkjfhks", 1084255111);        
        c.agregarVendedor("Miguelon", "residencias", "341sdkjfhks", 1084255111);        
        c.agregarVendedor("Faberays", "residencias", "312ddddddddkjfhks", 1084255111);
        System.out.println(c.mostrarVendedor(1084255111));
    }
    
}
