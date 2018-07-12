/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

import javax.swing.JOptionPane;



/**
 *
 * @author Administrador
 */
public class EntradaySalida {
    public static void main(String[] args) {
        String txtEdad;
        int edad;
        
        txtEdad = JOptionPane.showInputDialog("Ingrese su edad");
        edad = Integer.parseInt(txtEdad);
        
        JOptionPane.showMessageDialog(null, "Su edad es:" + edad,
                "Resultado", JOptionPane.ERROR_MESSAGE);
        
    }
}
