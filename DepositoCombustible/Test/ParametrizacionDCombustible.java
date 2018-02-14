import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParametrizacionDCombustible {

	private double depMax;	//propiedades para las pruebas	
	private double depNivel;     //propiedades para las pruebas
	private double consumo;
	
	DepositoCombustible pdc = new DepositoCombustible(40,depNivel);
	
	public ParametrizacionDCombustible(double n, double m, double c)  //Constructor necesario para la prueba
	{
		this.depMax = n;
		this.depNivel = m;		
		this.consumo = c;
	}
	
	@Parameters    //En este metodo introduciremos  la bateria de pruebas	
	public static Collection<Object[]> pruebasConsumo()	{
		//Bateria de pruebas a realizar
		return Arrays.asList( new Object[][]{{40,20,10}} );		
	}
	
	@Test
	public void testGetDepositoNivel() {		
		double resultado = pdc.getDepositoNivel();		
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
