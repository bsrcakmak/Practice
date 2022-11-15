package s18_stringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        
        String name = "temel oluyormu";
        
        reverse(name);
        

    }

    private static void reverse(String name) {
        int count=0;
        String [] str= name.split("");

//        // 1. yol: (daha yavas)
//        StringBuilder str2= new StringBuilder();
//
//        for (int i=str.length-1; i>=0; i--){
//            str2.append(str[i]);
//            count++;
//        }

        // 2. yol: (daha hizli)
//
//        int l=0;
//        int r= str.length-1;
//        for (l=0; l<r; l++, r--){
//            // swap islemi yapiyoruz
//            String temp=str[l];
//            str[l]=str[r];
//            str[r]=temp;
//            count++;
//        }
//
//        // 3. yol:

        for (int i=0; i<str.length/2; i++){
            // swap islemi
            String temp=str[i];
            str[i]= str[str.length-i-1];
            str[str.length-i-1] = temp;
            count++;
        }


        // yeni olusan ifadeyi ekrana basiyoruz
        // TODO 2. ve 3. yolda acilacak

        for (String ch:str){
            System.out.print(ch);
        }


       // System.out.print(str2);  // TODO 2. ve 3. yolda kapanacak
        System.out.println();
        System.out.println("cumledeki harf sayisi: " + name.length());
        System.out.println("Toplam yapilan islem sayisi: " + count);






    }

}
