/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.series;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Serie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaraciones
        int limite;
        int nroTerminos = 0;
        int genNum = 1;
        boolean esPrimo;
        int secuenciaTres = 1;
        int indice;
        float sumatoria = 0.0f;
        float termino;
        
        // validación del límite
        do {
            // ingreso del límite
            System.out.print("Límite: ");
            limite = sc.nextInt();
            
            // alerta si ingresa un límite incorrecto
            if(limite <= 0){
                System.out.println("Límite incorrecto, vuelva a intentarlo");
            }
        } while (limite <= 0);
        
        
        while(nroTerminos < limite){
            genNum++;
            esPrimo = true;
            
            // determina si genNum es o no un número primo
            for (int div = 2; div <= Math.sqrt(genNum) && esPrimo; div++) {
                if(genNum % div == 0){
                    esPrimo = false;
                }
            }
            
            // genera el término de la serie
            if(esPrimo){
                // términos en posiciones par (1er. termino ocupa posición 0)
                if(nroTerminos % 2 == 0){
                    indice = secuenciaTres - 1;
                    System.out.printf("(%d/%d)^%d\n", 
                            genNum, secuenciaTres, indice);
                    termino = (float)Math.pow((float)genNum / secuenciaTres, indice);
                }else{
                    indice = secuenciaTres - 2;
                    System.out.printf("(%d/%d)^(1/%d)\n", 
                            secuenciaTres, genNum, indice);
                    termino = (float)Math.pow((float)secuenciaTres / genNum, 1.0/indice);
                }
                
                sumatoria += termino;
                
                secuenciaTres+=3;
                nroTerminos++;    
            }
            
            
        }
        
        System.out.println("Sumatoria = " + sumatoria);
        
        
        
    }
}
