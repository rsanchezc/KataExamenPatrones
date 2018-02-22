package com.cenfotec.patrones.logica;

public class ProcesarRomano {

	private static final int MAX_I = 3;
	private static final int MAX_L = 1;
	private static final int MAX_D = 1;
	private static final int MAX_X = 1;
	private static final int MAX_C = 3;
	
	public int convierte(String romano){
		int numeroConvertido = 0;
		boolean formatoDescendente = true;		
		
		if (romano.length()!=0) {
			int digitoConvertido = 0;			
						
			for (int i=0; i <romano.length(); i++) {										
				digitoConvertido = convertirDigitoRomanoArabico(romano.charAt(i));				
				
				if(formatoDescendente) {																															
						numeroConvertido += digitoConvertido;
				} else {
						formatoDescendente = false;
						numeroConvertido = 0;
						break;			
				}				
				
			}
		}
		if (formatoDescendente == false) {
			System.out.println("Error: numero romano " + romano + " invalido");
		}
			
		if (numeroConvertido == 4) {
			numeroConvertido = 0;
			System.out.println("Error: numero romano " + romano + " invalido");			
		} 
		
		return numeroConvertido;
	}
	
	public int convertirDigitoRomanoArabico (char digito) {
	int digitoConvertido = 0;	
		
		switch(digito) {
		
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
	
		return digitoConvertido;
	}
	
	public boolean validarDescendente(boolean formato) {
		return true;
	}
	
	public boolean validarRepetidos(boolean formato) {
		return true;
	}
}
