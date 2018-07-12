/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13;

/**
 *
 * @author SantiagoQuiñones
 */
public class MainPersona {
    public static void main(String[] args) {
        // Pedro, 21
        Persona pedro = new Persona("Pedro", 21);
        // Ramiro, 20
        Persona ramiro = new Persona("Ramiro", 20);
        // Abigail, 17
        Persona abigail = new Persona("Abigail", 30);
        
        Persona[] personas = {pedro, ramiro, abigail};
        
        System.out.println(contarMayoresA20(personas));
        
    }
    
    public static int contarMayoresA20(Persona[] arr){
        int cantidad = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getEdad() > 20){
                cantidad++;
            }
        }
        
        return cantidad;
    }
}
