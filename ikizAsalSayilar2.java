package projeler;

public class ikizAsalSayilar2 {

	public static void main(String[] args) {
		
		
		/*        
		     SORU 16 :
		     
		     İKİZ SAYİLARİ BULMA PROGRAMINI YAPMIŞTIK.
		     İKİ TANE İKİZ SAYIYININ CARPIMILARINA BİR EKLENİRSE TAM KARE BİR DEGER OLACAK
		     İKİZ SAYİLARİ BULUP CARPIMLARINA BİR EKLENİP TAM KAREYE CEVİREN UYGULMA
		     
		  
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

					int tamKare = counter * asal + 1;
					System.out.println("iki ikiz asal sayini carpimi sonucu olusan tam kare = " + tamKare);

				}

				asal = counter;

			}
			durum = true;
		}

	}

}
