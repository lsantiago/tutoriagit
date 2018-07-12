/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14.esfero;

/**
 *
 * @author SantiagoQuiñones
 */
public class MainEsfero {
    public static void main(String[] args) {
        Esfero esfero1 = new Esfero("bic", "azul", 0.5f, 100, false);
        //esfero1.color = "azul";
        System.out.println(esfero1.getColor());
        esfero1.setColor("verde");
        System.out.println(esfero1.getColor());
        
        
        //esfero1.punta = 0.5f;
        esfero1.setPunta(0.5f);
        //esfero1.tapado = false;
        esfero1.tapar();
        System.out.println("Esfero1: " + esfero1.rayar());
        System.out.println(esfero1.getModelo());
        
        Esfero esfero2 = new Esfero();
        esfero2.setColor("rojo");
        esfero2.setPunta(1);
        esfero2.destapar();
        System.out.println("Esfero2: " + esfero2.rayar());
        
        
        
        
    }
}
