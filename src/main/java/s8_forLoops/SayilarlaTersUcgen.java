package s8_forLoops;

public class SayilarlaTersUcgen {

    public static void main(String[] args) {

        //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//



        for(int i=1; i<=6; i++) {//satirlar icin
            for(int b=1; b<i; b++) {//bosluklar icin
                System.out.print(" ");
            }
            for(int s=i; s<=6; s++) {//rakamlar icin
                System.out.print(s + " ");
            }
            System.out.println();
        }






















    }
}
