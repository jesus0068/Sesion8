/*
Crear un programa en Java que permita ingresar los años de servicio de los
trabajadores para hallar el promedio.

por ejemplo:
añosev1: 20
añosev2: 15
añosev3: 10
añosev4: 4
añosev5: 1
resultados:
promedio: 10
 */
package Clase;
import java.util.Scanner;
public class Problema02 {
    public static void main(String [] args){
        //declarar variables
        int n, añosev;
        double totalaños,promedioaños;
        promedioaños=0;
        totalaños=0;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar la cantidad de datos a ingresar");
        n=lectura.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Ingresar la cantidad de años de servicio"+(i+1)+":");
            añosev=lectura.nextInt();
            totalaños+=añosev;
        }
        //proceso de datos
        promedioaños=totalaños/n;
        //salida de datos
        System.out.println("El promedio de años de servicio es: "+promedioaños);
    }
}
