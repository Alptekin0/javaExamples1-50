package projeler;

import java.util.Scanner;

public class Formul {

	public static void main(String[] args) {
		
		/*
		  
		      SORU 13 : 
		  
		       1-x /1 + x² /2 + x³/......xⁿ/n   denklemini cozumu
		  
		  
		       */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("n degerini giriniz : ");
		double n = input.nextInt();
		
		System.out.print("x degerini giriniz : ");
		double x = input.nextInt();
		
		double sonuc = 1-x;
		
		for (int counter = 2; counter <= n; counter++) {
			
			sonuc += (Math.pow(x, counter) /counter) ;
			
		}
		
		
		System.out.println(sonuc);
	}

}
