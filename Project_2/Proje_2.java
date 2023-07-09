package B_Projects.Project_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));

        List<String> isimler = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));

        List<String> parolalar = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));

        List<String> hesapNo = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));

        List<Integer> paraMiktari = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        while (true) {
            System.out.println("Kullanıcı adı giriniz : ");
            String username = scan.nextLine();

            System.out.println("Parolanızı Giriniz : ");
            String password = scan.nextLine();

            if (confirmUsernameAndPassword(isimler, parolalar, username, password)) {
                System.out.println("Basarili bir sekilde giris yaptiniz.Tebrikler");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        while (true) {
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));

            }
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1: {
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");

                }
                case 2: {
                    while(true) {

                        System.out.println("Hangi hesaptan para cekmek istiyorsunuz?");
                        for (int i = 0; i < hesapNo.size(); i++) {
                            System.out.println(hesapNo.get(i));
                        }
                        String chosenAccount = scan.next();
                        if (confirmAccountNumber(hesapNo, chosenAccount)) {
                            System.out.println("Hatalı Hesap Numarası !");
                            continue;
                        }

                        System.out.println("Ne kadar para cekmek istiyorsunuz?");
                        int amountToWithdraw = scan.nextInt();
                        if (!withdraw(paraMiktari, amountToWithdraw, hesapNo.indexOf(chosenAccount))){
                            break;
                        }
                    }
                }
                case 3: {
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }
                case 4:
                    System.exit(1);
                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                }
            }
        }
    }
    private static boolean withdraw(List<Integer> hesapBakiyesi, int cekilecekMiktar, int hesapNumarasi ) {
        if (hesapBakiyesi.get(hesapNumarasi)< cekilecekMiktar){
            System.out.println("Hesabınızda yeterli para yok!");
            return true;
        }
        hesapBakiyesi.set(hesapNumarasi,hesapBakiyesi.get(hesapNumarasi)-cekilecekMiktar);
        System.out.println("Lutfen paranizi aliniz, hesabinizda toplam "+hesapBakiyesi.get(hesapNumarasi)+" euro kalmistir...");
        return false;
    }

    public static boolean confirmAccountNumber(List<String> hesapNo,String chosenAccount){
        for (String hesap : hesapNo) {
            if (hesap.equals(chosenAccount))
                return false;
        }
        return true;
    }

    private static boolean confirmUsernameAndPassword(List<String> isimler, List<String> parolalar, String username, String password) {

        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).equals(username) && parolalar.get(i).equals(password)){
                return true;
            }
        }
        return false;
    }
}

