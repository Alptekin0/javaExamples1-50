package projeler2;

public class mukemmelSayi2 {

	public static void main(String[] args) {
		
		/*
	     SORU 20:
	  
	   1 İLE 1000 ARASINDAKİ MUKEMMEL SAYILARI YAZDIRAN KOD
	   	  
	   MUKEMMEL SAYİ KENDİSİ HARİC BOLENLERİNİN TOPLAMI KENDİSİNE EŞİT OLAN SAYİLARA MUKEMMEL SAYİ DENİR.
	  
	   ÖRNEK : 
	  
	   6  = 3 + 2 + 1
	   28 = 14 + 7 + 4 + 2 + 1 
	   
	  */
	
		
		
		int basamaklarToplami = 0;

		for (int counter = 1; counter < 1000; counter++) {
			for (int counter2 = counter - 1; counter2 > 0; counter2--) {
				
				if (counter % counter2 == 0) {
					basamaklarToplami += counter2;
				}
				
			}

			if (basamaklarToplami == counter) {
				System.out.println(counter);
			}
			basamaklarToplami = 0;
		}

		
		
	}

}
