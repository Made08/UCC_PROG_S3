package co.edu.campusucc;
import java.util.Random;

public class ExplicacionRepetitivos {
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
		
        boolean condicion = false;
    
    do { 
    	Random random = new Random ();
    	int intRandom = random.nextInt(10);
    	condicion = true;
    	
    	if (intRandom < 3) condicion = false;
    	
    	System.out.println (" Estoy dentro del ciclo haga mientras; random= >>>" +intRandom + "condicion salida del ciclo >>>" + condicion );
    }  while (condicion);
    
	}
}
