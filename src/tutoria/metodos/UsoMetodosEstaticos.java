/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.metodos;

/**
 *
 * @author SantiagoQuiñones
 */
public class UsoMetodosEstaticos {
    public static final float IVA = 0.14f;
    
    public static int sumar(int primNum, int segNum){
        return primNum + segNum;
    }
    
    public int restar(int primNum, int segNum){
        return primNum - segNum;
    }
    
    public static void main(String[] args) {
        UsoMetodosEstaticos obj1 = new UsoMetodosEstaticos();
        
        System.out.println(sumar(1, 2));
        System.out.println(obj1.restar(7, 2));
    }
}
