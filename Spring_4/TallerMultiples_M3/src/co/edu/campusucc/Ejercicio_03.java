package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_03 {
	public static void main(String[] args) {
		
		System.out.println("  __♥_                                      __♥__");
		System.out.println(" ( ___ )-------´*•.¸(*•.¸♥¸.•*´)¸.•*´----- ( ___ )");
		System.out.println("  | ♥ |  ╔════════════════════════════════╗ | ♥ |");
		System.out.println("  | ♥ |  ║  AUTOR:  MADELEM CHICO VELASCO ║ | ♥ |");
		System.out.println("  | ♥ |  ║   FECHA:    07-NOVIEMBRE-2020  ║ | ♥ |");
		System.out.println("  | ♥ |  ║      PROGRAMA DE ING. SISTEMAS ║ | ♥ |");
		System.out.println("  | ♥ |  ║             ID: 759383         ║ | ♥ |");
		System.out.println("  |___|  ╚════════════════════════════════╝ |___|");
		System.out.println(" (_____)-------.¸.•*(¸.•*´♥`*•.¸)`*•. -----(_____)");
		
		Scanner leer = new Scanner(System.in);
		
		String nombre;
		int costo= 0,  ubicacion, tamano;
		
		 System.out.println(" DIGITE SU NOMBRE:");
			nombre = leer.next();
         System.out.println(" DIGITE SU UBICACION SEÑOR(@)" +nombre+": \n 1 ==> NORTE \n" + " 2 ==> SUR \n 3==> ORIENTEGRANDE \n 4==> OCCIDENTE ");
			ubicacion = leer.nextInt();
		 System.out.println(" DIGITE EL TAMAÑO SEÑOR(@)" +nombre+": \n 1 ==> PEQUEÑO \n" + " 2 ==> MEDIANO \n 3==> GRANDE ");
			tamano = leer.nextInt();
					
			switch  (ubicacion) {
				case 1: 
					if ( tamano == 1) {
					costo = 500;
					}
					if ( tamano == 2) {
						costo = 250;
						}
					if ( tamano == 3) {
						costo = 100;}	
					;				
				break;
				
				case 2: 
					if ( tamano == 1) {
					costo = 400;
					}
					if ( tamano == 2) {
						costo = 200;
						}
					if ( tamano == 3) {
						costo = 0;}	
					;				
				break;
				
				case 3: 
					if ( tamano <= 1 && tamano >= 3) {
					costo = 100;}
					else
					{
						costo = 0;}				
					;				
				break;
				
				case 4: 
					if ( tamano == 1) {
					costo = 300;
					}
					if ( tamano == 2) {
						costo = 0;
						}
					if ( tamano == 3) {
						costo = 200;
						};				
				break;			
				default:
					costo = 0;
					
					System.out.println("EL TAMAÑO NO EXITE");
					
					break;}
						
			if ( costo == 0) {
				System.out.println("SOLICITUD MAL HECHA SEÑOR@ " + nombre);
				
			} else
			{
			System.out.println(" COSTO: $"+costo+ "SEÑOR@" + nombre);
			}
	}
}
