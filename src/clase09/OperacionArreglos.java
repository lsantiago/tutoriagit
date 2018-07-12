/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase09;

/**
 *
 * @author Administrador
 */
public class OperacionArreglos {
    public static void main(String[] args) {
        String[] categorias = {"Acción", "Comedia", "Drama", "Terror"};
        
        System.out.println("Nro. de categorias: " + categorias.length);
        
        System.out.println("Primera categoría: " + categorias[0]);
        System.out.println("Última categoría:" + categorias[3]);
        
        System.out.println("Long. de la primera categoría: " + categorias[0].length());
        
        // imprime las categorías
        System.out.println("Categorías: ");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println(categorias[i]);
        }
        
        // imprime las categorías con un for mejorado
        System.out.println("Categorías: ");
        for(String categoria: categorias){
            System.out.println(categoria);
        }
        
        
    }
}
