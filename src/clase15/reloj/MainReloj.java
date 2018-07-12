/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15.reloj;

/**
 *
 * @author SantiagoQuiñones
 */
public class MainReloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(18, -6, 6);
        
        //reloj.setHora(7);
        
        System.out.println(reloj.mostrarTiempo24Horas());
        System.out.println(reloj.mostrarTiempo12Horas());
    }
}
