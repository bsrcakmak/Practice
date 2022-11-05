package s7_stringManipulations;

public class ToplamKarakterSayisi {
    public static void main(String[] args) {

        /*
           Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
konsolda yazdırınız.
Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

         */

        String s = " Miami 33018!!! ";
        Integer karakterSayisi = s.replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Toplam alfabetik ve sayısal karakter sayisi:" + karakterSayisi);



    }
}
