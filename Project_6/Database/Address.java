package B_Projects.Project_6.Database;

import java.util.ArrayList;
import java.util.Arrays;

public class Address {
    /*

        Address class i içerisinde değiştirmemiz gereken bir şey yoktur.

        Addressleri bir veritabanı olarak düşünebiliriz ve bu veritabanı içerisindeki adreslere sadece kargolama
    yaptığımızı var sayıyoruz.


     */

    private static ArrayList<String> cityList = new ArrayList<>(Arrays.asList("New York", "New Jersey", "Ohio", "Pennsylvania", "Washington", "Atlanta"));

    public static ArrayList<String> getCityList() {
        return cityList;
    }
}
