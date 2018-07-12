/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase09;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class OrdenarArreglo {
    public static void main(String[] args) {
        int[] edades = {5, 1, 2, 7, 8, 10};
        
        Arrays.sort(edades);
        
        System.out.println("Edades: ");
        for (int edad: edades) {
            System.out.println(edad);
        }
        
    }
}
