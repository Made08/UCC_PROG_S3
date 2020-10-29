public class ProgramaArgumentos02 {
  public static void main(String[] args) {
    System.out.println(" Mi primer programa en JAVA<<MACH>>");
	System.out.println(" 88888888888888888888888888888888888888888");
	System.out.println(" -  ___________________________________  +");
	System.out.println(" + | AUTOR:  MADELEM CHICO VELASCO     | -");
	System.out.println(" - |         FECHA: 17-OCTUBRE-2020    | +");
	System.out.println(" + |       PROGRAMA DE ING. SISTEMAS   | -");
	System.out.println(" - |              ID: 759383           | +");
	System.out.println(" + |___________________________________| +");
	System.out.println(" 88888888888888888888888888888888888888888");
	System.out.println("++++++++++++++++++++++++++++++++++++++++++");
	System.out.println("+                                        -");
	System.out.println("-       Programa Argumentos 02           +");
	System.out.println("+           resta de enteros              -");
	System.out.println("-+++++++++++++++++++++++++++++++++++++++++");
	
	System.out.println("argmento 1 = " +args [0]);
	System.out.println("argmento 2 = " +args [1]);
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int resultado = num1 - num2;
	
	 System.out.println("Operacion Matematica: num1 = "+num1+", num2 = "+num2);
	System.out.println(" Resta num1 - num2 = "+ resultado);
  }
} 