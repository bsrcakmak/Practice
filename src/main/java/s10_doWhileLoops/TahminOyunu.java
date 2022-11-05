package s10_doWhileLoops;

import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Kim bilir, kim bilemez sayimi tahmin edermisin show'umuza hosgeldiniz!");
        System.out.println("Bakalim bizim sayimizi tahmin edebilecekmisiniz?");
        System.out.println("5 tahmin imkaniniz var! Buyurun, ilk tahminizi edin");

        int sayi;
        int rastgeleSayi = (int)(Math.random()*100)+1;
        int denegim = 5;

        do {
            sayi = scan.nextInt();
            if (sayi<rastgeleSayi) {
                denegim--;
                if(denegim==0){
                    continue;}
                System.out.println("oooo, malesef, birdaha denegin.. **Tiyo isterseniz, sayinizi yükseltin (͡ ͡° ͜ つ ͡͡°)**");

            }else if (sayi>rastgeleSayi){
                if(denegim==0)
                    denegim--;
                if (denegim==0){
                    continue;}
                System.out.println("oooo, malesef, birdaha denegin.. **Tiyo isterseniz, sayinizi alcaltin (͡ ͡° ͜ つ ͡͡°)");

            }else {
                System.out.println("Tebrikler sonunda buldunuz. Aradigimiz sayi: " + rastgeleSayi);
                break;
            }
            System.out.println("Kalan hakkiniz: "+ denegim);
        }
        while(denegim>0);
        if (denegim==0){
            System.out.println("Malesef hakkiniz bittmistir ve kazanamadiniz. Aradigimiz sayi ise " + rastgeleSayi);
        }
















    }
}
