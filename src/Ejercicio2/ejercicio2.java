/*
EJERCICIO 2 - Explicacion:
Determine si un numero es impar
*/

package Ejercicio2;

public class ejercicio2 {
    private long number;

    public ejercicio2(long number){
        this.number = number;
    }

    public String detectNumber(){
        String result = ((number % 2) == 0) ? "Es par" : "Es impar";
        return result;
    }
}
