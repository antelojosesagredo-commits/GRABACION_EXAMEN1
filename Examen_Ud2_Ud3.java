package examen_programacion;

import java.util.Scanner;

public class Examen_Ud2_Ud3 {

	// eliminar posibles espacios y mayúscula
	public static String FormateaMatricula(String matricula) {
		return matricula.trim().toUpperCase();
	}
	
	// ValidaMatricula
	public static boolean ValidaMatricula(String matricula) {
		return matricula.matches("^\\d{4}[A-z]{3}$");
	}
	
	// PlazasLibre
	/*public static int PlazasLibre(Integer plazasActualmenteOcupadas) {
		
	}*/
	
	// SumaDigitos
	public static Integer SumaDigitos(String matricula) {
		int digito1 = Integer.parseInt(String.valueOf(matricula.charAt(0)));
		int digito2 = Integer.parseInt(String.valueOf(matricula.charAt(1)));
		int digito3 = Integer.parseInt(String.valueOf(matricula.charAt(2)));
		int digito4 = Integer.parseInt(String.valueOf(matricula.charAt(3)));
		
		int suma = (digito1 + digito2 + digito3 + digito4);
		return suma;
	}
	
	// AsignaPlaza
	public static String AsignaPlaza(String matricula) {
		String plaza = "";
		plaza = plaza + matricula.charAt(6);
		plaza = plaza + SumaDigitos(matricula);
		
		
		return plaza;
	}
	
	// Genera código
	public static String GeneraCodigoAcceso(StringBuilder matricula) {
		String matriculaInverso = matricula.toString();
			
		String codigo = "";
			
		codigo = codigo + matriculaInverso.charAt(6);
		codigo = codigo + matriculaInverso.charAt(5);
		codigo = codigo + matriculaInverso.charAt(4);
		codigo = codigo.concat("-");
		codigo = codigo + SumaDigitos(matriculaInverso);
			
		return codigo;
	}
	
	
	// Exception
	public static void CompruebaPromocion(String matricula) 
			throws ParkingGratisException{
		if(SumaDigitos(matricula) == 20 || matricula.endsWith("DAW") ) {
			throw new ParkingGratisException("Parking gratis de 2h");
		}
	}
	
	
	
	
	// capicua
	/*public static Boolean EsCapicua(String matricula) {
		boolean capicua = Boolean.parseBoolean(matricula);
		StringBuilder sb = new StringBuilder(matricula);
		if(sb.)
	}*/
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String matricula = "";
		while(!matricula.equalsIgnoreCase("fin")) {
			
			System.out.println("Introduzca la matrícula.(o fin para terminar)");
			matricula = teclado.nextLine();
			
			// no sigue el bucle y forzamos a que salga. Nos muestra el syso final
			if(matricula.equalsIgnoreCase("fin")) {
				break;
			}
			
			// Valida y luego formatea
			if(ValidaMatricula(matricula)) {
				matricula = FormateaMatricula(matricula);
				System.out.println("Matrícula formateada: " + FormateaMatricula(matricula));
				System.out.println("Matricula válida");
				
				
				StringBuilder sb = new StringBuilder(matricula);
				System.out.println("Código de acceso: " + GeneraCodigoAcceso(sb));
				
				try {
					CompruebaPromocion(matricula);
					System.out.println("Sin promocion");
				}catch(ParkingGratisException e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				System.out.println("Error: Matrícula no válida");
			}
			
			 System.out.println("Plaza asignada: " + AsignaPlaza(matricula));
		}
		
		// Asignar plaza
		System.out.println("Programa finalizado");
		teclado.close();
	
	}

}

class ParkingGratisException extends Exception{
	public ParkingGratisException(String mensaje) {
		super(mensaje);
	}
}
