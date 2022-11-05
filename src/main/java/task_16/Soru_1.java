package task_16;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {

/*
      1 Kullanıcıdan 5 defa sayı girmesini isteyen ve kaç tane pozitif ve negatif sayı girdiğini ekrana yazdıran bir program yazınız.
Example:
Inputs: 10 20 -1 0 3
Output: 3 positive and 1 negative


 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bes tane tamsayi giriniz");

        int counter = 0;
        int bayrak = 0;

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        for (int w : arr) {
            if (w > 0) {
                counter++;
            } else if (w < 0) {
                bayrak++;
            }

        }


        System.out.println("Sisteme " + counter + " adet pozitif sayi girdiniz");
        System.out.println("Sisteme " + bayrak + " adet negatif sayi girdiniz");

    }
}

