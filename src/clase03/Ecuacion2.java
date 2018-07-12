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
public class Ecuacion2 {
    public static void main(String[] args) {
        // Declaraciones
        float w, z;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de w: ");
        w = teclado.nextFloat();
        
        z = (1 / (float)Math.sqrt(2 * Math.PI) * (float)Math.exp(- Math.pow(w, 2) / 2));
        
        System.out.print("z = " + z);
    }
}
