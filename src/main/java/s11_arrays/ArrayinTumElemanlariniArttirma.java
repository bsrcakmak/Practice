package s11_arrays;

import java.util.Arrays;

public class ArrayinTumElemanlariniArttirma {
    public static void main(String[] args) {


        //Verilen bir int array'in tum elemanlarini
        // iki arttirip bize donduren method olusturun
        // Eski array'i yeni haliyle kaydedin


        int[] arr= {2, 4, 6, 8};

        for (int i=0; i<arr.length; i++){

            arr[i]=arr[i]+2;
        }
        System.out.println(Arrays.toString(arr)); //[4, 6, 8, 10]


        arr=elementleri2Arttir(arr);
        System.out.println(Arrays.toString(arr)); //[6, 8, 10, 12]

    }

    public static int[] elementleri2Arttir(int[] arr){

        for (int i=0; i<arr.length; i++){

            arr[i]=arr[i]+2;
        }

          return arr;

    }

















}
