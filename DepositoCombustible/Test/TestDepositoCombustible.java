
import static org.junit.Assert.*;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestDepositoCombustible {


	DepositoCombustible comb;

	
	@Before
	public void testValorInicial() {
		comb = new DepositoCombustible(40,10);
	}
	
	@After
	public void finPruebas(){
		comb=null;
	}
	
	@Test
	public void testGetDepositoNivel() {		
		assertEquals(10,comb.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(40,comb.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		assertFalse(comb.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		assertFalse(comb.estaLleno());
	}
	
	@Test
	public void testFill() {
		
		assertEquals(20,(comb.getDepositoMax()/2),0);
	}
	
	@Test
	public void testConsumir() {
		assertEquals(10,comb.getDepositoNivel(),0);
	}
}
