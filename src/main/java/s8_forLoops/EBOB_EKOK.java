package s8_forLoops;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int num1= input.nextInt();
        int num2= input.nextInt();


        // 1.yol
        int ebob = 0;

        for(int i = 1; i < num1; i++)
        {
            if(num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);

        int ekok=0;
        int max=num1*num2;


        for(int i = max; i > 0; i--)
        {
            if(i % num1 == 0 && i % num2 == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);




        // 2.yol;

          for(int i = 1; i <= num1 && i <= num2; ++i)

{

       if(num1 % i == 0 && num2 % i == 0)
         ebob = i;

}


     ekok = (num1 * num2) / ebob;

System.out.printf(" %d ve %d sayılarının EBOB'u %d \n", num1, num2, ebob);

System.out.printf(" %d ve %d sayılarının EKOK'u %d \n", num1, num2, ekok);






    }






    }

