import java.io.Console; //se importa paqueter�a para considerar el console

public class codigo6 {
	
	
	//Funci�n main  
	public static void main(String[] args) {
		//creaci�n de m�todo main para que se ejecute el programa
	    int[] n = new int[20]; //No se hab�a a�adido la expresi�n new para crear nuevo array
	    //for para asignar valores dentro del array
	    for (int i = 0; i < 20; i++) { //falta de un "+" en la expresi�n for
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//falta de out para ser un output y se escriba cada elemento
	    }
	    Console cnsl = System.console();
	    if (cnsl == null) {
	    	System.out.println("n");
	    }
	    int opcion = Integer.parseInt(cnsl.readLine());//falta de un par�ntesis
	    System.out.println("\n�Qu� n�meros quiere resaltar? ");// hac�a falta una n para imprimir
	    System.out.print("(1 � los m�ltiplos de 5, 2 � los m�ltiplos de 7): ");

	    int multiplo = (opcion == 1) ? 5 : 7; //if ternario mal escrito es: (cond)?Y:N

	    for (int e : n) { //error de sintaxis no es un foreach ser�a solo for tambi�n hay error en el tipo de dato, es int no char
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {//hac�a falta cerrar sentencia if antes de abrir else
	        System.out.print(e + " ");//no es un input as� que no debe ser .in sino .out
	      }//if-else
	    }//forEach
	   }//main
	}//class