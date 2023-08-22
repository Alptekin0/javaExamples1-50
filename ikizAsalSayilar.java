package projeler;

public class ikizAsalSayilar {

	public static void main(String[] args) {

		/*
		  SORU 15:
		 
		   ARALARINDA İKİ FARK OLAN ASAL SAYILARA İKİZ ASALLAR DENİR. BU UYGULAMA CİFT
		   SAYILI İKİZ ASALLARI BULUP YAZDIRIR.
		  
		 */

		boolean durum = true;
		int asal = 0;

		for (int counter = 10; counter < 100; counter++) {
			for (int counter2 = counter - 1; counter2 > 1; counter2--) {
				if (counter % counter2 == 0) {
					durum = false;
				}
			}
			if (durum == true) {

				if (counter - asal == 2) {
					System.out.println("ikiz asallar : " + asal + " ve " + counter);
				}

				asal = counter;
			}
			durum = true;
		 }

		
	}

}