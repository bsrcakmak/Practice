package s8_forLoops;

public class UcgenYildizlar {
    public static void main(String[] args) {


      /*

        *
        **
        * *
        *  *
        *****

       */


        for (int i=1; i<6; i++){

            if (i != 5) {

                for (int k = 1; k <= i; k++) {

                    if (k == 1 || k == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }else{

                for (int k=1; k<=i; k++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }



    }
}
