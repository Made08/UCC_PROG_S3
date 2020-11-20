package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_01 {
	public static void main(String[] args) {
		
		System.out.println("  __♥_                                      __♥__");
		System.out.println(" ( ___ )-------´*•.¸(*•.¸♥¸.•*´)¸.•*´----- ( ___ )");
		System.out.println("  | ♥ |  ╔════════════════════════════════╗ | ♥ |");
		System.out.println("  | ♥ |  ║  AUTOR:  MADELEM CHICO VELASCO ║ | ♥ |");
		System.out.println("  | ♥ |  ║   FECHA:   14-NOVIEMBRE-2020   ║ | ♥ |");
		System.out.println("  | ♥ |  ║      PROGRAMA DE ING. SISTEMAS ║ | ♥ |");
		System.out.println("  | ♥ |  ║             ID: 759383         ║ | ♥ |");
		System.out.println("  |___|  ╚════════════════════════════════╝ |___|");
		System.out.println(" (_____)-------.¸.•*(¸.•*´♥`*•.¸)`*•. -----(_____)");
		
		int numero, i;
		Scanner leer = new Scanner(System.in);
		
	     String palabra;
	     String palabrainvertida=""; 
	     System.out.println("DIGITE UNA PALABRA O NUMERO Y ENSEGUIDA MOSTRARA A LA INVERSA: \n");
	     palabra = leer.nextLine();
	 
	     for (i = palabra.length()-1; i>=0; i--){
	         palabrainvertida += palabra.charAt(i);}
	 
	     System.out.println("LA INVERSA DE LA PALABRA O NUMERO ES: \n"+ palabrainvertida); 

	}
}
