package s14_lists;

import java.util.ArrayList;
import java.util.List;

public class Bolunebilme {

     /*
    1 ~ N arasında 3, 5 ve 15 ile bölünebilen sayıları yazdıran bir program yazın.
	sayı 3, 5 ve 15 ile bölünebiliyorsa,o zaman sadece DivisibelBy15' bölümünde görüntülenmelidir.
sayı 3'e bölünebiliyorsa ancak 15'e bölünemiyorsa, o zaman sadece DivisibelBy3' bölümünde görüntülenmelidir.
​
	sayı 5'e bölünebiliyorsa ancak 15'e bölünemiyorsa,o zaman sadece DivisibelBy5' bölümünde görüntülenmelidir.
EXAMPLE:
input: 100
Output:
Divisible By 15: 15 30 45 60 75 90
Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */

    public static void main(String[] args) {

        List<Integer> list15 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> kalanlar = new ArrayList<>();

        int sayi = 45;
        for (int i = 0; i < 45; i++) {
            if (i % 15 == 0) {
                list15.add(i);//15,30,45
            } else if (i % 5 == 0) {
                list5.add(i);
            } else if (i % 3 == 0) {
                list3.add(i);
            } else {
                kalanlar.add(i);
            }
        }
        System.out.println("15 e bolunenler " + list15);
        System.out.println("5 e bolunenler " + list5);
        System.out.println("3 e bolunenler " + list3);
        System.out.println("Kalan Sayilar " + kalanlar);


        //2.yol
        for (int i = 0; i <= 45; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int j = 0; j <= 45; j++) {
            if (j % 5 == 0 && j % 15 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        for (int j = 0; j <= 45; j++) {
            if (j % 3 == 0 && j % 15 != 0) {
                System.out.print(j + " ");
            }
        }
    }
}
