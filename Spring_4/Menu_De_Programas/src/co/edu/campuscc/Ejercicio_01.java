package co.edu.campuscc;

import java.util.Scanner;

public class Ejercicio_01 {
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

		int Numero1, Numero2, Resultadosuma, Resta, Producto;
		int Promedio;

		System.out.println("INGRESE EL PRIMER NUMERO ");
		Numero1 = leer.nextInt();
		System.out.println("INGRESE EL SEGUNDO NUMERO ");
		Numero2 = leer.nextInt();

		Resultadosuma = Numero1 + Numero2;

		Resta = Numero1 - Numero2;

		Producto = Numero1 * Numero2;

		Promedio = Resultadosuma / 2;

		System.out.println("EL RESULTADO DE LA SUMA ES:" + Resultadosuma);
		System.out.println("EL RESULTADO DE LA RESTA ES:" + Resta);
		System.out.println("EL RESULTADO DEL PRODUCTO ES:" + Producto);
		System.out.println("EL RESULTADO DEL PROMEDIO ES:" + Promedio);

	}
}
