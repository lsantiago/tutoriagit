/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

import java.io.IOException;

/**
 *
 * @author SantiagoQuiñones
 */
public class Maquina {
    private String nombreSistemaOperativo;
    private String comando;
    
    public Maquina(){
        nombreSistemaOperativo = System.getProperty("os.name");
        comando = "";
    }
    
    void apagar(int tiempo){
        if(nombreSistemaOperativo.contains("Windows")){
            comando = "shutdown /s /t " + tiempo;
        }else if(nombreSistemaOperativo.contains("Linux")){
            comando = "shutdown -h now";
        }else{
            System.err.println("Sistema operativo no soportado");
        }
        
        ejecutarComando(comando);
    }
    
    private void ejecutarComando(String comando){
        try {
          Runtime.getRuntime().exec(comando);    
        } catch (IOException ioException) {
          System.err.println("Error al ejecutar el comando.");
        }
    }
    
    public static void main(String[] args) {
        Maquina maquinita = new Maquina();
        maquinita.apagar(12);
    }
    
}
