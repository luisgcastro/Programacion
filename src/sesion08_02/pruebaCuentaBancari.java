package sesion08_02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class pruebaCuentaBancari {

	CuentaBancaria cuenta;
	CuentaBancaria cuenta2;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClasss");
	}
	
	@Before
	public void before() {
		System.out.println("before");
		cuenta = new CuentaBancaria();
		cuenta2 = new CuentaBancaria();
	}
	
	@After
	public void after() {
		System.out.println("Fin prueba unitaria");
	}

	
	 
	
	 public void testIngresoEnCuenta1Vez() {
	  System.out.println("prueba testIngresoEnCuenta1Vez");
	  cuenta.realizarIngreso(1000); int expected_value = 1000;
	  assertEquals(expected_value, cuenta.getCuantia()); }
	  
	
	 
}
