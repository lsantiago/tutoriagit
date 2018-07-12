/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14.banco;

/**
 *
 * @author SantiagoQuiñones
 */
public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria p1 = new CuentaBancaria();
        p1.setNumeroCuenta(1111);
        p1.setPropietario("Juan");
        System.out.println(p1.abrirCuenta("CC"));
        System.out.println(p1.retirar(15));
        
        System.out.println(p1.estadoActual());
        
        
        CuentaBancaria p2 = new CuentaBancaria();
        p2.setNumeroCuenta(2222);
        p2.setPropietario("María");
        System.out.println(p2.abrirCuenta("CA"));
        System.out.println(p2.estadoActual());
        
        
    }
}
