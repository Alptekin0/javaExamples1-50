package projeler2;

import java.util.Scanner;

public class bolSayi {

	public static void main(String[] args) {
		
		/*
		      SORU 25 :
		      
		         KLAVYEDEN GİRİLEN SAYININ BOL SAYI OLUP OLMADIGINI BULMA
		         
		          BOL SAYI : KENDİSİ HARİC BOLENLERİN TOPLAMI KENDİSİNDEN BÜYÜK İSE BOL SAYIDIR.
		           
		           ORNEK : 
		            12'NİN BOLENLERİ 6,4,3,2,1		            
		            12 < 6+4+3+2+1
		            
		            BOYLECE 12 BOL BİR SAYIDIR
		         
		         */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayi giriniz : ");
		
		int isBol = input.nextInt();
		
		int bolenlerToplami = 0;
		
		for (int bolenler = isBol - 1; bolenler > 0; bolenler--) {
			
			if (isBol % bolenler == 0) {
				bolenlerToplami += bolenler;
			}
			
		}		
		
		if (isBol < bolenlerToplami ) {
			System.out.println(isBol + " bol bir sayidir.");
		}
		else {
			System.out.println(isBol + " bol bir sayi degildir.");
		}
		
	}

}
