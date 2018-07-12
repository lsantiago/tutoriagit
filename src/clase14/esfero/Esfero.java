/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14.esfero;

/**
 *
 * @author SantiagoQuiñones
 */
public class Esfero {
    private String modelo;
    private String color;
    private float punta;
    private int carga;
    private boolean tapado;
    
    // métodos especiales
    public Esfero(){
        this.tapado = false;
        this.carga = 1;
    }
    
    public Esfero(String modelo){
        setModelo(modelo);
    }

    public Esfero(String modelo, String color, float punta, int carga, boolean tapado) {
        this.modelo = modelo;
        this.color = color;
        this.punta = punta;
        this.carga = carga;
        this.tapado = tapado;
    }
    
    
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPunta() {
        return punta;
    }

    public void setPunta(float punta) {
        this.punta = punta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTapado() {
        return tapado;
    }

    private void setTapado(boolean tapado) {
        this.tapado = tapado;
    }
    
    
    
    
    public String rayar(){
        if(this.tapado == true){
            return "Error, no se puede escribir";
        }
        
        return "Rayando";
    }
    
    public void tapar(){
        //this.tapado = true;
        setTapado(true);
    }
    
    public void destapar(){
        setTapado(false);
    }
    
}
