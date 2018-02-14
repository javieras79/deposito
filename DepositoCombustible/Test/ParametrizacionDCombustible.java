import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class ParametrizacionDCombustible {

	private double depMax;	//propiedades para las pruebas	
	private double depNivel;     //propiedades para las pruebas
		
	public ParametrizacionDCombustible(double n, double m)  //Constructor necesario para la prueba
	{
		this.depMax = n;
		this.depNivel = m;		
		
	}
	
	@Parameters    //En este metodo introduciremos  la bateria de pruebas	
	public static Collection<Object[]> pruebasConsumo()	{
		//Bateria de pruebas a realizar
		return Arrays.asList( new Object[][]{{30,15}} );		
	}
	
	@Test
	public void testGetDepositoNivel() {		
		DepositoCombustible pdc = new DepositoCombustible(depMax,depNivel);	
		double resultado = pdc.getDepositoNivel();			
		assertEquals(depNivel,resultado,0);		
	}
	
	@Test
	public void testGetDepositoMax() {			
		DepositoCombustible pdc = new DepositoCombustible(depMax,depNivel);
		double resultado = pdc.getDepositoMax();
		assertEquals(depMax,resultado,0);
	}

	@Test
	public void testEstaVacio() {		
		DepositoCombustible pdc = new DepositoCombustible(depMax,depNivel);
		boolean vacio = pdc.estaVacio();
		if (depNivel != 0)		
		assertTrue(false);		
	}	
	
	@Test
	public void testDepositoMitad() {		
		DepositoCombustible pdc = new DepositoCombustible(depMax,depNivel);
		double mitad = pdc.getDepositoMax()/2;
		assertEquals(depNivel,mitad,0);
	}	

}
