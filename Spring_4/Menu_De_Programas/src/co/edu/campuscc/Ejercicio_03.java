package co.edu.campuscc;

import java.util.Scanner;

public class Ejercicio_03 {
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

		double Numero1, Numero2, Numero3, Nota1, Nota2, Nota3;
		double NotaDefinitiva;

		System.out.println("CUAL ES LA NOTA UNO");
		Numero1 = leer.nextInt();
		System.out.println("\"CUAL ES LA NOTA DOS");
		Numero2 = leer.nextInt();
		System.out.println("\"CUAL ES LA NOTA TRES");
		Numero3 = leer.nextInt();

		Nota1 = Numero1 * 30 / 100;
		Nota2 = Numero2 * 30 / 100;
		Nota3 = Numero3 * 40 / 100;
		NotaDefinitiva = Nota1 + Nota2 + Nota3;

		System.out.println("SU NOTA1:" + Nota1);
		System.out.println("SU NOTA2::" + Nota2);
		System.out.println("SU NOTA3::" + Nota3);
		System.out.println("LA NOTA DEFINITIVA DEL ESTUDIANTE ES:" + NotaDefinitiva);

	}
}
