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
public class Persona {
    private int edad;
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
