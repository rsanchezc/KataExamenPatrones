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
				
				case 'V':
						digitoConvertido=5;
						break;
				
				case 'X':
						digitoConvertido=10;
						break;				
				
				case 'L':
						digitoConvertido=50;
						break;
						
				case 'C':
						digitoConvertido=100;
						break;
						
				case 'D':
						digitoConvertido=500;
						break;
						
				case 'M':
						digitoConvertido=1000;
						break;
				}
									
				numeroConvertido = numeroConvertido + digitoConvertido;								
			}
		}
			
		if (numeroConvertido == 4) {
			numeroConvertido = 0;
			System.out.println("Error: numero romano " + romano + " invalido");			
		} 
		
		return numeroConvertido;
	}
		
}
