package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_09 {
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

		int Numero1, Numero3, Numero2, Sume, Numero4;

		System.out.println("INGRESE EL NUMERO 1");
		Numero1 = leer.nextInt();
		System.out.println("INGRESE EL NUMERO 2");
		Numero2 = leer.nextInt();

		System.out.println("INGRESE EL NUMERO 3");
		Numero3 = leer.nextInt();

		System.out.println("INGRESE EL NUMERO 4");
		Numero4 = leer.nextInt();

		Sume = Numero4 + Numero3 + Numero1 + Numero2;

		System.out.println(
				"LA SUMA DE " + Numero1 + " + " + Numero2 + " + " + Numero3 + " + " + Numero4 + " es: " + Sume);
		System.out.println("NUMERO : " + Numero1 + Numero2 + Numero3 + Numero4 + " ..... LA SUMA ES : " + Sume);
		System.out.println(Sume);

	}
}
