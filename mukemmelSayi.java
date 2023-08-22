package projeler2;

import java.util.Scanner;

public class mukemmelSayi {
	
	public static void main(String[] args) {
		
		/*
		  SORU 19:
		  
		  MUKEMMEL SAYİ KENDİSİ HARİC BOLENLERİNİN TOPLAMI KENDİSİNE EŞİT OLAN SAYİLARA MUKEMMEL SAYİ DENİR.
		  
		  ÖRNEK : 
		  
		  6  = 3 + 2 + 1
		  28 = 14 + 7 + 4 + 2 + 1 
		  
		  
		  */
		Scanner input = new Scanner(System.in);
		
		System.out.print("sayi giriniz : ");
		
		int sayi = input.nextInt();
		
		int bolenlerToplami = 0;
				
		for (int counter = sayi-1; counter > 0; counter--) {
			if (sayi % counter == 0) {
				bolenlerToplami+=counter;
			}
		}
		
		if (bolenlerToplami == sayi) {
			System.out.println(sayi+" MUKEMMEL SAYIDIR.");
		}
		else {
			System.out.println("MUKEMMEL SAYI DEGILDIR.");
		}
		
		
	}

}
