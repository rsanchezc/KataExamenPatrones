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
	
	@Test
	public void testRomanoL() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(50, convierteTest.convierte("L"),0);
	}
	
	@Test
	public void testRomanoC() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(100, convierteTest.convierte("C"),0);
	}
	
	@Test
	public void testRomanoD() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(500, convierteTest.convierte("D"),0);
	}
	
	@Test
	public void testRomanoM() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(1000, convierteTest.convierte("M"),0);
	}
	
	@Test
	public void testRomanoPruebaLX() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(60, convierteTest.convierte("LX"),0);
	}
	
	@Test
	public void testRomanoPruebaXVI() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(16, convierteTest.convierte("XVI"),0);
	}
	
	@Test
	public void testRomanoPruebaVIII() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(8, convierteTest.convierte("VIII"),0);
	}
	
	@Test
	public void testRomanoPruebaXXI() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(21, convierteTest.convierte("XXI"),0);
	}
	
	@Test
	public void testRomanoPruebaCI() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(101, convierteTest.convierte("CI"),0);
	}
	
	@Test
	public void testRomanoPruebaCLXI() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(161, convierteTest.convierte("CLXI"),0);
	}
}
