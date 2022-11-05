package s11_arrays;

public class EnKisaEnUzunKelime {
    public static void main(String[] args) {


        String[] arr= {"Hasan", "Adem", "Senturk","Omer"};


        enUzunEnKisaIsimYazdir(arr);




    }

    public static void enUzunEnKisaIsimYazdir(String[] arr){

       String enUzunKelime=arr[0];
       String enKisaKelime=arr[0];

       for (int i=0; i< arr.length; i++){

           if (arr[i].length()>=enUzunKelime.length()){
               enUzunKelime=arr[i];
           }

           if (arr[i].length()<=enKisaKelime.length()){
               enKisaKelime=arr[i];
           }

       }
        System.out.println("En uzun isim: "+ enUzunKelime);
        System.out.println("En kisa isim: "+ enKisaKelime);









    }







}
