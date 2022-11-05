package s9_whileLoops;

import java.util.Scanner;

public class ToplamiAsarsaSayiyiDurdur {
    public static void main(String[] args) {


        /*
        Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        toplami yazdirin.

        */

        Scanner scan=new Scanner(System.in);
        double girilenSayi=0;
        double toplam=0;
        int sayac=0;

        while (toplam<500){

            System.out.println("Toplamak icin sayi giriniz.");
            girilenSayi=scan.nextDouble();

            toplam+=girilenSayi;
            sayac++;
        }
        System.out.println("Girilen "+sayac+" adet sayinin toplami= "+toplam+ " oldu.Bu kadar yeter.");




    }
}
