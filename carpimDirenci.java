package projeler3;

import java.util.Scanner;

public class carpimDirenci {

	public static void main(String[] args) {
		
		/*
		 
		 SORU  40:
		 
		 
		 
		  İKİ BASAMAKLI CARPIM DİRENCI EN FAZLA OLAN SAYIYI BULAN PROGRAM
		  
		  CARPIM DİRENCİ : BİR SAYININ RAKAMLARI CARPILIP CIKAN SONUC TEK BASMAKLI OLANA KADAR DEVAM EDİP
		  KAÇ ADIM DEVAM EDİLDİ İSE O KADAR CARPIM DİRENCİNE SAHİPTİR
		  
		  ÖRNEK : 
		  
		    82 --> 8 * 2 = 16
		    16 --> 1 * 6 = 6   
		    
		    82'NİN CARPIM DİRENCİ 2 DİR. BASAMAKLARINA AYIRIP CARPINCA 16 ÇIKTI ONU DA TEKRAR BASAMKLARINA AYIRIP CARPINCA
		    6 CIKTI. 6 TEK BASAMAKLI OLDUĞU İÇİN BİTTİ. (TEK BASAMKLI OLANA KADAR DEVAM EDİYOR TEK BASAMAK ÇIKINCA BİTİYOR.)
		    BÖYLECE KAÇ ADIM DEVAM ETTİYSEK O KADAR CARPIM DİRENCİNE SAHİO OLUYOR.
		  
		  
		  */
		
		Scanner input = new Scanner(System.in);
		
		int  birlerBasamagi, onlarBasamagi, sayac = 0, enBuyuk = 0, enBuyukSayi = 0, tempSayi;
		
		
		for (int sayi = 10; sayi <= 100; sayi++) {
			tempSayi=sayi;
			while (tempSayi >= 10) {
				birlerBasamagi = tempSayi%10;
				onlarBasamagi = tempSayi/10;
				tempSayi = birlerBasamagi*onlarBasamagi;
				sayac++;
			}
			if (sayac>enBuyuk) {
				enBuyuk = sayac;
				enBuyukSayi = sayi;
			}
			sayac = 0;
			
		}
		
		
		 System.err.println("Carpim direnci en fazla olan 2 basamakli sayi: "+enBuyukSayi);
		
		
			
		}
	}


