package s4_ifStatements;

import java.util.Scanner;

public class Replit_BMI {
    public static void main(String[] args) {


       /* Ask user to their weight and height and type a program with calculates mass index

                * HINT : Body Mass Index = Weight (kg) / Square of height (m)

                Then give a message to user as following:

        If BMI is less than 18.5 , you re weak
        If BMI is between 18.5 and 25 , your weight is ideal
        If BMI is between 25 and 30, you re fat
        If BMI is more than or equal to 30, obese

        EXAMPLE :

        INPUT:

        Weight : 71

        Height : 1,72

        OUTPUT :

        Your BMI is  : 23.99945916711736
        Your weight is ideal

        */


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu ve kilonuzu giriniz");

        double boy= input.nextDouble();
        double kilo= input.nextDouble();
        double BMI= kilo/(boy*boy);

        if (BMI<18.5){
            System.out.println("BMI'niz: "+BMI+" ==> Zayifsiniz");
        } else if (BMI>=18.5 && BMI<25) {
            System.out.println("BMI'niz: "+BMI+" ==> Ideal kilodasiniz");
        } else if (BMI>=25 && BMI<30) {
            System.out.println("BMI'niz: "+BMI+" ==> Sismansiniz");
        }else
            System.out.println("BMI'niz: "+BMI+" ==> Obezsiniz");


    }
}
