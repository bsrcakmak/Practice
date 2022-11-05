package s9_whileLoops;

import java.util.*;

public class YuzdenSifiraCiftSayilariYazdir {
    public static void main(String[] args) {


       // int bitis = 0;

//
//        while (bitis >= 0) {
//
//
//            if (bitis % 2 == 0) {
//
//                System.out.print(bitis+" ");
//
//            }
//
//            bitis++;
//
//            if (bitis == 100) {
//                break;
//
//
//            }
//        }












        List<Integer> nums= new ArrayList<>();

        for (int i=0; i<=100; i++){


            if (i%2==0){

                nums.add(i);

            }


        }
        System.out.println(nums);








        System.out.println("Cevrilmis array: "+ Arrays.asList(nums));


    }




    static void tersCevir(Integer[] nums){

        Collections.reverse(Arrays.asList(nums));

        System.out.println("Cevrilmis array: "+ Arrays.asList(nums));







    }








}







