package B_Projects.Project_4.Modeller.Calisanlar;

import B_Projects.Project_4.Veritabani.Calisanlar;
import B_Projects.Project_4.Veritabani.Departmanlar;


public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departmanlar Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }



    // Kullanicinin departman koduna göre, gerekli departman set edilmelidir.
    private void setDepartman(String departman) {
        /*
            İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        bu kodlari donguye tutmak ise yarayabilir.
       */
    }

    // Calisanin ID sinin kendisine özel olduğundan bahsetmistik, ID nin nasil kaydedileceği CalisanKaydetmeProjesiTanıtım.txt
    // içerisinde yer aliyor.
    private void setCalisanId() {
        /*
            İpucu: Detayli anlatim CalisanKaydetmeProjesiTanıtım.txt içerisinde.
         */
    }

    // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method.
    private String getCalisanIsimKodu() {
        /*

            Basit string metodlari ise isinice cok yarayacaktir fakat dinamik olmasina dikkat edelim... Mesela 2 isim bir
            soyisim girildiğinde hata vermesin.

         */

        return null;
    }

    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departmanlar getDepartman() {
        return this.Departman;
    }

    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {
        /*
                İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.
         */
        return null;
    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {
        /*

            İpucu: Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha
            olabilirdi.

         */
    }

    // Calisanlari yazdırmak için gerekli bir override
    @Override
    public String toString() {

        /*

            İpucu: Detayli anlatim CalisanKaydetmeProjesiTanıtım.txt içerisinde.

         */

        return null;
    }
}
