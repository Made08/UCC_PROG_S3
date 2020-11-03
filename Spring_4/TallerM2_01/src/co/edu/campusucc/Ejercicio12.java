package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio12 {
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
        
        int DigiteN, Distancia, Ninaida, Ninavuelta,Horasn;
		
		System.out.println("El viaje de la Niña, La Pinta y la Santa Maria : ");
		
		Distancia = 1200/2;
		
		//la niña//
		
		Ninaida = Distancia / 8;
		Ninavuelta = Distancia / 12;
		
		Horasn = Ninaida + Ninavuelta;
		System.out.println("ORDEN DE LLEGADA:");
		System.out.println("HORAS TOTALES DE LA NIÑA:" + Horasn);
		
		//pinta//
		
		Ninaida = Distancia / 9;
		Ninavuelta = Distancia / 11;
		
		Horasn = Ninaida + Ninavuelta;

		System.out.println("Horas totales de la Pinta : " + Horasn);
		
		//santa maria//
		
		Ninaida = Distancia / 10;
		Ninavuelta = Distancia / 8;
				
		Horasn = Ninaida + Ninavuelta;

		System.out.println("HORAS TOTALES DE LA SANTA MARIA: " + Horasn);		
		System.out.println("¿LLEGARON JUNTAS DE NUEVO A BUENOS AIRES? : NO ");

	}
}
