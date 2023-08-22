package projeler3;

import java.util.Scanner;

public class yenilenMuzSayisi {

	public static void main(String[] args) {
		
		
		
		/*
		   
		  SORU 11 : 
		  
		   Bir hayvanat bahçesinde bulunan dişi maymun bahcede gün boyunca dolasip kafesine girip ckmakta ve her giriginde
		   giris sayısı kadar muz yemektedir. (Ornegin 3. girisinde 3 adet, 4. giriginde 4 adet muz yemektedir.) Ancak 5. ve
		   sonraki girisinde ( kafese giris sayisi, y    yedigi toplam muz sayisi, m) olmak üzere formülde ki kadar muz yemektedir.
		   ((y - m) / 2) + 1 (Formul ün sadece tam kismi gecerlidir) Erkek maymunlar ise dişilerin yediklerinin 
		   2 kat kadar muz yemektedir. Bakıcının gün sonunda klavyeden girdigi cinsiyet ve toplam kafese giris sayisina göre
		   maymunun kafesine her giriginde yedigi toplam muz sayisini ekrana yazan programi kodlayiniz
		    
		    
		    ÖRNEK:
		    
		    Cinsiyet (d /D,e/E): D
		    
		    Giris sayisi : 6

            
            ÇIKTI :     
  
		    1. girisinde toplam 1 adet muz yemis oldu
		    2. girisinde toplam 3 adet muz yemis oldu
		    3. girisinde toplam 6 adet muz yemis oldu
		    4. girisinde toplam 10 adet muz yemis oldu
		    5. girisinde toplam 13 adet muz yemis oldu
		    6. girisinde toplam 17 adet muz yemis oldu
	   
		  
		  */
		
		
		int girisSayisi, yenilenMuzSayisi=0, erkekYenilenMuzSayisi;
		String cinsiyet;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cinsiyet (Disi maymun ise : D,d     Erkek maymun ise : E,e) : ");
		cinsiyet = input.nextLine();
		System.out.print("Giris sayisi : ");
		girisSayisi = input.nextInt();
		
		
		
		for (int counter = 1; counter <= girisSayisi; counter++) {
			
			if (counter > 4) {
				
			yenilenMuzSayisi += ((yenilenMuzSayisi - girisSayisi) / 2) + 1 ;
				
			}
			else {
				yenilenMuzSayisi += counter;
			}
			
			if (cinsiyet.equals("E") || cinsiyet.equals("e")) {
				erkekYenilenMuzSayisi = yenilenMuzSayisi * 2;
				System.out.println(counter +". girisinde toplam "+erkekYenilenMuzSayisi+" adet muz yemis oldu.");

			}
			else {
				System.out.println(counter +". girisinde toplam "+yenilenMuzSayisi+" adet muz yemis oldu.");
			}
			
			
			erkekYenilenMuzSayisi = 1;
			
		}		
	
		
		
	}
}
