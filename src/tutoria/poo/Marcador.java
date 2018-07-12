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
public class Marcador {
    private String marca;
    private String color;
    private float peso;

    public Marcador() {
       this.marca = "snowman";
       this.color = "azul";
       this.peso = 12.2f;
    }

    public Marcador(String marca, String color, float peso) {
        this.marca = marca;
        this.color = color;
        this.peso = peso;
    }

    public Marcador(String marca) {
        this.marca = marca;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
   
    
    
}
