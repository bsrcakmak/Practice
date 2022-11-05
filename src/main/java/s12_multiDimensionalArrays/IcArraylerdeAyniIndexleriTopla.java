package s12_multiDimensionalArrays;

public class IcArraylerdeAyniIndexleriTopla {
    public static void main(String[] args) {


        //asagidaki multidimensional array lerin ic arraylerinde
        // ayni indexe sahip elemanlarin toplamini ekrana yazdirin
        // arr1={{1,2},{3,4,5},{6}}
        //arr2= {{7,8,9},{10,11},{12}}


        // 1. yol;

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        for (int i=0; i<arr1.length; i++){

            if (arr1[i].length<arr2[i].length){

                for (int k=0; k<arr1[i].length; k++){

                    System.out.println(arr1[i][k]+ "+" + arr2[i][k]+"="+
                            (arr1[i][k]+arr2[i][k]));

                }

            }else{

                for (int k=0; k<arr2[i].length; k++){

                    System.out.println(arr1[i][k]+ "+" + arr2[i][k]+"="+
                            (arr1[i][k]+arr2[i][k]));

                }
            }
        }

        // 2. yol;

        for (int i=0; i<arr1.length; i++){

            for (int k=0; k<Math.min(arr1[i].length,arr2[i].length); k++){

                System.out.println(arr1[i][k]+ "+" + arr2[i][k]+"="+
                        (arr1[i][k]+arr2[i][k]));
            }

        }






    }
}
