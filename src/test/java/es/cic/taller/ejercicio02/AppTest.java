package es.cic.taller.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testOperar() {
		App sut = new App();
		
		assertEquals(7, sut.operar());
	}

}
