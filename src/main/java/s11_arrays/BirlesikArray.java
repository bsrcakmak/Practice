package s11_arrays;

import java.util.Arrays;

public class BirlesikArray {
    public static void main(String[] args) {


        // Verilen iki array'i birlestiren
        // ve sonucu birlesikArray isminde bir array'e kaydeden
        // bir method olusturunuz
        // main method icinde yeni array'i siralayip yazdirin


        int arr1[] = {3, 5, 7, 10};
        int arr2[] = {2, 4, 6};

        int birlesikArray[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) { // 1.array'in elemanlarini birlesik array'e atadik

            birlesikArray[i] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) { // 2.array'in elemanlarini alacagiz

            birlesikArray[i + arr1.length] = arr2[i];

        }

        Arrays.sort(birlesikArray);
        System.out.println(Arrays.toString(birlesikArray));


    }
}
