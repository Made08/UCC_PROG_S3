package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_02 {
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
		int carrera, plan = 0, semestre;
		int numero,comunicacion,administracion;
		
		
		 System.out.println(" DIGITE EL NOMBRE DEL ESTUDIANTE");
			nombre = leer.next();
         System.out.println(" DIGITE LA CARRERA DE " +nombre+ ": \n 1 ==> ECONOMIA \n" + " 2 ==> ADMINISTRACIO \n 3==> CIENCIAS ");
			carrera = leer.nextInt();
			System.out.println(" DIGITE EL SEMETRES CURSADO ");
			semestre = leer.nextInt();
					

			switch  (carrera) {
				case 1: 
					if ( semestre <= 3) {
					plan = 1500;
					}
					if ( semestre >=3 && semestre <= 7) {
						plan = 2220;
						}
					if ( semestre >=8 && semestre <= 10) {
						plan = 2220;
						}				
				break;
				
				case 2: 
					if ( semestre <= 3) {
					plan = 2000;
					}
					if ( semestre >=3 && semestre <= 7) {
						plan = 4000;
						}
					if ( semestre >=8 && semestre <= 10) {
						plan = 6000;
						}					
					;				
				break;
				
				case 3: 
					if ( semestre <= 3) {
					plan = 1800;
					}
					if ( semestre >=3 && semestre <= 7) {
						plan = 5000;
						}
					if ( semestre >=8 && semestre <= 10) {
						plan = 7000;
						}					
					;				
				break;
				
				default:
					plan = 0;
					
					System.out.println(" ESTE PLAN DE ESTUDIO NO ");
					
					break;
					}
				System.out.println("EL VALOR DEL PLAN DE " +nombre+ " ES DE $ " + plan);
			}
	}
