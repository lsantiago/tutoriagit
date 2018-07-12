/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

/**
 *
 * @author Administrador
 */
public class SumaGauss {
    public static void main(String[] args) {
        int cont = 0;
        int suma = 0;
        
        do{
            cont++;
            suma = suma + cont;
            System.out.println(cont);
        }while(cont < 1000000);
        
        System.out.println("Suma: " + suma);
    }
}
