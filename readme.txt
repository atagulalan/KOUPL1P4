Nesneye Yönelik Tic Tac Toe
Bu readme.txt dosyası, Nesneye Yönelik Tic Tac Toe koduna aittir.
Bu paket, kod ile aynı dizin içerisinde bulunacaktır.


1-PAKETİN İÇERİĞİ:
----------
160202034-160202015.java - Tic Tac Toe'nun kaynak kodu.
readme.txt - Bu dosya.
Rapor.pdf - Bu projenin raporu.
----------

2-SİSTEM GEREKSİNİMLERİ:
-------------------
Java SDK 
-------------------

3-KURULUM:
-------------------
Paket içeriğini yukarıda görebilirsiniz.

Bu kod, iki adet Windows kurulu makinede çalıştırıldı:
- Ata'nın Windows 10 yüklü masaüstü bilgisayarında.
- Oğuzhan'ın Windows 8.1 yüklü dizüstü bilgisayarında.

Bu iki durumda da kod, herhangi bir hata vermeden, daha önceden belirlenen kriterlere
uygun çalıştı.

YUM komutunu kullanarak bu programın çalışması için gereken paketleri indirebilirsiniz.
Bazı derlemelerde Grafik Arayüzü ile de arama yapabilir ve paketi indirebilirsiniz.

Ubuntuda da aynı şekilde, APP-GET komutunu kullanabilir, veya Synaptic Paket Yöneticisi
ile paketlerde arama yapıp belirtilen paketi indirebilirsiniz.
-------------------


4-KODU DERLEMEK:
------------------
Artık bilgisayarımızda kurulu olan Java SDK ile kodu kolayca derleyebiliriz.

Windows için:

>javac 160202034-160202015.java 

Linux / Unix için:

>javac 160202034-160202015.java


Derleme bittikten sonra kolayca programı çalıştırabilirsiniz.
------------------


5- PARAMETRELER
---------------------------
Kodun çalışması için başlangıçta herhangi bir parametre gerekmiyor.
------------------



6- PROGRAMIN KULLANIMI
-----------------------------
Program, çalıştırıldığında öncelikle kayıt dosyası arar. Kayıt dosyası program konumunda var
ise oyunun kayıt dosyasıyla başlanıp başlanılmamasını kullanıcıya sorar. Kullanıcı kabul ederse
kayıtlı dosya çekilir ve okunarak oyun kayıtlı dosyadan başlatılır. Eğer kullanıcı istemez ise
veya kayıt dosyası bulunamazsa yeni oyun başlatılır ve kullanıcıdan oyunun boyutu ve kullanıcı adı
istenir.
Ardından kullanıcıdan istenen hamle ekrana yazdırılmış oyun tahtasının koordianatları yardımıyla alınır.
Kullanıcı satır&sütün sırası farketmeksizin giriş yaptığında o koordinat boş işe oyuncunun işareti o noktaya işler.
Eğer kullanıcının verdiği koordinat dolu ise kullanıcıdan tekrar bir hamle yapılması istenir.
Yan yana, üst üste ve çapraz şekilde üç işareti bir araya ilk getiren oyuncu, oyunu kazanır.
Eğer tüm noktalar dolar ve kazanan olmaz ise oyun beraberlikle sonuçlanır.
Ayrıca kullanıcı istediği zaman sırası geldiğinde hamle yapmak yerine "cikis" yazarak oyundan cıkabilir
ve oyunu kaydedebilir.
-----------------------------