package calculadora;
import java.util.Scanner;

//-----------------------------------
//Clase: AE4202223 
//Fecha: 23/03/2023	
//Autor: Andres Caso Iglesias
//Comentario: programa que realiza las operaciones básicas matemáticas partiendo de dos numeros enteros
//(suma, resta, multiplicación y división)
//-----------------------------------

public class AE4202223 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Buenos dias");
        System.out.print("Introduzca el primer numero entero positivo: ");
        int num1 = input.nextInt();

        System.out.print("Introduzca el segundo numero entero positivo: ");
        int num2 = input.nextInt();

        // Realizar las operaciones matemáticas básicas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        double divisionDecimal = (double) num1 / num2;

        // Mostrar los resultados de las operaciones
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
        System.out.println("La division con decimales de los numeros es: " + divisionDecimal);
        System.out.println("Hasta luego");
	}

}
