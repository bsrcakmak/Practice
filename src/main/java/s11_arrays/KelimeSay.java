package s11_arrays;

public class KelimeSay {
    public static void main(String[] args) {


        String kelime="En iyi mentor grubu mentor on dokuz";
        kelime=kelime.replaceAll("\\p{Punct}","");
        String array[]=kelime.split(" ");
        int k=array.length;
        System.out.println(k); // 7






    }
}
