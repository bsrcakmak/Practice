package replit;

public class Array9 {

    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5,6,7,8,9};
        int counter =0;

        for(int w : arr) {
            if(w%2==0) {
                counter++;
            }
        }
        System.out.println("Array'de " + counter + " tane cift sayi var.");
        System.out.println("Array'de " + (arr.length-counter) + " tane tek sayi var.");
    }

















}
