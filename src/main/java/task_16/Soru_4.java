package task_16;

import java.util.ArrayList;
import java.util.List;

public class Soru_4 {
    public static void main(String[] args) {


/*

  4: 1 ~ N arasında 3, 5 ve 15 ile bölünebilen sayıları yazdıran bir program yazın.
	sayı 3, 5 ve 15 ile bölünebiliyorsa,o zaman sadece DivisibelBy15' bölümünde görüntülenmelidir.

	sayı 3'e bölünebiliyorsa ancak 15'e bölünemiyorsa, o zaman sadece DivisibelBy3' bölümünde görüntülenmelidir.

	sayı 5'e bölünebiliyorsa ancak 15'e bölünemiyorsa,o zaman sadece DivisibelBy5' bölümünde görüntülenmelidir.
EXAMPLE:
input: 100
Output:

 */

        // 1.yol;

        int sayi= 45;
        List<Integer> list15= new ArrayList<>();
        List<Integer> list3= new ArrayList<>();
        List<Integer> list5= new ArrayList<>();
        List<Integer> kalanlar= new ArrayList<>();

        for (int i=1; i<=sayi; i++){

            if (i%15==0){
                list15.add(i);   // 15,30,45
            } else if (i%3==0) {
                list3.add(i);
            }else if(i%5==0){
                list5.add(i);
            } else {
                kalanlar.add(i);
            }

        }
        System.out.println("15'e bolunebilenler: "+list15);
        System.out.println("5'e bolunebilenler: "+list5);
        System.out.println("3'e bolunebilenler: "+list3);
        System.out.println("Geriye kalanlar: "+kalanlar);


        // 2. yol;


        for (int i=1; i<=45; i++){
            if (i%15==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i=1; i<=45; i++){
            if (i%5==0 && i%15!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i=1; i<=45; i++){
            if (i%3==0 && i%15!=0){
                System.out.print(i+" ");
            }
        }














    }
}
