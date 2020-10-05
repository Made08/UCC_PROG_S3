Proceso ENTRENAMIENTO_05
	//defino variables 
	Definir x Como Entero;
	Definir yy Como Logico;
	Definir c Como Caracter;
	
	x <- 10;
	
	yy <- falso; c <- 'a';
	si x > 0 entonces;
		yy <- verdadero;
	SiNo
		yy <- falso;
	FinSi
	c <- 'b';
	yy <- verdadero;
	
	Escribir "el valor de x es:", x;
	Escribir "el valor de yy es:", yy;
	Escribir "el valor de c es:", c;
	
FinProceso
