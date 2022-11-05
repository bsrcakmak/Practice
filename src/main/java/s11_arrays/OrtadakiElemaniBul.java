package s11_arrays;

import java.util.Arrays;

public class OrtadakiElemaniBul {

    public static void main(String[] args) {



    /*
      Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

     */


        int arr[]= {12, 5, 8, 13};




        if (arr.length%2!=0){

            Integer ortElmIdx= arr.length/2;
            System.out.println( arr[ortElmIdx]);

        } else {
            Integer ortElmIdx= arr.length/2;
            Integer ortElm= (arr[ortElmIdx] + arr[ortElmIdx]-1)/2;

            System.out.println(ortElm);
        }
















    }











}
