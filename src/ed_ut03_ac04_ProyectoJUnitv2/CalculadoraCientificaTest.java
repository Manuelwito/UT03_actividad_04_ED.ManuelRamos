package ed_ut03_ac04_ProyectoJUnitv2;

import static org.junit.Assert.*;

import java.awt.Menu;
import java.util.InputMismatchException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraCientificaTest {
	
	
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		System.out.println("ejecutando test de arithmeticException");
		CalculadoraCientifica.div(5, 0);
	}
	
	
	@Before
	public void before() {
		System.out.println("Iniciando test");
	}
	
	@After
	public void after() {
		System.out.println("Test finalizado correctamente");
	}
	
	
	@Test
	public void testSuma() {
		System.out.println("Ejecutando test");

		double resultado = CalculadoraCientifica.suma(2, 3);
		double expected = 5;
		assertEquals(expected, resultado, 0.0001);
	}
	@Test
	public void testResta() {
		System.out.println("Ejecutando test");
		double resultado = CalculadoraCientifica.resta(3, 2);
		double expected = 1;
		assertEquals(expected, resultado, 0.0001);
	}
	
	@Test(timeout = 100)
	public void testMultiplicaciones() {
		System.out.println("El siguiente test debe de fallar. Porque TimeOut detiene la ejecución del método");

		CalculadoraCientifica.mult();
		
	}
	
}