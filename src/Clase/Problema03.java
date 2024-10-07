/*
Crear un programa en Java que permita ingresar la cantidad hijos que tiene
el trabajador, halle el promedio de hijos.

por ejemplo:
chijos1: 1
chijos2: 3
chijos3: 0
chijos4: 4
resultados:
promedio: 2
 */
package Clase;
import java.util.Scanner;
public class Problema03 {
    public static void main(String [] args){
        //declarar variables
        int n, chijos;
        double totalhijos,promediohijos;
        promediohijos=0;
        totalhijos=0;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar la cantidad de datos a ingresar");
        n=lectura.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Ingresar la cantidad de hijos"+(i+1)+":");
            chijos=lectura.nextInt();
            totalhijos+=chijos;
        }
        //proceso de datos
        promediohijos=totalhijos/n;
        //salida de datos
        System.out.println("El promedio de hijos de los trabajadores es: "+promediohijos);
    }
}
