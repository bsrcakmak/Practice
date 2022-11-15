package clock;

public class Solution {

    /*
        Kullanicidan 2 sayi girmesini isteyin, girilen bu degerlerden biri saati digeri de dakikayi temsil edecek.
        Bize akrep ile yelkovan arasindaki kucuk aciyi hesaplayip degeri acisal olarak donduren methodu yaziniz.
        Orn:
        Input: hour:12 , minute:30
        Output: 165

     */
    public static void main(String[] args) {

        System.out.println(angleClock(12, 30));

    }

    public static double angleClock(int hour, int minutes){

        double ek = (double) minutes/12;
        double hourAngle = ((hour%12)*30) + (ek*6);
        double newMinute = (double) minutes/5;
        double minuteAngle = newMinute*30;
        double angle = Math.abs(hourAngle-minuteAngle);

        if (angle>180)  return  (360-angle);
        else return angle;


    }

}
