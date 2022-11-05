package s9_whileLoops;

import java.util.Scanner;

public class SayiKacveTopla {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int girilenSayi=5;
        int sayac=0;
        int toplam=0;

        while (girilenSayi!=0){

            System.out.println("Lutfen toplamak icin tamsayi girin"+
                    "\nbitirtmek icin 0'a basin" );

            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }

        }
        System.out.println("Girilen "+sayac+" adet sayinin toplami= "+toplam);




    }
}
