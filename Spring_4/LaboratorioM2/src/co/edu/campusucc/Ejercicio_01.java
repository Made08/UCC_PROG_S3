package co.edu.campusucc;

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
		
		int l1,l2;
		boolean tr1=false,tr2=false,k;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("¿La tierra es redonda? [0]...Falso [1]...Verdadero?");
			l1 = leer.nextInt();
			System.out.print("¿ 25 es un cuadrado perfecto? [0]...Falso [1]...Verdadero");
			l2 = leer.nextInt();
		}
		if (l1==0) tr1=true;
		if (l2==0) tr2=true;
		
		k=tr1 & tr2;
		
		System.out.print("El valor de la variable  k es: " +k);
	}
}
