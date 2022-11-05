package s11_arrays;

import java.util.Arrays;

public class RandomArraydeTekveCiftleriBul {
    public static void main(String[] args) {


        // Soru2: 20 elemanlı bir dizi(Arrays) tanımlayın ve içini Random sınıfını kullanarak 0 ile 100 arasında rastgele sayılar ile doldurun.
        // Oluşun dizide kaç tek ve kaç çift sayı olduğunu bulan algoritma yazın.

        int[] arr= new int[20];

        for (int i=0; i<arr.length; i++ ){

            arr[i]=(int)(Math.random()*100);

        }
        System.out.println(Arrays.toString(arr));

        int ciftSayaci=0;
        int tekSayaci=0;

        for (int w: arr){

            if (w%2==0){
                ciftSayaci++;

            }else
                tekSayaci++;

        }

        System.out.println("Array'de "+ciftSayaci+ " tane cift sayi, "+tekSayaci+ " tane de tek sayi vardir.");


















    }
}
