package s8_forLoops;

import java.util.Scanner;

public class IQ_SayininKatlari {
    public static void main(String[] args) {







        Scanner input=new Scanner(System.in);
        System.out.println("100 den kucuk bir tamsayi giriniz");

        byte sayi1= input.nextByte();
        boolean ucunKatiMi, besinKatiMi;
        String mesaj1="", kelime1="Java", kelime2="Guzeldir";


        if (sayi1<100 && sayi1>0){
            for (int i=1; i<sayi1; i++){
                ucunKatiMi= i%3==0;
                besinKatiMi=i%5==0;

                if (ucunKatiMi && besinKatiMi){
                   mesaj1=kelime1+" "+kelime2;
                } else if (ucunKatiMi) {
                    mesaj1=kelime1;
                } else if (besinKatiMi) {
                    mesaj1=kelime2;
                }else
                    mesaj1=i+"";
                System.out.println(mesaj1);
            }

        }else
            System.out.println("Sayi 100'den kucuk 0'dan buyuk olomali");



    }
}
