import java.util.Scanner; //faltaba importar java.util.Scanner

public class Codigo5 {
	
	public static void main (String[] args) { //falta m�todo Main

	    Scanner s = new Scanner(System.in);//no se indic� argumento para scanner
	    System.out.print("Introduzca un n�mero: ");//no se ocup� una doble comilla en cierre
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni);//se intenta guardar un dato tipo String en un tipo int
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { //sustituir c en cada parte donde aparezca ni, para tomarlo como entero
		  int digito = (int)(c % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		   //error de posici�n de c/=10
	    }//if-else

	      c /= 10;
		  }//while //mal colocaci�n de while, solo para que se pinte una vez el resultado
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un n�mero afortunado.");//mal escrito el m�todo System.out.println();
	    } else {
	      System.out.println("El " + ni + " no es un n�mero afortunado.");
	    }//if-else
	    

	    s.close();//cierre de scanner
	 }//main
	}//class Codigo5
