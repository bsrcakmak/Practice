package s14_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomSayiListedeVarMi {
    public static void main(String[] args) {

        /*
    icinde 200 tane 1000'den kucuk pozitif tam sayi olan bir list
olusturun
 kullanicidan bir sayi isteyip
 listede var olup olmadigini kullaniciya yazalim
    */




        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();
        sayiListesi.add(5);
        sayiListesi.add(44);
        sayiListesi.add(35);
        sayiListesi.add(76);
        sayiListesi.add(34);
        sayiListesi.add(7);
        sayiListesi.add(97);
        sayiListesi.add(54);


        while(sayiListesi.size()>200){
            sayi = rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);
        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);
        while(!bildiMi){
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi bildiniz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;


            }

        }



    }
}