/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.poo;

/**
 *
 * @author SantiagoQuiñones
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(int edad) {
        this.edad = edad;
    }
    
    
    // set para el atributo nombre
    public void establecerNombre(String n){
        nombre = n;
    }
    
    
    
    // get para el atributo nombre
    public String obtenerNombre(){
        return nombre;
    }
    
    // set para el atributo edad
    public void establecerEdad(int e){
        if(e >= 0){
          edad = e;
        }else{
            System.out.println("Edad incorrecta.");
        }
        
    }
    
    // get para el atributo edad
    public int obtenerEdad(){
        return edad;
    }
    
    public void caminar(){
        System.out.println(nombre + " está caminando");
    }
    
    public void dormir(){
        System.out.println(nombre + " está durmiendo Zzzzz");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
