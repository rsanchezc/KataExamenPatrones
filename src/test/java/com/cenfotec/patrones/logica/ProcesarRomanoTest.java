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
	
	@Test
	public void testRomanoII() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(2, convierteTest.convierte("II"),0);
	}
	
	@Test
	public void testRomanoIII() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(3, convierteTest.convierte("III"),0);
	}
	
	@Test
	public void testRomanoIIII() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(0, convierteTest.convierte("IIII"),0);
	}
	
	@Test
	public void testRomanoV() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(5, convierteTest.convierte("V"),0);
	}
	
	@Test
	public void testRomanoX() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(10, convierteTest.convierte("X"),0);
	}
}
