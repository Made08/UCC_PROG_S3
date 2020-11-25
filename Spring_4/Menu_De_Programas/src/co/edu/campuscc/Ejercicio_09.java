package co.edu.campuscc;

import java.util.Scanner;

public class Ejercicio_09 {
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
		
		String nombre ="";

		int  categoria;
		double sueldo;
		
		System.out.println("DIGITE EL NOMBRE DEL EMPLEADO ");
		nombre = leer.next ();
		System.out.println("DIGITE LA CATEGORIA ENTRE 1 Y 4  ");
		categoria = leer.nextInt();
		System.out.println(" DIGITE EL SUELDO "); 
		sueldo= leer.nextDouble();
	
		switch (categoria) {
		case 1:
			sueldo = sueldo * 1.15;
			break;
		case 2:
			sueldo = sueldo * 1.10;
			break;
		case 3:
			sueldo = sueldo * 1.08;
			break;
		case 4:
			sueldo = sueldo * 1.07;
			break;
			
		default:
			sueldo = 0;
			System.out.println("LA CATEGORIA NO EXISTE");}
		
		System.out.println("EL NOMBRE DEL EMPLEADO:" + nombre);
		System.out.println("EL SUELDO A PAGAR ES:" + sueldo);

	}
}
