/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ecuacion {
    public static void main(String[] args) {
        // Declaraciones
        float x, y;
        
        // Objeto para interactuar con el teclado. 
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextFloat();
        
        y = 3 * (float)Math.pow(x, 2) + (7 * x) - 15;
        
        System.out.println("y = " + y);
    }
}
