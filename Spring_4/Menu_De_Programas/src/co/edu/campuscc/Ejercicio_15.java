package co.edu.campuscc;

import java.util.Random;

public class Ejercicio_15 {
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
		
		Random aleatorio = new Random();
		int intCantidadCiclos = aleatorio.nextInt(50);
		int intRandom = 0;
		
		System.out.println (" Cantidad de ciclos:" +intCantidadCiclos);
		
		for (int i = 1; i <= intCantidadCiclos; i++ ) {
			intRandom = aleatorio.nextInt(50);
			acomulador = acomulador + intRandom;
			contador = i;
			
			System.out.println (" Estoy dentro del ciclo de For: contador= >>>" + i + "condicion salida del ciclo >>>" + (i <= intRandom));
			if (intRandom < 30 && intRandom > 25)
				break;
			System.out.println (" Estoy dentro del ciclo haga mientras >>>" +intRandom + "condicion salida del ciclo >>>" +condicion );
			
			 System.out.println ("|************************************|");
			 System.out.println ("|   ciclos realizados: " + contador    );
			 System.out.println ("|     Valor acomulado: " + acomulador  );     
			 System.out.println ("|************************************|");
			
		}
	}
}
