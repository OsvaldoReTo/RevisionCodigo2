package com.generation;

import java.util.Scanner; //faltaba importar para funci�n Scanner

public class Codigo4 {

	public static void main(String[] args) { //no pose�a un m�todo main para ejecutar el c�digo
    Scanner s = new Scanner(System.in);//no se ten�a que es lo que se iba a escanear
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //error en el n�mero del jugador
    //Scanner s2 = new Scanner(System.in);//no se ten�a que es lo que se iba a escanear y es c�digo innecesario
    String j2 = s.nextLine();//se a�adi� s2

    if (j1 == j2) {//hab�a un par�ntesis de m�s
      System.out.println("Empate");//multiples errores en el cierre de llaves
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {//la sentencia == no estaba aplicando correctamente
            g = 1;
          }
          break;//faltaba agregar un break a cada condicion de case
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
            }
          break;
        case "tijeras"://faltaba una "s"
          if (j2.equals("papel")) {
            g = 1;
          }//if papel
          break;
        default:
      }//switch
      System.out.println("Gana el jugador " + g);
    }//else
    s.close();
   }//main
}//class Codigo4
