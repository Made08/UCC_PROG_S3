package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_06 {
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
		
	     int contador, primo, numero;

	     System.out.print(" DIGITE UN NUMERO: ");
	     numero = leer.nextInt();

	     contador = 0;
	     for(primo = 1; primo <= numero; primo++)
	     {
	         if((numero % primo) == 0){
	             contador++;}
	     }

	     if(contador <= 2){
	         System.out.println(numero+ ":ESTE NUMERO ES PRIMO ");}
	         else{
	         System.out.println(" ESTE NO ES UN NUMERO PRIMO");}
		

	}
}
