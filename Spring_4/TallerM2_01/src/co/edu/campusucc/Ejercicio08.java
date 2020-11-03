package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio08 {
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
		
		Scanner leer = new Scanner (System.in);
		
		double VahoraTra, HoraTra, SalarioPagado, HorasExtras, Salariofinal, CanHoExt, Segurosocial;
		
		System.out.println(" VALOR DE LA HORA TRABAJADA"); 
		VahoraTra = leer.nextDouble();
		
		System.out.println(" INGRESE CANTIDAD DE HORAS TRABAJADAS"); 
		HoraTra = leer.nextDouble();
		
		System.out.println(" INGRESE LAS HORA EXTRAS "); 
		CanHoExt = leer.nextDouble();
		
		SalarioPagado = VahoraTra * HoraTra;  
		HorasExtras = CanHoExt * (VahoraTra * 1.5);
		Segurosocial = SalarioPagado * 0.12;
		Salariofinal = (SalarioPagado + HorasExtras) - Segurosocial;
		
		System.out.println("EL VALOR DEL SALARIO ES:" +SalarioPagado);
		System.out.println("TOTAL DE HORAS EXTRAS ES:" +HorasExtras);
		System.out.println("EL APORTE AL SEGURO SOCIAL ES:" + Segurosocial);
		System.out.println("EL SALARIO FINAL A PAGAR ES:" +Salariofinal);			
	}
}
