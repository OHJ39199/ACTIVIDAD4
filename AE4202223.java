package calculadora;
import java.util.Scanner;

//-----------------------------------
//Clase: AE4202223 
//Fecha: 23/03/2023	
//Autor: Andres Caso Iglesias
//Comentario: programa que realiza las operaciones básicas matemáticas partiendo de dos numeros enteros
//(suma, resta, multiplicación y división)
//metodos:
//	calculoSuma: suma numeros enteros
//	calculoResta: resta numeros enteros
//	calculoMultiplicacion: multiplica numeros enteros
//	calculoDivision: divide numeros enteros
//	calculoDivDec: divide numeros decimales	
//	mostrarResultados: imprime resultados de todos los metodos
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
        int suma = calculoSuma(num1, num2);
        int resta = calculoResta(num1, num2);
        int multiplicacion = calculoMultiplicacion(num1, num2);
        int division = calculoDivision(num1, num2);
        double divisionDecimal = calculoDivDec(num1, num2);
        
        mostrarResultados(suma, resta, multiplicacion, division, divisionDecimal);
	}

	private static void mostrarResultados(int suma, int resta, int multiplicacion, int division,
			double divisionDecimal) {
		// Mostrar los resultados de las operaciones
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
        System.out.println("La division con decimales de los numeros es: " + divisionDecimal);
        System.out.println("Hasta luego");
	}

	private static double calculoDivDec(int num1, int num2) {
		double divisionDecimal = (double) num1 / num2;
		return divisionDecimal;
	}

	private static int calculoDivision(int num1, int num2) {
		int division = num1 / num2;
		return division;
	}

	private static int calculoMultiplicacion(int num1, int num2) {
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}

	private static int calculoResta(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}

	private static int calculoSuma(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}

}
