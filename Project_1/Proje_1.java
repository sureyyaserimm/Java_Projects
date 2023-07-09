package B_Projects.Project_1;

import java.util.Scanner;

public class Proje_1 {
    public static void main(String[] args) {
        // Scanner class tanimlayin...
        Scanner read = new Scanner(System.in);
        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...

        System.out.print("Lütfen İsminizi Yazınız = ");
        String ad = read.nextLine();
        ad = ad.toLowerCase();
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1);
        System.out.print("Hosgeldin " + ad + " Lütfen Soyadınızı Yazın = ");
        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        String soyad = read.nextLine();
        soyad = soyad.toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);
        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        String devam = "";
        while (!devam.equalsIgnoreCase("Y")) {
            System.out.println("Hosgeldin " + ad + " " + soyad);
            System.out.print("İsim ve Soyaisim doğru ise devam etmek için Y tuşuna basınız.");
            devam = read.nextLine();
            if (!devam.equalsIgnoreCase("Y")) {
                System.out.println("HATALI GİRİŞ YAPILDI. TEKRAR DENEYİNİZ.");
            }
        }
        System.out.println("Doğru Tercih Yaptınız Devam Edebilirsiniz.");

        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...

        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim

        System.out.println("İSİM VE SOYİSİM BAŞARILI BİR ŞEKİLDE SİSTEME KAYIT EDİLMİŞTİR.");
        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"

        System.out.print("Lütfen Bir kullanıcı adı belirleyin =");
        String kullanici = read.nextLine();
        System.out.println("KULLANICI ADI = " + kullanici);


        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"
        System.out.print("Lütfen Şifre Belirleyiniz =");
        String sifre = read.nextLine();
        sifre = sifre.trim();

        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"
        System.out.print("Lütfen Şifreyi Tekrar Giriniz =");
        String sifre1 = read.nextLine();
        sifre1 = sifre1.trim();

        // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim
        System.out.println("İSİM VE SOYİSİM BAŞARILI BİR ŞEKİLDE SİSTEME KAYIT EDİLMİŞTİR.");

        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...*/

        if (sifre.equals(sifre1)) {
            System.out.println(" TEBRİKLER " + kullanici + " ADIYLA HESABINIZ OLUŞTURULMUŞTUR.");
        } else
            System.out.println("HATALI GİRİŞ YAPILDI. TEKRAR DENEYİNİZ.");

    }
}

