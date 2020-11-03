package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		System.out.println("  __♥_                                      __♥__");
		System.out.println(" ( ___ )-------´*•.¸(*•.¸♥¸.•*´)¸.•*´----- ( ___ )");
		System.out.println("  | ♥ |  ╔════════════════════════════════╗ | ♥ |");
		System.out.println("  | ♥ |  ║  AUTOR:  MADELEM CHICO VELASCO ║ | ♥ |");
		System.out.println("  | ♥ |  ║   FECHA:    31-OCTUBRE-2020    ║ | ♥ |");
		System.out.println("  | ♥ |  ║      PROGRAMA DE ING. SISTEMAS ║ | ♥ |");
		System.out.println("  | ♥ |  ║             ID: 759383         ║ | ♥ |");
		System.out.println("  |___|  ╚════════════════════════════════╝ |___|");
		System.out.println(" (_____)-------.¸.•*(¸.•*´♥`*•.¸)`*•. -----(_____)");
		
		Scanner leer = new Scanner (System.in);
		
		int Empleado1, Numero1, Salario, Descuento;
		double ValoraPagar;
		
		    
			System.out.println("CUAL ES EL VALOR DE SU SALARIO"); 
			Empleado1 = leer.nextInt();
		
			System.out.println("\"CUAL ES DESCUENTO DEL SALARIO"); 
			Numero1 = leer.nextInt();
			
			Salario = Empleado1; 
			Descuento = Numero1;
			 ValoraPagar= Salario - Descuento;
			 
			 System.out.println ("VALOR A PAGAR ES:"+ ValoraPagar);
			 
		
	
				
		
	
	}
}
