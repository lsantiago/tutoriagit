/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.metodos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author SantiagoQuiñones
 */
public class Redondeo {
    
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        
        System.out.println("Size: " + nombres.size());
        
        System.out.println("Lista de nombres: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // primer nombre de la lista
        //System.out.println(nombres.get(0));
        System.out.println(nombres);
        nombres.remove("Juan");
        
        System.out.println("Lista de nombres modificado: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("Size: " + nombres.size());
        
        System.out.println(nombres);
        
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }
    
}
