package s7_stringManipulations;

public class Contains {
    public static void main(String[] args) {

        String str="Java buyuk kucuk herkesi yorar";

        if (str.contains("buyuk") && str.contains("kucuk")){
            System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));

        } else if (str.contains("buyuk")) {
            System.out.println(str.toUpperCase());
        }else{
            System.out.println(str.toLowerCase());
        }
    }
}
