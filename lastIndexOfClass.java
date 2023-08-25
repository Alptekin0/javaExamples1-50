package Odev;

public class lastIndexOfClass {
	
	public int lastIndexOf(int[]dizi , int arananDeger) {
		
		for (int counter = dizi.length -1 ; counter >= 0; counter--){
			
			if (dizi[counter] == arananDeger) {
				return counter;
			}
		}
		
		return -1;
		
	}

}