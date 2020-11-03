package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio11 {
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
		
        Scanner leer = new Scanner(System.in);
		
		double DigiteN, Porcentaje, Calvin, Hobbes,Hobbestotal;
		
		System.out.println("DIGITE LAS N CANTIDAD DE ACEITR DE OLIVA");
		DigiteN = leer.nextInt();
		
		Porcentaje = 0.66666667;
		
		Hobbes = DigiteN;
		
		Hobbestotal = Hobbes * Porcentaje;
		
		Calvin = Hobbes - Hobbestotal;
		
		

		System.out.println("TOTAL DE ACEITE: " + DigiteN);
		
		System.out.println("PRODUCCION DE CALVIN : " + Calvin);

		System.out.println("PRODUCCION DE HOBBLES: " + Hobbestotal);
		
	}
}
