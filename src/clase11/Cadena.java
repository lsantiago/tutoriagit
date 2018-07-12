/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

/**
 *
 * @author Administrador
 */
public class Cadena {
    static char getChar(String word, int index) {
        return word.charAt(index);
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(getChar("hello", 2)); //should be 'e'
    }
}
