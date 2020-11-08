package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio_04 {
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
		
		String nombre, producto;
		int  codigo;
	    double sueldo, valorfactura = 0, cantidad, iva, valor; 
	    
	    System.out.println(" DIGITE EL NOMBRE DEL EMPLEADO");
		nombre = leer.next();

		System.out.println(" DIGITE EL CODIGO" +nombre+": \n 1 ==> PRODUCTO A \n" + " 2 ==> PRODUCTO B \n 3==> PRODUCTO C ");
		codigo = leer.nextInt();
		
		System.out.println(" DIGITE LA CANTIDAD "+nombre+":  ");
		cantidad = leer.nextInt();
		
		if ( cantidad < 501 && codigo == 1) {
			iva = 0.07;
			valor = (cantidad*500)*iva;
			valorfactura = (cantidad*500)+valor;
			
			}
		if ( cantidad < 501 && codigo == 2) {
			iva = 0.08;
			valor = (cantidad*800)*iva;
			valorfactura = (cantidad*800)+valor;
			}
		if ( cantidad < 501 && codigo == 3) {
			iva = 0.05;
			valor = (cantidad*1000)*iva;
			valorfactura = (cantidad*1000)+valor;
			}
		if ( cantidad > 500 && codigo == 1) {
			iva = 0.09;
			valor = (cantidad*1000)*iva;
			valorfactura = (cantidad*1000)+valor;
			}
		if ( cantidad > 500 && codigo == 2) {
			iva = 0.11;
			valor = (cantidad*1400)*iva;
			valorfactura = (cantidad*1400)+valor;
			}
		if ( cantidad > 500 && codigo == 3) {
			iva = 0.10;
			valor = (cantidad*1600)*iva;
			valorfactura = (cantidad*1600)+valor;}

		System.out.println(" VALOR FACTURA: $ "+ valorfactura + " SEÑOR@ " +nombre);
	}
}
