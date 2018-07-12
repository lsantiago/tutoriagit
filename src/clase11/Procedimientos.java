/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

/**
 *
 * @author Administrador
 */
public class Procedimientos {
    /*static void suma(int a, int b){
        System.out.println("Método suma");
        int s = a + b;
        System.out.println(s);
        
    }*/
    
    static int suma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Método principal");
        int sm = suma(5, 2);
        System.out.println(sm);
        
    }
    
    
}
