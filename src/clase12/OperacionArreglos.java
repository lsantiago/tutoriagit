/*
/*
Elabore un programa en pseducodigo que trabaje con un arreglo de números enteros de longitud 4 y que permita al usuario ingresar los valores en cada posición del arreglo. Además su programa deberá tener dos métodos, uno que reciba como argumento un arreglo de números enteros y que devuelva como resultado el promedio de los elementos del arreglo y otro método que reciba como parámetros un arreglo de números enteros y un número real, este método debe devolver la suma de todos los elementos que son menores al número real. Para probar ambos métodos, utilice el mismo arreglo y como número real, para el segundo método, use el valor que devuelve el primer método.

Solución:

Algoritmo Operaciones con Arreglos
	Método principal
		Declaraciones
			Variables
				datos: Arreglo[4] Entero
				i: Entero
				promedio: Real
				cantMenores: Entero
	
	FOR i = 0; i < 4; i++
		Leer datos[i]
  ENFOR

  promedio = obtenerPromedio(datos)
  cantMenores = obtenerCantMenores(datos, promedio)

  Imprimir promedio, cantMenores

	Fin Método principal
	
	Método obtenerPromedio(A: arreglo[4] Enteros): Real
		Declaraciones
			Variables
				suma, i: Entero
		suma = 0
		
		FOR i = 0; i < 4; i++
			suma = suma + A[i]
    ENDFOR

    return suma / 4
  Fin Método obtenerPromedio

	Método obtenerCantMenores(A: arreglo[4] Enteros, prom: Real): Entero
 		Declaraciones
			Variables
				cont: Entero
		cont = 0
    
		FOR i = 0; i < 4; i++
			IF A[i] < prom THEN
				cont = cont + 1
			ENDIF
		ENDFOR

		return cont
	Fin Método obtenerCantMenores
Fin Algoritmo

*/

package clase12;

import java.util.Scanner;

/**
 *
 * @author SantiagoQuiñones
 */
public class OperacionArreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] datos = new int[4];
        float promedio;
        int cantMenores;
        
        // lectura de datos
        for (int i = 0; i < datos.length; i++) {
            System.out.print("A[" + i + "]: ");
            datos[i] = teclado.nextInt();
        }
        
        promedio = obtenerPromedio(datos);
        cantMenores = obtenerCantMenores(datos, promedio);
        
        System.out.printf("Promedio: %f\nCant. menores: %d\n", 
                promedio, cantMenores);
        
    }
    
    static float obtenerPromedio(int[] datos){
        int suma = 0;
        
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        
        return suma / datos.length;
        
    }
    
    static int obtenerCantMenores(int[] datos, float prom){
        int cont = 0;
        
        for (int i = 0; i < datos.length; i++) {
            if(datos[i] < prom){
                cont++;
            }
        }
        
        return cont;
    }
    
    static int obtenerMayor(int[] datos){
        int mayor = datos[0];
        
        for (int i = 1; i < datos.length; i++) {
            if(datos[i] > mayor){
                mayor = datos[i];
            }
        }
        
        return mayor;
    }
    
}
