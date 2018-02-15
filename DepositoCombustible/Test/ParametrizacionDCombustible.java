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
	private DepositoCombustible pdc;
	
	@Before
	public void inicio(){
		pdc = new DepositoCombustible(depMax,depNivel);
	}
	
	@After
	public void fin(){
		pdc = null;
	}
	
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
			
		double resultado = pdc.getDepositoNivel();
		//System.out.println(""+depNivel);
		assertEquals(depNivel,resultado,0);		
	}
	
	@Test
	public void testGetDepositoMax() {			
		
		double resultado = pdc.getDepositoMax();
		assertEquals(depMax,resultado,0);
	}

	@Test
	public void testEstaVacio() {		
		
		boolean vacio = pdc.estaVacio();
		if (depNivel != 0)		
		assertTrue(false);		
	}	
	
	@Test
	public void testDepositoMitad() {		
		
		double mitad = pdc.getDepositoMax()/2;
		assertEquals(depNivel,mitad,0);
	}	

}
