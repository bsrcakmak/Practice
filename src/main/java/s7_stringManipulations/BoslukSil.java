package s7_stringManipulations;

public class BoslukSil {
    public static void main(String[] args) {


        /*
            Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
karakteri yazdırınız.
Örnek: 'Ali Can' için n yazdırmalısınız.
‘Miami’ için i yazdırmalısınız.

         */


        String s = "Miami ";
        int boslukOlmayanSonKrkIndex= s.trim().length()-1;
        String boslukOlmayanSonKrk = s.substring(boslukOlmayanSonKrkIndex);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);



    }
}
