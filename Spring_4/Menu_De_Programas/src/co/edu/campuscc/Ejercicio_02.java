package co.edu.campuscc;

import java.util.Scanner;

public class Ejercicio_02 {
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

		int Numero1, Numero2, Resultado1, Resultado2;

		System.out.println("INGRESE EL PRIMER NUMERO ");
		Numero1 = leer.nextInt();
		System.out.println("INGRESE EL SEGUNDO NUMERO ");
		Numero2 = leer.nextInt();

		Resultado1 = Numero1 * Numero1 * Numero1;
		Resultado2 = Numero2 * Numero2 * Numero2;

		System.out.println(" EL CUBO DE " + Numero1 + " ES: " + Resultado1);
		System.out.println(" EL CUBO DE " + Numero2 + " :" + Resultado2);
	

	}
}
