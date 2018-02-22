package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesarRomanoTest {

	@Test
	public void test() {
		ProcesarRomano convierteTest = new ProcesarRomano();
		assertEquals(0, convierteTest.convierte(""),0);
	}

}
