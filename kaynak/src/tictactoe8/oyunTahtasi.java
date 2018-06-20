package tictactoe8;
import java.util.Scanner;

public class oyunTahtasi { //TicTacToe Tahta Nesnesi
    Scanner keyboard;
    
    //OyunTahtasi Sinifinin Genel Degiskenleri
    public char [][] oyunTahtasi; //Ekrana Yazdırilan ve Uzerinde Islem Yapilan Tahta
    int boyut; //Oyun Tahtasi Boyutu
    public String harfler="YABCDEFG",sayilar="Y1234567"; //Tahtayi Isımlendirecek Harf ve Numara String Dizileri
    public String hamle; //Oyuncularin yapicaklari "1A,3E,2C" Seklindeki Stringler
    
   
    
    
    
    
    
    public oyunTahtasi(){ //OyunTahtasinin 1.Yapisi Parametresiz Bos Bir Tahta Olusturur
        System.out.println("#TicTacToe#\nBoyutunu giriniz (3,5,7,...,) : ");
        boyut=keyboard.nextInt();
        boyut++;
        char[][] oyunTahtasi = new char [boyut][boyut];
        for(int i=0;i<boyut;i++){
            for(int j=0;j<boyut;j++){
                oyunTahtasi[i][j]='W'; //Ekrana Bos Kisimlari Yazdirabilmek Icin Oncelikle Her Hucreye 'W' Atanır
            }
        }
        for(int i=1;i<boyut;i++){
           oyunTahtasi[0][i]=harfler.charAt(i); //Bos Tahtaya Harfleri Siralar
           oyunTahtasi[i][0]=sayilar.charAt(i); //Bos Tahtahya Sayilari Siralar
        }
        
}
    
   
    public oyunTahtasi(char [][] oyunTahtasi){ //OyunTahtasinin 2.Yapisi Kaydedilen veya El Ile Girilen Tahta Uzerinden Baslar
        this.oyunTahtasi=oyunTahtasi;
    }
    
    //##METHODLAR##
    
    public char[][] oyunTahtasiniAl(){  //OyunTahtasini Dondurur, Oyunu Kaydetmek Icin Kullanilabilir
        return this.oyunTahtasi;
    }
    
    public void oyunTahtasiniYazdir(){ //Oyun Tahtasini Ekrana Yazdirir
        for(int i=0;i<this.boyut;i++){
            for(int j=0;j<this.boyut;j++){
                if(this.oyunTahtasi[i][j]=='W'){ //Onceden 'W' Atadimiz Hucreleri 
                    System.out.print((" |   | "));} //Simdi Bos Olarak Yazdiriyoruz
                else System.out.print(" | "+this.oyunTahtasi[i][j]+" | ");
            }
        }
    }
  
    public boolean hamleyiYaz(String koordinat,char oyuncu){
         oyuncu gereksiz = new oyuncu();
         char secim = gereksiz.secim;
         
        if(oyunTahtasi[hamle.charAt(0)+1][hamle.charAt(1)+1]=='W'){
            oyunTahtasi[hamle.charAt(0)+1][hamle.charAt(1)+1]=secim;
            return true;
        }
        else return false;
      
       
    }
    
   public boolean kazanan(char oyuncu){
        return true;
    }
    
    public boolean beraberlikKontrol(){
        return true;
    }
    
    
   
    }