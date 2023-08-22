package projeler;

import java.util.Scanner;

public class CikarmaZinciri {

	public static void main(String[] args) {

		/*
           SORU 42 :
		                                       
		   CIKARMA ZİNCİRİ
		
		  İKİ BASAMAKLI BİR SAYİ ALINIP BU SAYI TERS CEVİRİLİP CIKARILIYOR. CIKAN SONUCA TEKRAR AYNI İSLEM YAPILIYOR TEK SAYİ OLANA KADAR
		  
		  ORNEK : 
		  
		       SAYİ = 27
		       
		       72 - 27 = 45
		       54 - 45 = 9
		       
		         CIKARMA ZİNCİRİ UZUNLUGU : 2
		  
		 */

		Scanner input = new Scanner(System.in);
		
		int sayi =0;
		
		do {
			System.out.print("iki basamkli sayi giriniz : ");
			sayi = input.nextInt();
		} while (sayi > 100 || sayi < 10);

		
		
		int cikarmaZinciriSaysı = 1;

		while (sayi > 10) {

			int terssayi = (sayi % 10) * 10 + sayi / 10;

			if (sayi > terssayi) {
				sayi = sayi - terssayi;
				cikarmaZinciriSaysı++;
			} 
			else {
				sayi = terssayi - sayi;
				cikarmaZinciriSaysı++;
			}
		}
		
		System.out.println("Cikarma zincir sayisi = "+cikarmaZinciriSaysı);

	}

}
