package projeler3;

import java.util.Scanner;

public class formul {

	public static void main(String[] args) {
		
		/*
	 SORU 13 : 
	     
	     KLAVYEDEN GİRİLEN X VE N DEĞERİNE GÖRE;
	     
	      T = 1 -  X/1  +  X²/2  +  X³/3  +  X⁴/4 ...... Xⁿ/N
	      
	      FORMULUNUN CEVABINI VEREN PROGRAM.
	      
		  */
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("x degerini giriniz: ");
		double x = input.nextInt();
		System.out.print("n degerini giriniz : ");
		double n = input.nextInt();
		
		double sonuc = 0, T;
		
		for (double counter = 1; counter <= n; counter++) {
			
			sonuc += (Math.pow(x, counter)) / counter;
			
		}
		
		T = 1 - sonuc;
		
		System.out.println("FORMULUN SONUCU : "+T);
		
		
	}

}
