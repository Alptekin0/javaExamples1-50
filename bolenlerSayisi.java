package projeler2;

public class bolenlerSayisi {

	public static void main(String[] args) {
		
		/* 
		     SORU 26:
		     
		     1 İLE 1000 ARASINDA EN COK BOLENİ OLAN SAYI HANGİSİDİR ? DİYE BULAN UYGULAMA
		     		     
		     */
		
		int sayac = 0;
		int enBuyuk = 0;
		int enCokBolen = 0;
		for (int counter = 1; counter <= 1000; counter++) {
			for (int counter2 = counter; counter2 > 0; counter2--) {
				
				if (counter % counter2 == 0) {
					sayac++;
				}
			}
			if (sayac >= enBuyuk) {
				enBuyuk = sayac;
				enCokBolen = counter;
			}
			sayac = 0;
			
		}
		
		System.out.println(enCokBolen+"--->"+enBuyuk+" tane tam boleni vardir.");
		
		
		
	}

}
