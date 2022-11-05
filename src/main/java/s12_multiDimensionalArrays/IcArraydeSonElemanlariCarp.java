package s12_multiDimensionalArrays;

public class IcArraydeSonElemanlariCarp {
    public static void main(String[] args) {


        //Asagidaki multiDimensional array'in ic arraylerindeki son elemanların carpımını bulan programi yaziniz.


        // 1.yol;
        int arr[][]={ {1, 2, 3}, {4, 5}, {6} };

        int carpim=1;


        for (int[] w: arr) {
            carpim=carpim*w[w.length-1];

        }
        System.out.println(carpim);  // 90



        // 2.yol;

        int sonuc=1;

        for (int i=0; i<arr.length; i++){

            int sonElemanIndex= arr[i].length-1;
            sonuc=sonuc*arr[i][sonElemanIndex];

        }
        System.out.println(sonuc);  // 90







    }
}
