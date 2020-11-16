package co.edu.campusucc;

import java.util.Random;

public class ExplicacionRepWhile {
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
		
		boolean condicion = true;
		int contador = 0;
		int acomulador =0;
		
		while (condicion) {
			contador =contador + 1;
			Random aleatorio = new Random();
			int intRandom = aleatorio.nextInt(50);
			
			acomulador = acomulador + intRandom; 
			
			condicion = true;
			if (intRandom < 30 && intRandom > 25) condicion = false;
			
			System.out.println (" Estoy dentro del ciclo haga mientras; aleatorio= >>>" +intRandom + "condicion salida del ciclo >>>" + condicion );
			}
		    System.out.println ("|************************************|");
		    System.out.println ("|   ciclos realizados: " + contador    );
		    System.out.println ("|      Valor acomulado:" + acomulador  );     
		    System.out.println ("|************************************|");

	}
}
