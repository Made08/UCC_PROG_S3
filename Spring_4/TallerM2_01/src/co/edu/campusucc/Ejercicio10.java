package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio10 {
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

		int Absoluto, Total, Numero1;

		System.out.println(" DIGITE EL NUMERO PARA DAR EL VALOR ADSOLUTO ");
		Numero1 = leer.nextInt();

		Absoluto = Numero1;

		if (Absoluto < 0) {

			Total = Absoluto * (-1);

		} else {
			Total = Absoluto * 1;
		}
		System.out.println("NUMERO NORMAL ES : " + Absoluto);
		System.out.println("EL NUMERO ABSOLUTO ES : " + Total);

	}
}
