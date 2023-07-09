package B_Projects.Project_6.Models;
import B_Projects.Project_6.HelperFunctions.HelperFunctions;

public class User {
    private String fullName;
    private String city;
    private String address;
    private String zipCode;
    private double myPrice;
    private String shippingTrackingNumber;


    public User(String fullName, String city,
                String address, String zipCode) {
        this.fullName = fullName;
        this.city = city;
        this.address = address;
        this.zipCode = zipCode;
        this.shippingTrackingNumber = HelperFunctions.generateShippingTrackingNumber(this.fullName, this.city, this.zipCode);
    }

    public double getMyPrice() {
        return myPrice;
    }

    public void setMyPrice(double myPrice) {
        this.myPrice += myPrice;
    }

    @Override
    public String toString() {
        return "----------------\n" +
                "Full Name : " + this.fullName + '\n' +
                "City : " + this.city + '\n' +
                "Adress : " + this.address + '\n' +
                "Zip Code : " + this.zipCode + '\n' +
                "Your Shipping Tracking Number : " + this.shippingTrackingNumber + '\n' +
                "Total User Price : " + this.myPrice + '\n' +
                "----------------";
    }
}

    /*

        User içerisinde attribute larin hepsi private tanımlanmalı.

           private String fullName;
           private String city;
           private String address;
           private String zipCode;
           private double myPrice
           private String shippingTrackingNumber

        Attribute lar burada tanımlanıcak -->

     */


    /*

        Bu class bir constructor içermeli ve gelen
            ** fullname, address, city, zipcode değerlerini parametre olarak almalı.**

            1- parametre ile gelen fullname ve address değerleri classtaki attribute lara eşitlenmeli
            2- city methodu eşitlenmeden once helper functions icerisindeki ilgili method ile doğrulanmalı
            3- zipcode tanımlanmadan önce helper functions içerisindeki ilgili method ile doğrulanmalı
            4- shippingTrackingNumber helper functions tarafından oluşturulmalı ve eşitlenmeli

        // Constructor burada tanımlanacak

     */

    /*

        myPrice için bir getter bir de setter method oluşmalı

        getter method basic olabilir.

        setter method parametre olarak bir price almalı ve parametre ile gelen değeri myPrice a eklemeli

        // Methodlar burada tanımlanacak

     */


// toString methodunu değiştirmenize gerek yoktur, sadece görsel anlam ifade etmektedir
