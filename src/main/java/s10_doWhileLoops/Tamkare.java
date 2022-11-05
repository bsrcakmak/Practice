package s10_doWhileLoops;

public class Tamkare {
    public static void main(String[] args) {

      /*
      Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
      bulunuz, tamkare ise true değilse false yazdırınız.
          Ornek : input : 16, output: 4
       */



        int sayi=36;
        int baslangic=1;
        int bayrak=0;

        do {
            if (baslangic*baslangic==sayi){
                System.out.println("true");
                bayrak++;
                break;
            }
            baslangic++;

        }while (baslangic*baslangic<=sayi);


        if (bayrak==0){
            System.out.println("false");
        }



    }
}
