package projeler2;

public class ucunKuvveti {

	public static void main(String[] args) {
		
		/*
		    SORU 34 : 
		    
		      15.000 BİNDEN BÜYÜK 3'ÜN KUVVETİ OLAN SAYI HANGİSİDİR VE 3'ÜN KAÇINCI KUVVETİDİR.
		  
		  */
		
		
		double kuvvet = 0;
		double counter = 1;
		int sayac = 0;
		
		while (kuvvet < 15000) {
			
			kuvvet = Math.pow(3, counter);
			
			counter++;
			sayac++;
		}
		
		System.out.printf("15.000 den kucuk ve 3'un kuvveti olan en kucuk tam sayi %.0f. \nBu sayi 3'un %d. kuvvetidir.", kuvvet, sayac);
		
	}

}
