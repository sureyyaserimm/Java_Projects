package B_Projects.Project_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // Scanner Class tanimlayin...
        Scanner scan = new Scanner(System.in);

        // Banka Islemleri (Actions) Class indan bir liste olusturun...4 adet islem tanimlayin "Para_Yatir", "Para_Cek", "Transfer", "Cikis"...

        Actions actions1 = new Actions("Para_Yatir");
        Actions actions2 = new Actions("Para_Cek");
        Actions actions3 = new Actions("Transfer");
        Actions actions4 = new Actions("Cikis");
        List<Actions> actions = new ArrayList<>(Arrays.asList(actions1, actions2, actions3, actions4));

        // Her musteri (Customer) icin 2 adet hesap (Account) tanimlayin.. Hesap sinifi hesap numarasi ve hesaptaki para miktarini icermeli...

        Account user1Account1 = new Account(1111, 2000);
        Account user1Account2 = new Account(2222, 12000);
        Account user2Account1 = new Account(3333, 15000);
        Account user2Account2 = new Account(4444, 8000);
        Account user3Account1 = new Account(5555, 5000);
        Account user3Account2 = new Account(6666, 7500);


        // Banka musterilerini Customer sinifindan objeler olusturarak liste olarak tanimlayin...Customer sinifinda bir musteriye ait
        // username, password ve birden fazla hesap (Account) bulunmalidir...Buna gore bu musterileri burada tanimlayin..


        Customer customer1 = new Customer("User1", "password1", Arrays.asList(user1Account1, user1Account2));
        Customer customer2 = new Customer("User2", "password2", Arrays.asList(user2Account1, user2Account2));
        Customer customer3 = new Customer("User3", "password3", Arrays.asList(user3Account1, user3Account2));

        List<Customer> musteriler = new ArrayList<>(Arrays.asList(customer1, customer2, customer3));

        int hesapIndex = 0;

        // Asagidaki kodda KIRMIZI olarak gorulen yerler sizin olustiracaginiz siniflar ve yukarida tanimlayacaginiz objeler ile
        // normal olarak calisacaktir...
        Customer aktifKullanici;
        Account secilenHesap;

        while (true) {
            System.out.println("Please enter your username: ");


            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            // -> Bu methodu asagida hangi kullanicinin giris yaptigini belirlemek maksadiyla kullanacaksiniz, olusturun...


            aktifKullanici = confirmUsernameAndPassword(musteriler, username, password);

            if (aktifKullanici != null) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        //Actions starts here
        while (true) {
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i).description + " - " + (i + 1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice) {

                case 1: {

                    // Para yatirma ozelligini aktif hale getirin...

//                    Kullaniciya ait hesaplari listeleyerek hangi hesap numarasina para yatirmak istedigini sorun...
//                    Kullanicinin sectigi hesap numarasi hatali ise ikaz ederek tekrar basa dondurun...
//                    Secim confirmAccountNumber(currentCustomer, chosen); methodu tarafindan dogrulanirsa
//                    Ne kadar para yatirmak istedigini sorun...
//                    Ve kullanicinin girdisini alarak hesaptaki para miktarini arttirin...

                    while (true) {
                        System.out.println("Lütfen para yatırmak istediğiniz hesap numarasını giriniz.");
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        String chosen = scan.next();
                        secilenHesap = confirmAccountNumber(aktifKullanici, chosen);
                        if (secilenHesap == null) {
                            System.out.println("Hatalı hesap numarası girdiniz.");
                            continue;
                        }
                        break;
                    }
                    System.out.println("Lütfen yatırmak istediğiniz para miktarını giriniz.");
                    int amountToAdd = scan.nextInt();
                    secilenHesap.funds += amountToAdd;
                    System.out.println("Hesabınınzdaki toplam para " + secilenHesap.funds);
                    break;

                }

                case 2: {

                    while (true) {
                        // Burada artik sadece o kullaniciya ait banka hesaplari listeleniyor... CLASS kullanmainin faydalari...
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : aktifKullanici.accounts) {
                            System.out.println(account.number);
                        }
                        String secim = scan.next();

                        // confirmAccountNumber() methodunu kullanicinin dogru hesap bilgileri girdigini teyit etmek amacli kullanacaksiniz..
                        secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                        if (secilenHesap == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int cekilecekPara = scan.nextInt();
                        // withdraw() methodunu kullanicinin hesabinda yeterli bakiye varsa bakiyesinden paranin dusulmesi,
                        // Yeterli bakiye yoksa kullanicinin uyarilmasi maksadiyla kullanacaksiniz...Olusturun
                        if (!withdraw(secilenHesap, cekilecekPara)) {
                            break;
                        }
                    }
                    break;
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

    // TODO - Asagidaki 3 methodun return tipini ve icerigini tanimlayin ki yukarida olmasi gerektigi gibi sonuc versinler...


    private static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(username) && users.get(i).password.equals(password))
                return users.get(i);
        }
        return null;
    }

    public static Account confirmAccountNumber(Customer currentUser, String chosenAccount) {
        int chosen = Integer.parseInt(chosenAccount);
        for (Account account : currentUser.accounts) {
            if (account.number == chosen) {
                return account;
            }
        }
        return null;
    }

    public static boolean withdraw(Account chosenAccount, int amountToWithdraw) {
        if (chosenAccount.funds < amountToWithdraw) {
            System.out.println("Yetersiz bakiye!!");
            return true;
        }
        chosenAccount.funds -= amountToWithdraw;
        System.out.println("Hesabınızda toplam " + chosenAccount.funds + " para kalmıştır.");
        return false;

    }

}