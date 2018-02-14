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

	
	private double depNivel;     //propiedades para las pruebas
	private double depMax;	//propiedades para las pruebas
	//private double res;      //resultado esperado
	
	DepositoCombustible pdc = new DepositoCombustible(depNivel,depMax);
	
	public ParametrizacionDCombustible(double n, double m)  //Constructor necesario para la prueba
	{
		this.depNivel = n;
		this.depMax = m;
		//this.res = res;
	}
	
	@Parameters    //En este metodo introduciremos la bateria de pruebas	
	public static Collection<Object[]> pruebasConsumo()	{
		//Bateria de pruebas a realizar
		return Arrays.asList( new Object[][]{{30,40}} );
	}
	
	@Test
	public void testGetDepositoNivel() {
		pdc.fill(depNivel);
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
		assertFalse(pdc.estaVacio());
	}	
	
	@Test
	public void testDepositoMitad() {
		
		assertEquals(20,(pdc.getDepositoMax()/2),0);
	}	

}
