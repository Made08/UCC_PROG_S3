package co.edu.campuscc;

import java.util.Scanner;

public class Ejercicio_00 {
	public static void main(String[] args) {
		
		System.out.println("  __♥_                                      __♥__");
		System.out.println(" ( ___ )-------´*•.¸(*•.¸♥¸.•*´)¸.•*´----- ( ___ )");
		System.out.println("  | ♥ |  ╔════════════════════════════════╗ | ♥ |");
		System.out.println("  | ♥ |  ║  AUTOR:  MADELEM CHICO VELASCO ║ | ♥ |");
		System.out.println("  | ♥ |  ║   FECHA:    25-NOVIEMBRE-2020  ║ | ♥ |");
		System.out.println("  | ♥ |  ║      PROGRAMA DE ING. SISTEMAS ║ | ♥ |");
		System.out.println("  | ♥ |  ║             ID: 759383         ║ | ♥ |");
		System.out.println("  |___|  ╚════════════════════════════════╝ |___|");
		System.out.println(" (_____)-------.¸.•*(¸.•*´♥`*•.¸)`*•. -----(_____)");
		
		
		System.out.println("DIGITE 1 PARA EL PROGRAMA DE Ejercicio_01");
		System.out.println("DIGITE 2 PARA EL PROGRAMA DE Ejercicio_02");
		System.out.println("DIGITE 3 PARA EL PROGRAMA DE Ejercicio_03");
		System.out.println("DIGITE 4 PARA EL PROGRAMA DE Ejercicio_04");
		System.out.println("DIGITE 5 PARA EL PROGRAMA DE Ejercicio_05");
		System.out.println("DIGITE 6 PARA EL PROGRAMA DE Ejercicio_06");
		System.out.println("DIGITE 7 PARA EL PROGRAMA DE Ejercicio_07");
		System.out.println("DIGITE 8 PARA EL PROGRAMA DE Ejercicio_08");
		System.out.println("DIGITE 9 PARA EL PROGRAMA DE Ejercicio_09");
		System.out.println("DIGITE 10 PARA EL PROGRAMA DE Ejercicio_10");
		System.out.println("DIGITE 11 PARA EL PROGRAMA DE Ejercicio_11");
		System.out.println("DIGITE 12 PARA EL PROGRAMA DE Ejercicio_12");
		System.out.println("DIGITE 13 PARA EL PROGRAMA DE Ejercicio_13");
		System.out.println("DIGITE 14 PARA EL PROGRAMA DE Ejercicio_14");
		System.out.println("DIGITE 15 PARA EL PROGRAMA DE Ejercicio_15");
		
		try (Scanner scan = new Scanner(System.in)){
			int opcionprograma;
			String comando ="";
			System.out.println("DIGITE EL NUMERO DEL PROGRAMA A EJECUTAR: ");
			opcionprograma = scan.nextInt();
			
			switch (opcionprograma) {
			case 1 :
				new Ejercicio_01().main(args);
				
				break;
			case 2 :	
				new Ejercicio_02().main(args);
				break;
			case 3 :
				new Ejercicio_03().main(args);
				break;
			case 4 :
				new Ejercicio_04().main(args);
				break;
			case 5 :	
				new Ejercicio_05().main(args);
				break;
			case 6 :
				new Ejercicio_06().main(args);
				break;
			case 7 :
				new Ejercicio_07().main(args);
				break;
			case 8 :	
				new Ejercicio_08().main(args);
				break;
			case 9 :
				new Ejercicio_09().main(args);
				break;
			case 10 :
				new Ejercicio_10().main(args);
				break;
			case 11 :	
				new Ejercicio_11().main(args);
				break;
			case 12 :
				new Ejercicio_12().main(args);
				break;
			case 13 :
				new Ejercicio_13().main(args);
				break;
			case 14 :	
				new Ejercicio_14().main(args);
				break;
			case 15 :
				new Ejercicio_15().main(args);
				break;
				
			default :
			    try 
				{
				Runtime.getRuntime().exec(comando);
				}
				catch (Exception e)
				{
					System.out.println("ERROR EN EL METODO EXE () ");
					e.printStackTrace();
				}
			}
		}
	}
}
