package com.cenfotec.patrones.logica;

public class ProcesarRomano {

	public int convierte(String romano){
		int numeroConvertido = 0;
		
		if (romano.length()!=0) {
			int digitoConvertido = 0;
			
			for (int i=0; i <romano.length(); i++) {
				switch(romano.charAt(i)) {
				
				case 'I':				
						digitoConvertido=1;
						break;							
				}
				numeroConvertido = numeroConvertido + digitoConvertido;
			}
		}
		
		return numeroConvertido;
	}
		
}
