package projeler;

public class HocaSaatSorusu {

	public static void main(String[] args) {
		
		/*
		  SORU 45 :
		   
		 İLK İKİ BASAMAĞININ KARESİ VE SON İKİ BASAMAĞINI KARESİNİN TOPLAMI KENDİSİNİ VEREN SAYİLAR
		 
		 ÖRN:
		        8833 = 88² + 33²
		                                 */
		
		int ilkİkiBasamak = 0, SonİkiBasamak = 0;
		
		int deger;
		
		for (int counter = 1000; counter < 10000; counter++) {
			
		ilkİkiBasamak = counter / 100;
		SonİkiBasamak = counter % 100;
		
		  if (counter == Math.pow(ilkİkiBasamak, 2)+ Math.pow(SonİkiBasamak, 2)) {
			System.out.println(counter);
		  }			
		}
		
		
	}

}
