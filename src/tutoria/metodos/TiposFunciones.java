/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.metodos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class TiposFunciones {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        
        if(esMayorDeEdad(edad)){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("No es mayor de edad.");
        }*/
        
        /*
        for (int i = 1; i <= 100; i++) {
            if(!esPar(i)){
                System.out.println(i);
            }
        }*/
        
        System.out.println(obtenerMayor(obtenerMayor(5, 7), 
                obtenerMayor(8, 1)));
        
        saludo("Santiago");
        
        int[][] A = {{1, 5},{3, 2}};
        int[][] B = {{3, 4, 1}, {2, 3, 4}, {1, 1, 1}};
        
        System.out.println("A");
        imprimirMatriz(A);
        System.out.println("B");
        imprimirMatriz(B);
        System.out.println(obtenerSumaMatriz(A));
        
        
    }
    
    
    static int obtenerSumaMatriz(int[][] M){
        int suma = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                suma = suma + M[i][j];
            }
            
        }
        return suma;
    }
    static boolean esMayor(int x, int y){
        return x > y ? true : false; 
    }
    
    static boolean esMayorDeEdad(int edad){
        return edad >= 18 ? true : false;
    }
    
    static boolean esPar(int num){
        return num % 2 == 0 ? true : false;
    }
    
    static int obtenerMayor(int a, int b){
        return a > b ? a : b;
    }
    
    static void saludo(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
