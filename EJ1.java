package ud1.examen;


import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		// CONTROL DE ACCESO: edadMinima = 18,precioEntrada = 15
		final int EDAD_MINIMA = 18;
		final int PRECIO_ENTRADA = 15;
		Scanner t = new Scanner(System.in); 
		
		int edad;
		
		// Controlamos que si introduce una edad negativa vuelva a pedir la edad, ya que no existen edades negativas
		System.out.println("-- CONTROL DE ACCESO AL EVENTO --");
		do {
			System.out.println("Introduce tu edad");
			edad = t.nextInt();
		}while(edad < 1);
		
		// inicializamos 
		boolean mayorDeEdad = false;
		if(edad  < EDAD_MINIMA) {
			mayorDeEdad = false;
			if(mayorDeEdad == false) {
				System.out.println("Acceso denegado");
			}
		}else {
			mayorDeEdad = true;
			t.nextLine();
			System.out.println("Acceso permitido");
			
			String tiene = "si";
			String noTiene = "no";
			
			System.out.println("¿Tienes invitación?");
			String respuesta = t.nextLine().toLowerCase();
			
			
			if(respuesta.equals(tiene)) {
				System.out.println("Entrada gratuita");
			}else if(respuesta.equals(noTiene)){
				System.out.println("Debes pagar " + PRECIO_ENTRADA + " €");
			}else {
				System.out.println("Retorno esperado es erróneo, debe ser si o no");
			}
			
		}
		
		t.close();	
		
	}
}
