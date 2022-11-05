package s12_multiDimensionalArrays;

import java.util.Arrays;

public class IcArrayleriAyriAyriToplaArrayYap {
    public static void main(String[] args) {

       /*
        Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki
        tum elemanlarin toplamini  birer birer bulan ve herbir sonucu
        yeni bir array’in elemani yapan ve yeni array’i  ekrana  yazdiran
        bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

 */

        // 1. yol;
        int[][] arr ={{1,2,3}, {4,5}, {6,7}};
        int[] brr = new int[arr.length];
        int toplam=0;
        for(int i=0;i<arr.length; i++) {


            //{1,2,3}
            for (int k = 0; k < arr[i].length; k++) {
                toplam = toplam + arr[i][k];

            }
            brr[i] = toplam;
            toplam = 0;
        }

        System.out.println(Arrays.toString(brr));




        // 2. yol;

        int arr2[]= new int[arr.length]; //Toplamları içine koyacağımız yeni bir array olusturduk.

        for(int i=0; i<arr.length; i++){        //birinci for arr1 deki elemanları secmek için mesela {4,5} gibi


            for(int k=0;k<arr[i].length;  k++){  //ikinci for ise elmanları toplamak için kullanıyoruz.

                arr2[i]=arr2[i]+arr[i][k];

            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr2));






    }
}
