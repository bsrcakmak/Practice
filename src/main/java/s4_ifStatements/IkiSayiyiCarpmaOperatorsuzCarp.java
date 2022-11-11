package s4_ifStatements;

import java.util.Scanner;

public class IkiSayiyiCarpmaOperatorsuzCarp {

    /*
    Kullanıcıdan iki pozitif sayı girmesini isteyen bir program yazın, sonra bu iki sayıyı çarpma
    (*) operatörünü kullanmadan çarpın.
    Eğer kullanıcı herhangi bir negatif sayı girerse, Geçersiz yazdırın.
    */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki tane sayi giriniz");

        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int sum = 0;
        if (s1 < 0 && s2 < 0) {
            System.out.println("Gecersiz sayi girdiniz,Lutfen sifirdan buyuk bir sayi giriniz");
        } else {
            //  System.out.println(Math.multiplyExact(s1,s2));
            //   System.out.println(Math.addExact(s1,s2));//toplam
            for (int i = 1; i <= s2; i++) {
                sum += s1;
            }
            System.out.println(sum);
        }

    }
}
