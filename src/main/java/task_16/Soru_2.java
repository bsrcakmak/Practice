package task_16;

public class Soru_2 {


/*   2: Kullanıcıdan bir String ve bir karakter girmesini isteyen,
 verilen Stringden verilen karakterin kaç tane oldugunu gösteren bir program yazın.

   Example:inputs: str = "aabcccd"; char = 'c';
   output: 3
   inputs: "Java programming language" 'g'
   output: 4

 */


    public static void main(String[] args) {


         String str= "aabcccd";
         char  ch= 'c';

         int bayrak=0;

         //1. yol;
         for (int i=0; i<str.length(); i++){

             if (ch==str.charAt(i)){

                 bayrak++;

             }

         }
        System.out.println(bayrak);


         // 2. yol;


        int counter = 0;
        String str1 = "aabcccd";
        String[] arr = str.split("");
        String ch1 = "b";
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i].equalsIgnoreCase(ch1)) {
                counter++;
            }
        }
        System.out.println(counter);














    }





}
