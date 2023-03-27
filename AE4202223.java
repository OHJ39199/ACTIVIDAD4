package calculadora;
import java.util.Scanner;

//-----------------------------------
//Clase: AE4202223 
//Fecha: 23/03/2023	
//Fecha modificado: 24/03/2023
//Autor: Andres Caso Iglesias
//Comentario: programa que realiza las operaciones básicas matemáticas partiendo de dos numeros enteros
//(suma, resta, multiplicación y división)
//metodos:
//	calculoSuma: suma numeros enteros
//	calculoResta: resta numeros enteros
//	calculoMultiplicacion: multiplica numeros enteros
//	calculoDivision: divide numeros decimales	
//	mostrarResultados: imprime resultados de todos los metodos
//-----------------------------------
public class AE4202223 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Buenos dias");
		// inicializamos valor num1 y comprobamos que se introduzca numero positivo
		int num1 = -1;
		while (num1 < 0) {
	        System.out.print("Introduzca el primer numero entero positivo: ");
	        num1 = input.nextInt();
	        if (num1 < 0) {
	            System.out.println("El numero introducido es negativo. Porfavor introduce un numero positivo");
	        }
		}
		
		// inicializamos valor num2 y comprobamos que se introduzca numero positivo
		int num2 = -1;
		while (num2 < 0) {
	        System.out.print("Introduzca el segundo numero entero positivo: ");
	        num2 = input.nextInt();
	        if (num2 < 0) {
	        	System.out.println("El numero introducido es negativo. Porfavor introduce un numero positivo");
	        }
        }
        
        // Realizar las operaciones matemáticas básicas
        int suma = calculoSuma(num1, num2);
        int resta = calculoResta(num1, num2);
        int multiplicacion = calculoMultiplicacion(num1, num2);
        double divisionDecimal = calculoDivision(num1, num2);
        
        mostrarResultados(suma, resta, multiplicacion, divisionDecimal);
	}
		
	//metodo calculoSuma
	private static int calculoSuma(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	//metodo calculoResta
	private static int calculoResta(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}
	
	//Metodo calculoMultiplicacion
	private static int calculoMultiplicacion(int num1, int num2) {
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}
	
	//Metodo calculoDivision
	private static double calculoDivision(int num1, int num2) {
		double divisionDecimal = (double) num1 / num2;
		return divisionDecimal;
	}
	
	//Metodo mostrarResultados
	private static void mostrarResultados(int suma, int resta, int multiplicacion, double divisionDecimal) {
		
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division con decimales de los numeros es: " + divisionDecimal);
        System.out.println("Hasta luego");
	}
}
