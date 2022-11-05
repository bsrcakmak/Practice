package replit;

public class Array10 {

   /*Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

            ```
    Test Data:
            ```

            ```
    sentence -> "Java is fun"
            ```

            ```
    reversed **-> "**fun is Java**"**

*/

    public static void main(String[] args) {


        String sentence = "Java is fun";
        String reversedSentence = "";

        String arr[] = sentence.split(" ");
//        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1; i>=0; i--) {
            if(i==0) {
                reversedSentence += arr[i];
            }else {
                reversedSentence += arr[i] + " ";
            }
        }
        System.out.println("**"+reversedSentence+"**");
    }







    }
























