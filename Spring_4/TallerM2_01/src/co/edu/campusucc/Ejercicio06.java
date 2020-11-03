package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio06 {
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
		
		int ValorHora, HorasTrabajadas,Salario, Numero1, Numero2;
		
		System.out.println("VALOR DE LA HORA"); 
		Numero1= leer.nextInt();
	
		System.out.println("CANTIDAD DE HORAS TRABAJADAS"); 
		Numero2 = leer.nextInt();
		
		ValorHora = Numero1;
		HorasTrabajadas = Numero2;
		Salario = ValorHora * HorasTrabajadas;
		
		 System.out.println ("EL SALARIO DE HORAS TRABAJADAS:"+Salario);

	}
}
