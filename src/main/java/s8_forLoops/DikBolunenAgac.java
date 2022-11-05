package s8_forLoops;

import java.util.Scanner;

public class DikBolunenAgac {
    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */


        // 1. yol

        int govde = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tac uzunlugunu giriniz: ");
        int tacUzunlugu = scan.nextInt();

        for(int i=1; i<=tacUzunlugu; i++) {
            for(int k=1;k<=i; k++) {
                System.out.print("^");
            }
            System.out.println();
        }

        for(int i=1;i<=govde;i++) {
            System.out.println("|||");
        }

        // 2. yol;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen agacin tac uzunlugunu giriniz ");
        int tacUzunluk=input.nextInt();
        String yaprak="";
        for (int i = 0; i <tacUzunluk ; i++) {
            yaprak+="^";
            System.out.println(yaprak);
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("|||");
        }









    }
}
