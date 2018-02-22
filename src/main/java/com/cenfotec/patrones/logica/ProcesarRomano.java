package com.cenfotec.patrones.logica;

public class ProcesarRomano {

	public int convierte(String romano){
		int numeroConvertido = 0;
		
		if (romano.length()!=0) {						
			switch(romano) {
			
			case "I":				
					numeroConvertido=1;
					break;							
			}
		}
		
		return numeroConvertido;
	}
		
}
