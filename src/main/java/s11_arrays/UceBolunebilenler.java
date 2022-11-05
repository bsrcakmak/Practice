package s11_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UceBolunebilenler {

    public static void main(String[] args) {


        //kullanicidan aldıgimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir?


        Scanner scan=new Scanner(System.in);
        int arr[]=new int[8];

        for (int i=1 ; i<9; i++){
            System.out.println(i + ". elemani giriniz.");
            arr[i-1]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));











    }
}
