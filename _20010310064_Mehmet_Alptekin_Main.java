package _20010310064_Mehmet_Alptekin;

import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _20010310064_Mehmet_Alptekin_Main {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("boole.txt");
		Scanner input = new Scanner(file);
		
		ArrayList<Character> boole = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		String[] terimler = null;
		Set<Character> degiskenler = new LinkedHashSet<>();
		int seviye = 0;
		
		dosyaOku(input, boole);
		System.out.println("boole.txt dosyasi okundu.");
		input.close();
		bekle(1);
		
		degiskenler = degiskenleriBul(boole, degiskenler);
		terimleriBul(terimler, boole, map);
		seviye = seviyeBul(map, seviye);
		System.err.println("Devre " + seviye + " seviyelidir.\n\n");
		bekle(1);
		
		kapiGirisleriYazdir(boole, map);
		
		System.out.println("\n\n");
		
		
		Scanner input2 = new Scanner(System.in);
		List<Character> degisken = new ArrayList<Character>(degiskenler);
		ArrayList<Integer> degiskenDegerleri = new ArrayList<>();
		
		bekle(1);
		for (int i = 0; i < degisken.size(); i++) {
			System.out.print(degisken.get(i)+" degiskeni degerini giriniz : ");
			int deger = input2.nextInt();
			if (deger != 0 && deger != 1) {
				System.err.println("Yanlis Deger Girildi. Program sonlandi.");
				break;}
			degiskenDegerleri.add(deger);
		}
		input2.close();
		
		
		booleFonksiyonuHesapla(boole, degisken, degiskenDegerleri);

		
	}
	static ArrayList<Character> dosyaOku(Scanner input, ArrayList<Character> boole) {
		while (input.hasNext()) {
			String string = input.next();
			if (!string.equals("")) {
				for (int counter = 0; counter < string.length(); counter++) {
					boole.add(string.charAt(counter));
				}
			}
		}
		boole.remove(0);
		boole.remove(0);
		return boole;
	}
	
	
	static Set<Character> degiskenleriBul(ArrayList<Character> boole, Set<Character> degiskenler) {
	    for (Character c : boole) {
	        if (Character.isLetter(c)) {
	            degiskenler.add(c);
	        }
	    }
	    return degiskenler;
	}
	
	static Map<String, Integer> terimleriBul(String[] terimler, ArrayList<Character> boole, Map<String, Integer> map) {
		
		StringBuilder sb = new StringBuilder();
		for (Character character : boole) {
			sb.append(character);
		}
		String ifade = sb.toString();
		
		terimler = ifade.split("\\+");
		
		int degil = 0;
		int ve = 0;
		int veya = terimler.length - 1;
		
		for (String terim : terimler) {
            for (int i = 0; i < terim.length(); i++) {
                if (terim.charAt(i) == '\'') {
                    degil++;
                }
            }

            int degiskenSayisi = 0;
            for (int i = 0; i < terim.length(); i++) {
                char c = terim.charAt(i);
                if (Character.isLetter(c)) {
                    degiskenSayisi++;
                }
            }
            if (degiskenSayisi > 1) {
                ve += degiskenSayisi - 1;
            }
        }
		
		 map.put("ve", ve);
		 map.put("veya", veya);
		 map.put("degil", degil);
		
		return map;
     }
	
	
	static int seviyeBul(Map<String, Integer> map, int seviye){

		if (map.get("not") != null && map.get("not") > 0) 
		    seviye = 1;
		if (map.get("ve") != null && map.get("ve") > 0) 
		    seviye = 2;
		if (map.get("veya") != null && map.get("veya") > 0) 
		    seviye = 3;
		return seviye;
	}
	
	static void kapiGirisleriYazdir(ArrayList<Character> boole, Map<String, Integer> map) {
	    StringBuilder sb = new StringBuilder();
	    for (Character character : boole) {
	        sb.append(character);
	    }
	    String ifade = sb.toString();
	    String[] terimler = ifade.split("\\+");
	    
	    System.err.println("1. Seviye icin : ");
	    System.out.println("Kapi turu: DEGIL, " + map.get("degil") + " tane kapi var");
	    
	    int degilKapiSayisi = 0;
	    List<Character> degilGirisleri = new ArrayList<>();
	    for (String terim : terimler) {
	    	
	        for (int i = 0; i < terim.length(); i++) {
	            if (i < terim.length() - 1 && terim.charAt(i+1) == '\'') {
	                degilGirisleri.add(terim.charAt(i));
	                degilKapiSayisi++;
	            }
	        }
	    }
	    

	    for (int i = 0; i < degilKapiSayisi; i++) {
	    	
	        if (i < degilGirisleri.size()) {
	            System.out.println((i+1) + ". Kapinin girisi: " + degilGirisleri.get(i));
	        }
	    }
	    

	    bekle(1);
	    System.err.println("\n\n2. Seviye icin : ");
	    System.out.println("Kapi turu:  VE, " + map.get("ve") + " tane kapi var");
	    
	    int veKapiSayisi = 0;
	    List<List<String>> veGirisleri = new ArrayList<>();
	    
	    for (String terim : terimler) {
	    	
	        List<Character> degiskenler = new ArrayList<>();
	        List<Character> degilKapilari = new ArrayList<>();
	        
	        for (int i = 0; i < terim.length(); i++){
	        	
	            char c = terim.charAt(i);
	            
	            if (Character.isLetter(c)) {
	            	
	                if (i < terim.length() - 1 && terim.charAt(i+1) == '\''){
	                    degilKapilari.add(c);
	                } 
	                else{
	                    degiskenler.add(c);
	                }
	                
	            }
	        }
	        
	        if (degiskenler.size() + degilKapilari.size() > 1) {
	        	
	            List<String> girisler = new ArrayList<>();
	            
	            for (Character c : degiskenler) {
	                girisler.add(String.valueOf(c));
	            }
	            
	            for (int i = 0; i < degilKapilari.size(); i++) {
	                girisler.add((i+1) + ". DEGIL kapisi");
	            }
	            
	            veGirisleri.add(girisler);
	            veKapiSayisi++;
	        }
	    }
	    

	    
	    for (int i = 0; i < veKapiSayisi; i++){
	    	
	        if (i < veGirisleri.size()){
	        	
	            List<String> girisler = veGirisleri.get(i);
	            System.out.print((i+1) + ". Kapi " + girisler.size() + "-girisli ve girisleri: ");
	            System.out.println(String.join(", ", girisler));
	            
	        }
	    }
	    
	    
	    bekle(1);
	    System.err.println("\n\n3. Seviye icin : ");
	    System.out.println("Kapi turu: VEYA, " + map.get("veya") + " tane kapi var.");
	    
	    
	    if (map.get("veya") > 0){
	    	
	        List<String> veyaGirisleri = new ArrayList<>();
	        int veKapiIndeks = 1;
	        
	        for (int t = 0; t < terimler.length; t++){
	        	
	            String terim = terimler[t];
	            
	            if (terim.length() == 1 && Character.isLetter(terim.charAt(0))){
	            	
	                veyaGirisleri.add(String.valueOf(terim.charAt(0)));
	            } 
	            else if (terim.length() == 2 && Character.isLetter(terim.charAt(0)) && terim.charAt(1) == '\''){
	            	
	                int degilIndex = 0;
	                for (int i = 0; i < degilGirisleri.size(); i++) {
	                    if (degilGirisleri.get(i) == terim.charAt(0)) {
	                        degilIndex = i + 1;
	                        break;
	                    }
	                }
	                veyaGirisleri.add(degilIndex + ". DEGIL kapisi");
	            } 
	            else{
	                int literalCount = 0;
	                for (int i = 0; i < terim.length(); i++) {
	                    if (Character.isLetter(terim.charAt(i))) {
	                        literalCount++;
	                    }
	                }
	                if (literalCount > 1) {
	                    veyaGirisleri.add(veKapiIndeks + ". VE kapisi");
	                    veKapiIndeks++;
	                }
	            }
	            
	        }
	  
	        System.out.println("1. Kapi " + veyaGirisleri.size() + "-girisli ve girisleri: " + String.join(", ", veyaGirisleri));
	    }
	}
	
	
	static void booleFonksiyonuHesapla(ArrayList<Character> boole, List<Character> degisken, ArrayList<Integer> degiskenDegerleri){
		
	    String ifade = "";
	    
	    for (int i = 0; i < boole.size(); i++) {
	        ifade = ifade + boole.get(i);
	    }
	    
	    String[] terimler = ifade.split("\\+");
	    
	    boolean sonuc = false;
	    
	    for (int t = 0; t < terimler.length; t++) {
	        String terim = terimler[t];
	        boolean terimSonuc = true;
	        
	        for (int i = 0; i < terim.length(); i++) {
	        	
	            char ch = terim.charAt(i);
	            
	            if (ch >= 'A' && ch <= 'Z'){
	            	
	                int index = -1;
	                
	                for (int j = 0; j < degisken.size(); j++){
	                	
	                    if (degisken.get(j) == ch){
	                    	
	                        index = j;
	                        
	                        break;
	                    }
	                }
	                
	                int deger = degiskenDegerleri.get(index);
	                boolean degerBool = false;
	                
	                if (deger == 1) {
	                    degerBool = true;
	                }
	                
	                if (i+1 < terim.length() && terim.charAt(i+1) == '\'') {
	                    if (degerBool == true)  {
	                        degerBool = false;
	                    } 
	                    else{
	                        degerBool = true;
	                    }
	                    i++;
	                }

	                
	                if (degerBool == false){
	                    terimSonuc = false;
	                 }
	            }
	        }

	        
	        if (terimSonuc == true){
	            sonuc = true;
	        }
	    }
	    
	    bekle(1);
	    System.out.print("\n");
	    if (sonuc == true){
	        System.err.println("Devrenin Sonucu: 1");
	    }
	    else{
	        System.err.println("Devrenin Sonucu: 0");
	    }
	}
		
	
	
	
	static void bekle(int saniye) {
	    try{
	        Thread.sleep(saniye * 1000L);
	    }
	    catch (Exception e) {
	    	System.out.println("error : "+e);
		}
	}
}
