package projeler3;

import java.util.Scanner;

public class tekSayilar {

	public static void main(String[] args) {
		
		/*
		  
		  SORU 5 :
		  
		  KLAVYEDEN GİRİLEN 10 TANE SAYİNİN İCİNDEN TEK OLANLARIN ORTALMASINI ALIP 
		  EKRANA YAZDIRAN UYGULAMA.
		  
		  */
		
		
		int sayilar, tekSayilarinToplamı = 0, sayac = 0;
		Scanner input = new Scanner(System.in);
		
		
		for (int counter = 0; counter < 10; counter++) {
			
			System.out.print("10 tane sayi giriniz : ");
			
			sayilar = input.nextInt();
			
			if (sayilar % 2 == 1 || sayilar % 2 == -1) {
				tekSayilarinToplamı += sayilar;
				sayac++;
			}
		}
		
		System.out.println("\n\nGIRDIGINIZ SAYILAR ARASINDA BULUNAN TEK SAYILARIN ORTALAMASI : " + tekSayilarinToplamı/sayac);
		
		
		
		
	}

}
