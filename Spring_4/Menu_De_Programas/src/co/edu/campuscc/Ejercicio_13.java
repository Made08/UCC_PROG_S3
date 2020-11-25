package co.edu.campuscc;

import java.util.Random;

public class Ejercicio_13 {
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
		
		boolean condicion = false;

		do {

			Random random = new Random();
			int intRandom = random.nextInt(1000); 
			condicion = true;

			int contador, i, numero;
			numero = intRandom;
			contador = 0;

			for (i = 1; i <= numero; i++){
				if ((numero % i) == 0){
					contador++;}
				}

			if (contador <= 2)
				condicion = false;
			System.out.println("EL NUMERO:" + intRandom + " TERMINARA CUANDO ES PRIMO");
			} while (condicion);

	}
}
