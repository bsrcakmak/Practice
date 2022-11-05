package s12_multiDimensionalArrays;

public class IlkSonAyniKarakter {
    public static void main(String[] args) {

        String arr[]={"Kemal", "Jonathan", "Mark", "Jackson", "Ali","Ayca","ayva","Kalabalık","inci"};
        for (String w:arr) {
            String k1 = w.substring(0, 1);
            String k2 = w.substring(w.length() - 1);
            if (k1.equalsIgnoreCase(k2)) {
                System.out.println(w);


            }
        }
    }
}

