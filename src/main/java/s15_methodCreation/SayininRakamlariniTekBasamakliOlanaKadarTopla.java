package s15_methodCreation;

import java.util.Scanner;

public class SayininRakamlariniTekBasamakliOlanaKadarTopla {

    /*
        Kullanicidan pozitif bir tamsayi al ve
         enson sonuc tek basamakali olana kadar basamaklari birbiri ile topla.
     */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= input.nextInt();


        // 1. yol;
        System.out.println("Girdi: " + sayi + "\n" + "Cikti: " + dongu(sayi));


        // 2. yol;
        System.out.println("Girdi: " + sayi + "\n" + "Cikti: " + alternatif(sayi));


    }

    public static int dongu(int sayi){

        while (sayi>=10){
            sayi= rakamlariniTopla(sayi);
        }return sayi;


    }

    public static int rakamlariniTopla(int sayi){

        int topla=0;
        int rakam=0;

        while (sayi>0){

            rakam=sayi%10;
            topla+=rakam;

            sayi/=10;

        }return topla;


    }


    public static int alternatif(int sayi){

        sayi=sayi%9;

        if (sayi%9==0){
            sayi=9;
        }

        return sayi;


    }





}
