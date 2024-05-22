
package pckferhatkanar_212701036;


public class PckFerhatKanar_212701036 {

    public static void main(String[] args) {
        Kullanici ismail = new Kullanici("İsmail", "Yılmaz", "ismail123", "ismail@gmail.com");
Kullanici furkan = new Kullanici("Furkan", "Kara", "furkan456", "furkan@gmail.com");
Kullanici merve = new Kullanici("Merve", "Demir", "merve789", "merve@gmail.com");

// Kullanıcılar
System.out.println("--------------------------------------------");
System.out.println("Kullanıcılar:\n");
System.out.println(ismail.kullaniciBilgisi());
System.out.println(furkan.kullaniciBilgisi());
System.out.println(merve.kullaniciBilgisi());

System.out.println("\n--------------------------------------------");
// Arkadaşlık nesneleri oluşturuluyor ve istekler gönderiliyor, kabul ediliyor, reddediliyor
Arkadaslik arkadaslik1 = new Arkadaslik(ismail, furkan);
arkadaslik1.arkadaslikIstegiGonder();
arkadaslik1.arkadaslikIstegiKabulEt();

Arkadaslik arkadaslik2 = new Arkadaslik(merve, furkan);
arkadaslik2.arkadaslikIstegiGonder();
arkadaslik2.arkadaslikIstegiReddet();

Arkadaslik arkadaslik3 = new Arkadaslik(merve, ismail);
arkadaslik3.arkadaslikIstegiGonder();
arkadaslik3.arkadaslikIstegiKabulEt();

// Arkadaş listeleri gösteriliyor
System.out.println("\n--------------------------------------------");
System.out.println("Arkadaşlar:\n");

System.out.println("İsmail'in arkadaşları:");
ismail.arkadaşlarıGoster();

System.out.println("\nFurkan'ın arkadaşları:");
furkan.arkadaşlarıGoster();

System.out.println("\nMerve'nin arkadaşları:");
merve.arkadaşlarıGoster();

// Oyunlar oluşturuluyor
Oyun oyun1 = new Oyun("Super Mario", "Platform", "Klasik oyun", 50);
Oyun oyun2 = new Oyun("FIFA 23", "Spor", "Futbol oyunu", 150);
Oyun oyun3 = new Oyun("Call of Duty", "Aksiyon", "Savaş oyunu", 200);

// Kullanıcılar oyun satın alıyor
ismail.oyunSatınAl(oyun1);
ismail.oyunSatınAl(oyun2);

furkan.oyunSatınAl(oyun2);
furkan.oyunSatınAl(oyun3);

merve.oyunSatınAl(oyun3);
merve.oyunSatınAl(oyun1);

//Kullanıcılar oyunlar ve puanlar ekrana yazdırılıyor
System.out.println("\n--------------------------------------------");
System.out.println("Oyunlar:");
System.out.println(oyun1.oyunDetay());
System.out.println(oyun2.oyunDetay());
System.out.println(oyun3.oyunDetay());

//Puanlama Yapılıyor
double ismailOyun1Puan = 8;
double ismailOyun2Puan = 5;

double furkanOyun2Puan = 7;
double furkanOyun3Puan = 2;

double merveOyun3Puan = 9;
double merveOyun1Puan = 8;

// İlk olarak oyun1 ve oyun2 adlı iki oyun nesnesine ismail ve furkan adlı oyuncuların puanları atanıyor.
oyun1.oyunuPuanla(ismail, (int) ismailOyun1Puan);
oyun2.oyunuPuanla(ismail, (int) ismailOyun2Puan);
oyun2.oyunuPuanla(furkan, (int) furkanOyun2Puan);
oyun3.oyunuPuanla(furkan, (int) furkanOyun3Puan);
oyun3.oyunuPuanla(merve, (int) merveOyun3Puan);
oyun1.oyunuPuanla(merve, (int) merveOyun1Puan);

// üç oyunun ortalamasını hesaplayan üç değişken tanımlanıyor.
double oyunort1 = (ismailOyun1Puan + merveOyun1Puan) / 2;
double oyunort2 = (merveOyun3Puan + ismailOyun2Puan) / 2;
double oyunort3 = (furkanOyun2Puan + furkanOyun3Puan) / 2;

//PuanTablosu adlı bir sınıfın bir nesnesi oluşturuluyor.
PuanTablosu puanTablosu = new PuanTablosu();

//üç oyunun oyuncularının puanlarını yazdırıyoruz.
System.out.println("\n--------------------------------------------");
System.out.println("Oyunları Oynayanlar, Satın Alanlar ve Puanlar:");
oyun1.oyunVeOyuncuPuanlariniYazdir();
oyun2.oyunVeOyuncuPuanlariniYazdir();
oyun3.oyunVeOyuncuPuanlariniYazdir();

// Puan tablosu oluşturuluyor
puanTablosu.oyunPuanla(oyun1, merve, (int) oyunort1);
puanTablosu.oyunPuanla(oyun2, merve, (int) oyunort2);
puanTablosu.oyunPuanla(oyun3, merve, (int) oyunort3);

// En iyi oyunlar listeleniyor
System.out.println("\n\n--------------------------------------------");
System.out.println("En iyi oyunlar:");
System.out.println(puanTablosu.enIyiOyunlar());

       
    }
    
}
