package oop_polymorphism;

public class Runner {


    /*
       Interview sorusu: Arguman ile parametre arasindaki fark nedir?
        i) method olustururken parantez icine yazilan parametredir
       ii) method'u cagirirken icerisine girdigimiz seyler de argumandir.


       Polymorphism bize ayni tur icerisinde cesitliligi kullandirmayi sagliyor.
     */


    public static void main(String[] args) {

        Civciv civciv1 = new Civciv(); // Data type Civciv
        Animal animal = new Civciv();  // Dta type Animal     // Interface(Animal)
        // civciv1 adli degiskene baska obje atayamayiz(orn; ordek1)
        // ancak Animal data turuyla olusturursak daha sonra ona baska obje atayabiliriz.

        Ordek ordek1 = new Ordek();

        // Projelerde kod gelisime acik olsun diye; esitligin sol tarafi Interface veya Abstract Class data turu olarak tanimlanir.
        // Bir yapiya ayni yapidan turetilen farkli objeler baglayabilmek icin esitligin soluna parent Class eklenir

        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);


    }

    public static void hayvanSesCikar(Animal animal){

        animal.sesiCikar();

    }



}
