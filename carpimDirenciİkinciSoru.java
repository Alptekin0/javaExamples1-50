package projeler3;

public class carpimDirenciİkinciSoru {

	public static void main(String[] args) {
		/*
		 
		 SORU 41 : 
		 
		  İKİ BASAMAKLI TÜM SAYILARIN CARPIM DİRENCİNİ EKRANA YAZDIRAN UYGULAMADIR.
		 
		  
		  CARPIM DİRENCİ :  BİR SAYININ RAKAMLARI CARPILIP CIKAN SONUC TEK BASMAKLI OLANA KADAR DEVAM EDİP
		  KAÇ ADIM DEVAM EDİLDİ İSE O KADAR CARPIM DİRENCİNE SAHİPTİR
		  
		  ÖRNEK : 
		  
		    82 --> 8 * 2 = 16
		    16 --> 1 * 6 = 6   
		    
		    82'NİN CARPIM DİRENCİ 2 DİR. BASAMAKLARINA AYIRIP CARPINCA 16 ÇIKTI ONU DA TEKRAR BASAMKLARINA AYIRIP CARPINCA
		    6 CIKTI. 6 TEK BASAMAKLI OLDUĞU İÇİN BİTTİ. (TEK BASAMKLI OLANA KADAR DEVAM EDİYOR TEK BASAMAK ÇIKINCA BİTİYOR.)
		    BÖYLECE KAÇ ADIM DEVAM ETTİYSEK O KADAR CARPIM DİRENCİNE SAHİO OLUYOR.
		  
		  */
		
		int tempCounter, birlerBasamagi, onlarBasamagi, sayac=0;
		
		for (int counter = 10; counter <= 100; counter++) {
			
			tempCounter = counter;
			while (tempCounter >= 10) {
				onlarBasamagi = tempCounter/10;
				birlerBasamagi =tempCounter%10;
				tempCounter = birlerBasamagi*onlarBasamagi;
				sayac++;
			}
			System.out.println(counter+" sayisinin carpim katsayisi : "+sayac);
			sayac = 0;
		}
		
		
		
		
		
		
	}

}
