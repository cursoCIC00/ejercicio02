package es.cic.taller.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JuanTest {

	private Juan sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Juan();
	}

	@Test
	public void testSuma() {
		double res = sut.suma(5.6, 4.2);
		
		assertEquals(9.8, res, 0.00001);
	}

}
