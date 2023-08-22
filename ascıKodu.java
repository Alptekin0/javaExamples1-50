package projeler3;

public class ascıKodu {

	public static void main(String[] args) {
		
		/*
	 SORU 4 : 
	   
	   65 İLE 84 ARASINDAKİ SAYILARIN ASCII TABLOSUNDAKİ KARŞILIĞINI EKRANA YAZDIRAN PROGRAM.
	 
	 
		  */
		
		System.out.println("ASCII KOD --------------------------> HARFLER ");
		System.out.println("\n\n");
		
		for (int ascii = 65; ascii < 84; ascii++) {
			System.out.print("\t");
			System.out.println(ascii+"--------------------------> "+(char)ascii);		
			
		}
		
		
		
	}

}
