package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio05 {
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

		double Costo, Pago, Devo, Numero1, Numero2;
		System.out.println("CUAL ES COSTO EL ARTICULO"); 
		Numero1= leer.nextDouble();
		System.out.println("EL VALOR A PAGAR ES:"); 
		Numero2 = leer.nextDouble();
		
		Costo = Numero1;
		Pago = Numero2;
		Devo = Pago - Costo;
		
		 System.out.println ("EL VALOR A DEVOLVER ES:"+Devo);
		
	}
}
