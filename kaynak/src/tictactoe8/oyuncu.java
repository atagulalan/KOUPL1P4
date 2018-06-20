package tictactoe8;
import java.util.Scanner;
import java.util.Random;


public class oyuncu{
   
   public Scanner keyboard = new Scanner(System.in);
    public String oyuncu1;
    public boolean insanMi;
    public char secim;
    public String hamle;
    public String harfler="YABCDEFG",sayilar="Y1234567"; //Tahtayi Isımlendirecek Harf ve Numara String Dizileri
    
    public oyuncu(){
       System.out.print("Adinizi Giriniz : ");
       oyuncu1=keyboard.next();
       secim='X';
       insanMi=true;
    }
    
     public oyuncu(boolean insanmiKontrolu){
       System.out.print("Adinizi Giriniz : ");
       oyuncu1=keyboard.next();
        insanMi=insanmiKontrolu;
       if(insanMi==true){
           secim='X';
       }
       else secim='O';
    }
     
      public oyuncu(boolean insanmiKontrolu,char kr){
       System.out.print("Adinizi Giriniz : ");
       oyuncu1=keyboard.next();
       insanMi=insanmiKontrolu;
       secim=kr;
    }
    
      public char karakteriAl(){
      return secim;
      }
      
      public boolean oyuncuTurunuAl(){
          return insanMi;
      }
      
      public String oyuncununHamlesiniAl(){
          return hamle;
      }
      
      public  String insanOyuncuHamlesiniKontrol(){
          System.out.println("Hamle sirasi sizde. Lutfen bir hamle yapiniz.");
          hamle=keyboard.next();
          return hamle;
      }
      
      
      
      public String bilgisayarHamlesiUret(){
          Random random1 = new Random(),random2 = new Random();
          int hamle1=random1.nextInt(5)+1,hamle2=random2.nextInt(5)+1;
          
          
          
      }
    
}


