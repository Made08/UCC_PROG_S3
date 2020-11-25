package co.edu.campuscc;

import java.util.Scanner;

public class Ejercicio_07 {
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
		
		 int Numero, aux, inverso = 0, cifra;
	     do {
	         System.out.print("INGRESE MAS DE UN DIGITO PARA SABER SI ES (CAPICÚA)");                                                 
	         Numero = leer.nextInt();
	     } while (Numero < 10);
	    
	     aux = Numero;
	     while (aux!=0){
	         cifra = aux % 10;
	         inverso = inverso * 10 + cifra;
	         aux = aux / 10;}
	 
	     if(Numero == inverso){
	         System.out.println(" SI ES CAPICÚA:");
	     }else{
	         System.out.println(" NO ES CAPICÚA:");}

	}
}
