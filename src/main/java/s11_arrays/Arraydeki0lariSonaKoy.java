package s11_arrays;

import java.util.Arrays;

public class Arraydeki0lariSonaKoy {
    public static void main(String[] args) {

        /*Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
 */


        int[] sayilar= {5,0,2,0,3};

        int[] sayilar2 = new int[sayilar.length];
        int ilkindex = 0;
        int sonindex = sayilar.length-1;

        for(int i=0; i<sayilar.length; i++) {
            if(sayilar[i]!=0) {
                sayilar2[ilkindex]=sayilar[i];
                ilkindex++;
            }else {
                sayilar2[sonindex]=0;
                sonindex--;
            }
        }
        System.out.println(Arrays.toString(sayilar2));













    }
}
