package Odev;

public class percentEvenClass {
	
	int sayac=0;
	
	public double percentEven(int[]dizi) {
		
		for (int counter = 0; counter < dizi.length; counter++) {
			if (dizi[counter] % 2 == 0) {
				sayac++;
			}
		}
		return sayac*100/dizi.length ;
	}
	

}
