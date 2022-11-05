package s8_forLoops;

import java.util.Scanner;

public class CumledeIstenenHarfleriBulma {
    public static void main(String[] args) {

        // Soru1: klavyeden girilen bir cümle girilecek.
        // Bu cümlenin için kaç tane 'istenilen' harfinin olduğunu söyleyen method create edin


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle= input.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=input.next().charAt(0);


        harfiBul(cumle,harf);


    }


    public static void harfiBul(String cumle,char harf){

        int sayac=0;

        for (int i=0; i<cumle.length(); i++ ) {

            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }

        System.out.println("Girilen cumlede " + sayac + " tane '" + harf + "' harfi vardır");



    }





}
