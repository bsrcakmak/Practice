package s11_arrays;

public class ArraydekiPozitifleriTopla {
    public static void main(String[] args) {


        // Verilen bir array'deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method


        int[] arr= {3,-3,5,-7,-6,1,-2};
        int toplam=0;

        for (int i=0; i< arr.length; i++){

            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
        System.out.println(toplam);



        pozitifElementleriTopla(arr);

        System.out.println(pozitifElementleriTopla(arr));


    }

    public static int pozitifElementleriTopla(int[] arr){

        int toplam=0;

        for (int i=0; i< arr.length; i++){

            if (arr[i]>0){
                toplam+=arr[i];
            }

        }

        return toplam;



    }











}
