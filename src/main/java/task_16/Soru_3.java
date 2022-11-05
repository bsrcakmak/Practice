package task_16;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {


/*
   3: Kullanıcıdan iki pozitif sayı girmesini isteyen bir program yazın, sonra bu iki sayıyı çarpma (*) operatörünü kullanmadan çarpın.
 Eğer kullanıcı herhangi bir negatif sayı girerse, Geçersiz yazdırın.

 */

        Scanner input= new Scanner(System.in);
        System.out.println("Iki pozitif sayi giriniz.");

        int s1= input.nextInt();
        int s2= input.nextInt();
        int sum=0;

        if (s1<0 && s2<0){
            System.out.println("Gecersiz");

        } else {

            for (int i=1; i<=s2; i++){

                sum+=s1;
            }
            System.out.println(sum);
        }

    }
}
