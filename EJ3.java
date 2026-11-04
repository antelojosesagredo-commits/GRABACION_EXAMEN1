package ud1.examen;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		// ALTO Y ANCHO = 6 CARACTERES
		// ELEGIR SI 1: ATERISCO, 2 ALMOADILLA
		
		final int ALTO = 6;
		final int ANCHO = 6;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Elija que caracter quiere para dibujar la Z: 1: *, 2: #");
		int numeroCaracter;
		
		numeroCaracter = t.nextInt();
		
		switch(numeroCaracter){
		
		case 1 :
			
			// for de filas
			for(int i = 0; i < ALTO; i++) {
				// for de columnas
				for(int j = 0; j < ANCHO; j++) {
					// para dibujar el caracter si se cumple el if
					if(i == 0 || i == ALTO - 1 || i + j == ALTO - 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
		case 2:
			// for de filas
			for(int i = 0; i < ALTO; i++) {
							// for de columnas
				for(int j = 0; j < ANCHO; j++) {
					
					// para dibujar el caracter si se cumple el if
					if(i == 0 || i == ALTO - 1 || i + j == ALTO - 1) {
						System.out.print("#");
						
					// para que sea un espacio en caso de que no se cumpla
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			break;
			
		default:
			System.out.println("Retorno esperado erróneo. Se espera un 1 o un 2");
		}
		
		t.close(); // cerramos el teclado

	}

}
