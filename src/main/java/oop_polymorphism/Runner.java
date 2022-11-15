package oop_polymorphism;

public class Runner {


    /*
       Interview sorusu: Arguman ile parametre arasindaki fark nedir?
        i) method olustururken parantez icine yazilan parametredir
       ii) method'u cagirirken icerisine girdigimiz seyler de argumandir.


       Polymorphism bize ayni tur icerisinde cesitliligi kullandirmayi sagliyor.
     */


    public static void main(String[] args) {

        Civciv civciv1 = new Civciv();
        Ordek ordek1 = new Ordek();

        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);


    }

    public static void hayvanSesCikar(Animal animal){

        animal.sesiCikar();

    }



}
