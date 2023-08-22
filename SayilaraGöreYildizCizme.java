package projeler3;

import java.util.Scanner;

public class SayilaraGöreYildizCizme {

	public static void main(String[] args) {

		/*
		 
		 SORU 7 :
		 
		 KLAVYEDEN GİRİLEN 5 SAYIYA GÖRE SIRASIYLA BU SAYILARI ALIP YILDIZLARI ALT ALTA ÇİZRN PROGRAM.
		 
		 */

		
		
		
		int sayi = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("5 tane sayi giriniz : ");
		

		for (int counter = 0; counter <= sayi; counter++) {
			
			if (counter <= sayi && sayi != 0) {
				
				System.out.print("*");
				
			}
			
			if (counter == sayi) {
				counter = 0;
				sayi = input.nextInt();
				System.out.println();
			}
			
		}

		
		
		
	}
}
