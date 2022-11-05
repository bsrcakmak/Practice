package s8_forLoops;

public class Flama {
    public static void main(String[] args) {

        /* TASK : Aşagıdaki   iki şekli  console'a yazdıralim

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */

        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *
     */
        

        for (int i=1; i<10; i++){

            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int nm=9;
        for (int i=1; i<=nm; i++){

            for (int k=nm; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
