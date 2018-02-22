package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesarRomanoTest {

	@Test
	public void testRomanoVacio() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(0, convierteTest.convierte(""),0);
	}

	@Test
	public void testRomanoI() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(1, convierteTest.convierte("I"),0);
	}
}
