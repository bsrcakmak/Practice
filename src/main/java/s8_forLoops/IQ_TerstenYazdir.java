package s8_forLoops;

import java.util.Scanner;

public class IQ_TerstenYazdir {
    public static void main(String[] args) {

       // Interview Question: Kullanicidan bir String isteyin ve bunu tersten yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin.");

        String cumle1= input.nextLine();
        String cumle2="";

        for (int i=cumle1.length()-1; i>=0; i--){
            cumle2=cumle2+cumle1.substring(i,i+1);
        }

        System.out.println(cumle2);



    }
}
