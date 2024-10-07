/*
Crear un programa en Java que permita ingresar la cantidad de frutas de
diferentes mercados y halle el promedio de frutas de todos los mercados.

por ejemplo:
frutas1: 500
frutas2: 1000
frutas3: 1050
frutas4: 610
resultados:
promedio: 790
 */
package Clase;
import java.util.Scanner;
public class Problema01 {
    public static void main(String [] args){
        //declarar variables
        int n, frutas;
        double totalfrutas,promediofrutas;
        promediofrutas=0;
        totalfrutas=0;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar la cantidad de mercados:");
        n=lectura.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Ingresar la cantidad de frutas"+(i+1)+":");
            frutas=lectura.nextInt();
            totalfrutas+=frutas;
        }
        //proceso de datos
        promediofrutas=totalfrutas/n;
        //salida de datos
        System.out.println("El promedio de frutas en los mercados es: "+promediofrutas);
    }
}
