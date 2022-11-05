package s12_multiDimensionalArrays;

public class EnUzunEnKisaString {
    public static void main(String[] args) {



        //String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.

        String arr[]={"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};

        String basharf="";

        for(String w:arr){
            if(w.endsWith("n")||w.endsWith("k")){
                basharf=basharf.concat(w.substring(0,1));
            }
        }
        System.out.println(basharf);







    }
}
