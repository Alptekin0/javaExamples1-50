package projeler2;

import java.util.Scanner;

public class obebCıkarmaZinciri {

	public static void main(String[] args) {
		
		/* 
		   SORU 30 :
		   
		    GİRİLEN İKİ SAYININ OBEBINI CIKARMA ZINCIRI YARDIMI İLE BULMA.
		  
		  */

		Scanner input = new Scanner(System.in);

		System.out.print("1. tam sayiyi giriniz :");
		int sayi1 = input.nextInt();
		System.out.print("2. tam sayiyi giriniz :");
		int sayi2 = input.nextInt();

		int buyukSayi;
		int kucukSayi;
		int cikarmaZincirUzunlugu = 1;

		if (sayi1 > sayi2) {
			buyukSayi = sayi1;
			kucukSayi = sayi2;
		} 
		else {
			buyukSayi = sayi2;
			kucukSayi = sayi1;
		}

		while (buyukSayi != kucukSayi) {

			buyukSayi = buyukSayi - kucukSayi;

			if (buyukSayi < kucukSayi) {
				int temp = buyukSayi;
				buyukSayi = kucukSayi;
				kucukSayi = temp;
			}
			cikarmaZincirUzunlugu++;
		}

		System.err.println("\nOBEB : "+buyukSayi);
		System.err.println("OBEB cikarma zinciri : "+cikarmaZincirUzunlugu);

	}
}