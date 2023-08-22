package projeler2;

public class ilgincSayi {

	public static void main(String[] args) {
		
		/* 
		     SORU 17:
		     
		     İKİ BASAMAKLI İLGİNC SAYİLARİ BULMA
		     
		     ORNEK:
		        
		        4913 = (4+9+1+3)³    BASAMAKLARININ TOPLAMININ KÜPÜ KENDİSİNE EŞİT İSE İLGİNC SAYİDİR.
		     
		     
		     */
		
		int basamaklarToplami = 0;
		
		for (int counter = 100; counter < 1000; counter++) {
			
			int temp = counter;
			
			while (temp !=0) {
				basamaklarToplami += temp % 10;
				temp = temp / 10;
			}
			if (Math.pow(basamaklarToplami, 3) == counter) {
				System.out.println(counter+" ILGINC SAYIDIR");
			}
			basamaklarToplami = 0;
		}		
		
		
		
	}

}

