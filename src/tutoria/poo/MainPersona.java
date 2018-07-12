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
public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Paula", 12);
        Persona p2 = new Persona("Marco", 50);
        
        //p1.edad = 12;
        p1.establecerEdad(12);
        //p1.nombre = "María";
        p1.establecerNombre("María");
        
        //p2.edad = -20;
        p2.establecerEdad(-20);
        //p2.nombre = "Carlos";
        p2.establecerNombre("Carlos");
        
        p1.caminar();
        p2.caminar();
        
        p1.dormir();
        p2.dormir();
        
        
        System.out.println("Edad de p2: " + p2.obtenerEdad());
        System.out.println("Edad de p1:" + p1.obtenerEdad());
        
        System.out.println(p2);
        
        
    }
}
