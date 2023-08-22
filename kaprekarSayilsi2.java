package projeler2;

public class kaprekarSayilsi2 {

	public static void main(String[] args) {
		
		
		/* 
		       SORU 22 :
		       
		    1 İLE 10.000 ARASINDAKİ KAPREKAR SAYILARINI YAZDIRMA
		       
		    KAPREKAR SAYISI
		   
		    BİR SAYINI KARESİ ALINIR KARESİ İKİYE AYRILIR VE SAĞ TARAF İLE SOL TARAFIN TOPLAMI SAYIYA EŞİT İSE BU SAYI KAPREKAR SAYISIDIR.
		    
		    ORNEK : 
		      
		     45 SAYISI 
		       
		     45² = 2025
		        
		     20 + 25 = 45   
		     
		     NOT:  3 BASAMAKLI VE 4 BASAMKLI SAYILARIN KARELERİ ORNEGIN 2223 UN KARESİ 4,941,729 CIKIYOR BURDA SAYININ UZUNLUGU KADAR SOLDAN GERİSİNİ SAGDAN ALACAĞIZ
		     YANİ SOL TARAF 1729 İKEN SAĞ TARAF 494 OLACAK VE İKİSİNİN TOPLAMI  1729 + 494 = 2223 OLUP KAPREKAR SAYISI OLACAKTIR
		       
		       
		       */
		
		for (int isKaprekar = 1; isKaprekar < 10000; isKaprekar++) {
			
			int sayikaresi = isKaprekar * isKaprekar;
			
			String stringKare = Integer.toString(sayikaresi);
					
			double uzunluk = stringKare.length();
			
			double solUzunluk = Math.ceil(uzunluk/2);
						
			double solTaraf = sayikaresi % Math.pow(10, solUzunluk);
			
			double sagTaraf = sayikaresi / Math.pow(10, solUzunluk);
			
					
			if (isKaprekar ==Math.round( sagTaraf+solTaraf)) {
				System.out.println("\n"+isKaprekar+" SAYISI KAPREKAR SAYISIDIR.");
				System.out.printf("SAG TARAF :%.0f \nSOL TARAF :%.0f ",sagTaraf,solTaraf);
				System.out.println();
			}
			
			
			
			
			
		}
		
		
		
	}

}
