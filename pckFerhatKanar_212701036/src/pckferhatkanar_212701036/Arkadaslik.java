/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckferhatkanar_212701036;


public class Arkadaslik {
    // "Arkadaslik" sınıfı iki nesne alır.
    private final Kullanici kullanici1;
    private final Kullanici kullanici2;

    // "Arkadaslik" sınıfı başlatıldığında, iki nesne de tanımlanır.
    public Arkadaslik(Kullanici kullanici1, Kullanici kullanici2) {
        this.kullanici1 = kullanici1;
        this.kullanici2 = kullanici2;
    }

    // "arkadaslikIstegiGonder" işlemi, bir kullanıcıya arkadaşlık başvurusu gönderir.
    public void arkadaslikIstegiGonder() {
        // Kullanıcının adı yazdırılır ve bir alt satıra geçilir.
        System.out.println(kullanici1.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği gönderildi.\n");
    }

    // "arkadaslikIstegiKabulEt" işlemi, bir kullanıcının arkadaşlık başvurusunu kabul eder.
    public void arkadaslikIstegiKabulEt() {
        // İki kullanıcı da birbirlerinin arkadaş listesine eklenir.
        kullanici1.arkadaşEkle(kullanici2);
        kullanici2.arkadaşEkle(kullanici1);
        // Kullanıcının adı yazdırılır ve bir alt satıra geçilir.
        System.out.println(kullanici2.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği kabul edildi.\n");
    }

    // "arkadaslikIstegiReddet" işlemi, bir kullanıcının arkadaşlık başvurusunu reddeder.
    public void arkadaslikIstegiReddet() {
        // Kullanıcının adı yazdırılır ve bir alt satıra geçilir.
        System.out.println(kullanici1.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği reddedildi.\n");
    }

    // "arkadaslikIstegiGonderZatenArkadas" işlemi, bir kullanıcıya arkadaşlık başvurusu gönderir, ancak bu kullanıcı zaten arkadaş listenizde olduğu için bir hata mesajı yazdırır.
    public void arkadaslikIstegiGonderZatenArkadas() {
        // Kullanıcının adı yazdırılır, bir alt satıra geçilir ve bir hata mesajı yazdırılır.
        System.out.println(kullanici1.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği gönderildi.\nBu kullanıcı zaten arkadaş listenizde.");
    }
}
