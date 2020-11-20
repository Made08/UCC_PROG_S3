package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_02 {
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
		
        Scanner leer = new Scanner(System.in);
		
		int  entero,residuo, numero, suma, valor;
		entero = 1;
		residuo=1;
		valor=0;
		suma=0;
		
		 System.out.println(" DIGITE UN NUMERO: ");
	     numero = leer.nextInt();
	     
	     while (entero > 0) {
	    	 residuo = numero % 10;
	    	 entero = numero/10;
	    	 numero = entero;
	    	 suma = residuo + valor;
	    	 valor = suma;}
		
		System.out.println(" EL RESULTADO DE LA SUMA ES: " + suma);
		

	}
}
