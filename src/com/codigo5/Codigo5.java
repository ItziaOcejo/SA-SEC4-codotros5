package com.codigo5;

import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); //importamos Scanner
		    System.out.print("Introduzca un número: "); //se agrega la " faltante
		    int ni = s.nextInt();
		   
		    int afo = 0;
		    int noAfo = 0;
		    
		   
		    while (ni > 0) {
			  int digito = (int)(ni%10); 
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
			  
			  ni /= 10;
		    }
		    if (afo > noAfo) {
		      System.out.println("El " + ni + " es un número afortunado.");
		    } else {
		      System.out.println("El " + ni + " no es un número afortunado.");
		    }
		    
		  }
		  
		}

	}

