package s8_forLoops;

import java.util.Scanner;

public class UcgenOlustur {
    public static void main(String[] args) {

        /*
            For loop kullanarak asagida verilen sekli olusturun

                *
               * *
              * * *
             * * * *
            * * * * *

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturulacak ucgenin satir sayisini giriniz.");
        int s= scan.nextInt();

        for (int i=1; i<=s; i++){   // satirlar icin loop

            // space'ler icin loop
            for(int k=s-1; k>=i; k--){
                System.out.print(" ");
            }
            // *'ler icin loop
            for (int m=1; m<=i; m++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
