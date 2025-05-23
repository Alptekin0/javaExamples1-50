package _20010310064_Mehmet_Alptekin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class _20010310064_Main {
	

    public static final int KERNEL_PROSES = 0;
    public static final int PRODUCER_PROSES = 1;
    public static final int CONSUMER_PROSES = 2;

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		File dosya = new File("girdi.txt");
		
        Scanner input = new Scanner(dosya);
        
        Kernel kernel = new Kernel();
        
        ArrayList<Olay> olaylar = new ArrayList<>(); 
        
        int maxSaniye = 0;
        
        boolean olaylarBolumu = false;
        
        while (input.hasNextLine()) {
        	
            String satir = input.nextLine();
            
            if (satir.trim().equals("prosesler:")) {
                continue;
            }
            if (satir.trim().equals("olaylar:")){
                olaylarBolumu = true;
                continue;
            }
            if (satir.trim().isEmpty()){
                continue;
            }
            
            if (olaylarBolumu == false) {
            	
                String[] parcalar = satir.split(" ");
                if (parcalar.length >= 3) {
                    if (parcalar[0].equals("producer")) {
                        int adet = Integer.parseInt(parcalar[1]);
                        for (int i = 0; i < adet; i++) {
                            kernel.prosesEkle(parcalar[2 + i], PRODUCER_PROSES);
                        }
                    } 
                    else if (parcalar[0].equals("consumer")) {
                        int adet = Integer.parseInt(parcalar[1]);
                        for (int i = 0; i < adet; i++) {
                            kernel.prosesEkle(parcalar[2 + i], CONSUMER_PROSES);
                        }
                    }
                }
            } 
            else {
                String[] parcalar = satir.split(" ", 3);
                if (parcalar.length >= 2) {
                    String prosesIsmi = parcalar[0];
                    int saniye = Integer.parseInt(parcalar[1]);
                    
                    if (saniye > maxSaniye) {
                        maxSaniye = saniye;
                    }
                    
                    if (prosesIsmi.startsWith("p")) {
                        String mesaj = "";
                        if (parcalar.length >= 3){
                            mesaj = parcalar[2].replace("\"", "");
                        }
                        Olay yeniOlay = new Olay(saniye, prosesIsmi, mesaj);
                        olaylar.add(yeniOlay);
                    } 
                    else if (prosesIsmi.startsWith("c")){
                        Olay yeniOlay = new Olay(saniye, prosesIsmi, "");
                        olaylar.add(yeniOlay);
                    }
                }
            }
        }
        
        
        
        System.out.println("girdi.txt dosyasi okundu.\n");
        
        for (int saniye = 0; saniye <= maxSaniye; saniye++) {
        	
            System.out.print(saniye + ". Saniye :  ");
            
            for (int i = 0; i <olaylar.size(); i++) {
                Olay olay = olaylar.get(i);
                if (olay.saniye == saniye) {
                    if (olay.prosesIsmi.startsWith("p")){
                        kernel.writeCagrisi(olay.prosesIsmi, olay.mesaj, saniye);
                    } 
                    else if (olay.prosesIsmi.startsWith("c")){
                        kernel.readCagrisi(olay.prosesIsmi, saniye);
                    }
                }
            }
            
            System.out.println("\n");
            
            if (saniye < maxSaniye) {
                Thread.sleep(1000);
            }
        }
    }
    
    static class Proses{
    	
        String isim;
        int tip;
        boolean bloklu;
        
        public Proses(String isim, int tip)  {
            this.isim = isim;
            this.tip = tip;
            this.bloklu = false;
        }
    }
    
    static class Olay{
        int saniye;
        String prosesIsmi;
        String mesaj;
        
        public Olay(int saniye, String prosesIsmi, String mesaj) {
            this.saniye = saniye;
            this.prosesIsmi = prosesIsmi;
            this.mesaj = mesaj;
        }
    }
    
    static class Kernel {
    	
    	Queue<String> pipe;
        ArrayList<Proses> bekleyenProducerlar;
        ArrayList<Proses> bekleyenConsumerlar;
        ArrayList<Proses> prosesler;
        private static final int PIPE_KAPASITE = 3;
        
        public Kernel(){
        	
            pipe = new LinkedList<String>();
            bekleyenProducerlar = new ArrayList<Proses>();
            bekleyenConsumerlar = new ArrayList<Proses>();
            prosesler = new ArrayList<Proses>();
            
            prosesler.add(new Proses("kernel", KERNEL_PROSES));
        }
        
        public void prosesEkle(String isim, int tip){
            Proses yeniProses = new Proses(isim, tip);
            prosesler.add(yeniProses);
        }
        
        public Proses prosesBul(String isim){
            for (int i = 0; i < prosesler.size(); i++) {
                Proses p = prosesler.get(i);
                if (p.isim.equals(isim)) {
                    return p;
                }
            }
            return null;
        }
        
        public void writeCagrisi(String prosesIsmi, String mesaj, int saniye){
            Proses proses = prosesBul(prosesIsmi);
            
            System.out.print(prosesIsmi + " prosesi write cagrisi yapti");
            
            if (pipe.size() >= PIPE_KAPASITE) {
                proses.bloklu = true;
                bekleyenProducerlar.add(proses);
                System.out.print(prosesIsmi + " prosesi bloklandi ve kuyruga alindi");
            } else {
                pipe.add(mesaj);
                
                if (bekleyenConsumerlar.size() > 0) {
                	
                    Proses bekleyenConsumer = bekleyenConsumerlar.get(0);
                    bekleyenConsumerlar.remove(0);
                    bekleyenConsumer.bloklu = false;
                    String okunanMesaj = pipe.poll();
                    System.out.print(bekleyenConsumer.isim + " prosesi uyandirildi.  Okunan mesaj: \"" + okunanMesaj + "\"");
                }
            }
        }
        
        public void readCagrisi(String prosesIsmi, int saniye){
            Proses proses = prosesBul(prosesIsmi);
            
            System.out.print(prosesIsmi + " prosesi read cagrisi yapti.");
            
            if (pipe.size() == 0){
            	
                proses.bloklu = true;
                bekleyenConsumerlar.add(proses);
                System.out.print(prosesIsmi + " prosesi bloklandi ve kuyruga alindi");
            } 
            else{
            	
                String mesaj = pipe.poll();
                System.out.print(prosesIsmi + " prosesi okunan mesaj  : \"" + mesaj + "\"");
                
                if (bekleyenProducerlar.size() > 0){
                    Proses bekleyenProducer = bekleyenProducerlar.get(0);
                    bekleyenProducerlar.remove(0);
                    bekleyenProducer.bloklu = false;
                    System.out.print(bekleyenProducer.isim + " prosesi  uyandirildi.");
                }
            }
        }
        
        

	}

}
