package projeler2;

import java.util.Scanner;

public class okek {

	public static void main(String[] args) {
		
		
		/*
		  SORU 32 :
		  
		    GİRİLEN İKİ SAYININ OKEKİNİ HESAPLAYAN UYGULAMA.
		    OKEK ONCE OBEB BULUNARAK HESAPLANMIŞTIR
		    
		    OKEK (X,Y) = (X*Y) / OBEB(X,Y)
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("1. sayiyi giriniz : ");

		int sayi1 = input.nextInt();

		System.out.print("2. sayiyi giriniz : ");

		int sayi2 = input.nextInt();
		int buyukSayi;
		int kucukSayi;

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
			
		}
		
		System.out.println("OKEK : "+(sayi1 * sayi2) / buyukSayi);
		
		System.out.println("OBEB : "+ buyukSayi);
		
		
		
		

	}

}
