Proceso ENTRENAMIENTO_08
	//defino constante
	Definir n Como Entero;
	n <- 10;
	//defino variable
	Definir b Como Logico;
	b <- verdadero;
	// genera error por falta de la condicion para determinar la variable n como logica 
	si n = 10  entonces;
		b = Verdadero;
	SiNo
		b = falso;
		
	FinSi
	
	escribir "el valor de n es:", n;
	escribir "el valor de b es:", b;
	
FinProceso
