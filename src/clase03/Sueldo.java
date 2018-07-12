/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import java.util.Scanner;
/**
 * Programa para determinar el sueldo de un empleado
 * @author Santiago Quiñones
 */

public class Sueldo {
    // Método principal
    public static void main(String[] args) {
        // Declaraciones
        int horasTrab; 
        float costoHora;
        //String nombreEmp;
        float sueldoEmp;
        
        // Objeto para interactuar con el teclado
        Scanner teclado = new Scanner(System.in);
        
        // Lectura de datos
        System.out.print("Ingrese el número de horas trabajadas: ");
        horasTrab = teclado.nextInt();
        
        System.out.print("Ingrese el costo por hora: ");
        costoHora = teclado.nextFloat();
        
        // Cálculo del sueldo
        sueldoEmp = horasTrab * costoHora;
        
        // Salida de datos
        System.out.println("Sueldo = " + sueldoEmp);
        
    }
}
