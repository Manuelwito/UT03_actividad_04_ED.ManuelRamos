package ed_ut03_ac04_ProyectoJUnitv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCientifica {

	static Scanner teclado;
	static double num1, num2;

	/**
	 * Método principal de la clase que lanza el programa calculadora
	 * 
	 * @param args argumentos que recibe de la línea de comandos
	 */
	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			try {
				opcion = menu();
			} catch (InputMismatchException e) {
				teclado.next();
				opcion = 0;
			}
		} while (opcion == 0);
	}

	/**
	 * Método que imprime un menú y recoge la opción del usuario
	 * 
	 * @return opción escogida por el usuario, cero en caso de error
	 * @throws InputMismatchException si mete el usuario algo que no es un número
	 */
	public static int menu() {
		int opcion = 0;

		System.out.println("Elige la operación a realizar (pulsa la tecla número)");
		System.out.println("-------------------------------------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("-------------------------------------");

		try {
			opcion = teclado.nextInt();
		} catch (InputMismatchException e) {
			throw e;
		}

		switch (opcion) {
		case 1:
			suma(num1, num2);
			break;
		case 2:
			resta(num1, num2);
			break;
		case 3:
			mult();
			break;
		case 4:
			div(num1, num2);
			break;

		default:
			System.out.println("respuesta incorrecta");
			break;
		}

		return opcion;
	}

	// metodo primero para hacer las sumas
	public static double suma(double num1, double num2) {

		System.out.println("------------------------SUMAR-------------------");
	//	char respuesta;
	//	double resultados;
	//	do {
		//	System.out.println("Introduce un número: ");
		//	num1 = teclado.nextDouble();
		//	System.out.println("Introduce el segundo");
		//	num2 = teclado.nextDouble();
	//		resultados = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = "+ (num1 + num2));

	//		System.out.println("¿Desea sumar otro número? s/n");
	//		respuesta = teclado.next().charAt(0);
	//	} while (respuesta == 's' || respuesta == 'S');

		return num1+num2;
		
	}

	public static double resta(double num1, double num2) {

		System.out.println("------------------------RESTAR-------------------");
	//	char respuesta;
	//	double resultados;
	//	do {
		//	System.out.println("Introduce un número: ");
		//	num1 = teclado.nextDouble();
		//	System.out.println("Introduce el segundo");
		//	num2 = teclado.nextDouble();
	//		resultados = num1 - num2;
			System.out.println(num1 + " + " + num2 + " = "+ (num1 - num2));

	//		System.out.println("¿Desea restar otro número? s/n");
	//		respuesta = teclado.next().charAt(0);
	//	} while (respuesta == 's' || respuesta == 'S');

		return num1-num2;
		
	}


	public static float mult() {

		System.out.println("------------------------MULTIPLICIÓN-------------------");
		char respuesta;
		do {
			System.out.println("Introduce un número: ");
			float num1, num2, resultado; // Variables para los números que vamos a multiplicar
			num1 = teclado.nextFloat();
			System.out.println("Introduce el segundo");
			num2 = teclado.nextFloat();
			resultado = num1 * num2;
			System.out.println(num1 + " x " + num2 + " = " + resultado);

			System.out.println("¿Desea multiplicar otros números? s/n");
			respuesta = teclado.next().charAt(0);
		} while (respuesta == 's' || respuesta == 'S');

		return menu();
	}

	public static double div(double num1, double num2) {

		System.out.println("------------------------DIVISIÓN-------------------");
		//char respuesta;
		//do {
		//	System.out.println("Introduce un numero: ");
		//	float num1, num2, resultado; // Variables para los números que vamos a sumar
		//	num1 = teclado.nextFloat();
		//	System.out.println("Introduce el divisor");
		//	num2 = teclado.nextFloat();
		//	resultado = num1 / num2;
		if (num2 == 0) {
			throw new ArithmeticException("Error en el segundo número, no se puede dividir por cero");
		}
		
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			
			
	//		System.out.println("¿Desea divir otro números? s/n");
	//		respuesta = teclado.next().charAt(0);
	//	} while (respuesta == 's' || respuesta == 'S');

		return num1 / num2;
	}

}
