/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.poo;

/**
 *
 * @author SantiagoQuiñones
 */
public class Main {
    public static void main(String[] args) {
        Marcador marcador1 = new Marcador();
        Marcador marcador2 = new Marcador("bic", "gris", 10.3f);
        Marcador marcador3 = new Marcador("treschanchitos", "amarillo", 12.3f);
        
        marcador1.setColor("rojo");
        //marcador3.setMarca("bic");
        System.out.println(marcador1.getPeso());
        System.out.println(marcador1.getColor());
        System.out.println(marcador3.getPeso());
        System.out.println(marcador3.getMarca());
        
    }
 
}
