package projeler2;

import java.util.Scanner;

public class obeb {

	public static void main(String[] args) {
		
		/* 
		   SORU 29 : 
		   
		   GİRİLEN İKİ SAYİNİN OBEBİNİ ALMA. OBEB ALIRKEN OKLİT YÖNTEMİNİ KULLANDIK.
		  
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("birinci sayi :");
		int sayi1 = input.nextInt();
		System.out.print("ikinci sayi :");
		int sayi2 = input.nextInt();
		
		int kalan = 1;
		int buyukSayi =0;
		int kucukSayi =0;
		
		if (sayi1 >= sayi2) {
			  buyukSayi = sayi1;
			  kucukSayi = sayi2;
			} else {
			  buyukSayi = sayi2;
			  kucukSayi = sayi1;
			}
		
		while (kalan != 0) {
			
			kalan = buyukSayi % kucukSayi;
			buyukSayi = kucukSayi;
			kucukSayi = kalan;
			
		}
		
		System.out.println("OBEB : "+buyukSayi);
		
		
	}

}
