package s12_multiDimensionalArrays;

public class AyniIndexleriTopla {

    public static void main(String[] args) {


    /*verilen 2 katli bir MDA de outer index ve inner indexi ayni olan sayilarin toplamini bulunuz
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        [0][0]+[1][1]+[2][2]........
         */



        int[][] arr={{1,5,6,9},{2,5},{3,1,6}};

        int sum=0;

        for (int i=0; i< arr.length; i++){

            for (int j=0; j<arr[i].length; j++){

               if (i==j){

                   sum+= arr[i][j];



               }


            }

        }
        System.out.println(sum);










    }



}
