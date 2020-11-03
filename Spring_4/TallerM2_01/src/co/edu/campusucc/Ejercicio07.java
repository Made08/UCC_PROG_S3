package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio07 {
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
		
		int Paginas, Minutos, Numero1, Numero2;
		
		System.out.println("CANTIDAD DE MINUTOS"); 
		Numero1= leer.nextInt();
		
		Paginas = Numero1 *15/30; 
		Minutos = 30*75/15;
		
		
		 System.out.println ("Cantidad total de es:"+Paginas);
		 System.out.println ("Minutos en que en se escribieron las paginas:"+Minutos);
		 
		
		
		

	}
}
