package projeler3;

public class onuncuTerim {

	public static void main(String[] args) {
		
		/*
		  SORU 35 :
		  
		     BU SORUYA RESİMDEN BAKMAK DAHA İYİ OLUR ORDA ÖRÜNTÜ NET BİR ŞEKİLDE BELLİ.
		  
		     S{1} = 1   S{2} = 1+ 1/1    S{3} = 1 + 1/(1 + 1/1)   SERİSİNİN 10. ADIMDA KACA ESİT OLACAĞINI BULMA.
		  
		  
		  
		  */
		
		
		double s1= 1;
		
		for (int counter = 0; counter < 10; counter++) {
			s1 = 1+1/(s1);
		}
		
		System.out.printf("%.5f",s1);
		
		
		
	}

}
