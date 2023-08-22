package projeler2;

import java.util.Scanner;

public class noksanSayi {

	public static void main(String[] args) {
		
		/*        
		  
		  SORU 24:
		    
		    GİRİLEN SAYININ NOKSAN SAYI OLUP OLMADIGINI BULMA
		    
		    NOKSAN SAYI : KENDİSİ HARİC BOLENLERİNİ TOPLADAGIMIZ ZAMAN KENDİSİNDEN KUCUK EDİYOR İSE NOKSAN SAYIDIR.
		    
		    ORNEK : 
		      
		      8 IN BOLENLERİ 4,2,1 (KENDİSİ HARİC)
		      
		      8 < 4 + 2 + 1   NOKSAN SAYIDIR.
		  
		     
		     */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayi giriniz : ");
		 
		int isNoksan = input.nextInt();
		
		int bolenlerToplami = 0;
		
		for (int bolenler = isNoksan - 1; bolenler > 0; bolenler--) {
			
			if (isNoksan % bolenler == 0) {
				
				bolenlerToplami += bolenler; 
				
			}
			
		}

		if (isNoksan  > bolenlerToplami) {
			System.out.println(isNoksan+" SAYISI NOKSAN SAYIDIR.");
		}
		else {
			System.out.println(isNoksan+" SAYISI NOKSAN SAYI DEGILDIR.");
		}
		
	}

}
