/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaración de variables
        int cantNumeros, numero, suma, total;

        suma = 0;

        System.out.print("Cantidad de números: ");
        cantNumeros = teclado.nextInt();

        total = cantNumeros;

        while (total > 0) {
            System.out.print("Ingrese un valor: ");
            numero = teclado.nextInt();

            suma += numero;
            total--;
        }
        System.out.printf("La suma de los %d números es %d\n", cantNumeros,
                suma);
    }
  
}
