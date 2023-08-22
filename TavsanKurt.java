package projeler;

import java.util.Scanner;

public class TavsanKurt {

	public static void main(String[] args) {
		
		/*
		  SORU 46
		  
		  DOGADAKI KURT VE TAVSAN SAYİSİ FORMULLERİ
		  
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("kurt sayisini giriniz : ");
		 double k = input.nextInt();
		 
		 System.out.print("tavsan sayisini giriniz : ");
		 double t = input.nextInt();
		 
		 System.out.print("gun sayisini giriniz : ");
		 double gun = input.nextInt();
		
		 int counter = 1 ;
		 double tYarin = 0 , kYarin = 0;
		 
		 while (counter != gun+1) {
			
			 tYarin = (1 + 0.01) *t - 0.00001 *t *k ;
			 kYarin =(1 - 0.005)*k + 0.00001*t *k ;
			 
			 t = tYarin;
			 k = kYarin;
			 
			 System.out.printf("\n %2d.  GUN ---> KURT SAYISI = %.0f  TAVSAN SAYISI =  %.0f" , counter , k , t);
			 
			 counter++; 
		}
		 
		 
		 
		
	}

}
