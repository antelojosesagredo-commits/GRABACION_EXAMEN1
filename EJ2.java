package ud1.examen;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// Adivinar la temperatura actual: Es 22ºC, el usuario tendrá 6 intentos máximos
		final int TEMPERATURA = 22;
		final int INTENTOS = 6;
		int entradaIntento = 0;
		float temperaturaMedia = 0;
		Scanner t = new Scanner(System.in);
		
		System.out.println("¿Desea recibir ayuda? (true/false):");
		
		String quiere = "true";
		String noQuiere = "false";
		String respuesta = t.nextLine().toLowerCase();
		
		int contadorIntentos = 0;
		
		if(respuesta.equals(quiere)) {
			while(entradaIntento != TEMPERATURA && contadorIntentos < INTENTOS) {
				System.out.println("Introduce la temperatura");
				entradaIntento = t.nextInt();
				contadorIntentos++;
				temperaturaMedia += entradaIntento;
				
				if(entradaIntento > TEMPERATURA) {
					
					System.out.println("Temperatura incorrecta");
					System.out.println("Intentos restantes: " + (INTENTOS - contadorIntentos));
					System.out.println("Pista: la temperatura es menor");
				}else if(entradaIntento < TEMPERATURA) {
					System.out.println("Temperatura incorrecta");
					System.out.println("Intentos restantes: " + (INTENTOS - contadorIntentos));
					System.out.println("Pista: la temperatura es mayor");
				}
				
			}
			if(entradaIntento == TEMPERATURA) {
				System.out.println("Temperatura correcta");
				System.out.println("Has alcanzado la temperatura correcta");
				System.out.println("Intentos utilizados: " + contadorIntentos);
				System.out.printf("Temperatura media introducida : %.2f", (temperaturaMedia/contadorIntentos));
			}else{
				System.out.println("No has acertado la temperatura correcta.");
				System.out.printf("Temperatura media introducida : %.2f", (temperaturaMedia/contadorIntentos));
			}
			
			
		}else if(respuesta.equals(noQuiere)) {
			
			while(entradaIntento != TEMPERATURA && contadorIntentos < INTENTOS) {
				System.out.println("Introduce la temperatura");
				entradaIntento = t.nextInt();
				contadorIntentos++;
				temperaturaMedia += entradaIntento;
				
				if(entradaIntento != TEMPERATURA) {
					System.out.println("Temperatura incorrecta");
					System.out.println("Intentos restantes: " + (INTENTOS - contadorIntentos));
				}
					
			}
			if(entradaIntento == TEMPERATURA) {
				System.out.println("Temperatura correcta");
				System.out.println("Has alcanzado la temperatura correcta");
				System.out.println("Intentos utilizados: " + contadorIntentos);
				System.out.printf("Temperatura media introducida : %.2f", (temperaturaMedia/contadorIntentos));
			}else{
				System.out.println("No has acertado la temperatura correcta.");
				System.out.printf("Temperatura media introducida : %.2f", (temperaturaMedia/contadorIntentos));
			}
			
			
		}else {
			System.out.println("ERROR. Retorno esperado: true / false");
		}
		
		t.close();
		
		

	}

}
