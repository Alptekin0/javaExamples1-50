package projeler2;

public class uslerCarpimi {

	public static void main(String[] args) {
		
		/*    
		  
		  SORRU 23 : 
		  
		   ASAGIDAKI ORNEĞE UYACAK 4 BASAMAKLI SAYILARI YAZDIRAN PROGRAM
		   
		   ORNEK : 
		      
		       2593 = 2⁵ + 9³
		  
		  
		  */
		
		
		for (int counter = 1000; counter < 10000; counter++) {
			
			int ilkIkıBasamak = counter / 100;
			int sonIkıBasamak = counter % 100;
			
			int ilkTaban = ilkIkıBasamak /10;
			int ilkUs = ilkIkıBasamak %10;
			int sonTaban = sonIkıBasamak /10;
			int sonUs = sonIkıBasamak %10;
			
			Double uslerToplami =Math.pow(ilkTaban, ilkUs)*Math.pow(sonTaban, sonUs);
			
			if (counter == uslerToplami) {
				System.err.println(counter);
			}
			
		}
		
		
		
	}

}
