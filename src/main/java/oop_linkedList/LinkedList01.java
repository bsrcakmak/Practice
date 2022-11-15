//package linkedList;
//
//import java.util.*;
//
//public class LinkedList01 {
//    public static void main(String[] args) {
//        /*
//		 		1) LinkedList'de elemanlar "data" ve "address" olmak uzere iki kisimdan olusur,
//
//		 		2) LinkedList'de elemanlarin yapisi farkli oldugundan "node" olarak adlandirilirlar.
//
//		 		3) LinkedList'lerde her zaman en basta "Head" vardir. "Head" sadece address bolumunden olusur
//		 		 	"Head" icin data bolumu yoktur.
//
//		 		4) LinkedList'lerde her zaman en son node "Tail" olarak adlandirilir.
//
//		 		5) LinkedList'ler eleman ekleme ve silmede cok basarilidirlar. Fakat eleman bulmada
//		 			basarisizdirlar, cunku index kullanmazlar.
//		 			// linked bagli demektir
//        // linked list'te tum elemanlarlar tren gibi birbirine baglidir
//
//        // Collections'da obje olustururken
//        // olusturmak istedigimiz collection'in class mi yoksa interface'mi olduguna bakmaliyiz
//        // Eger olusturmak istedigimiz collection interface ise
//        // data turu olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz
//        // Simdiye kadar List(interface) olustururken constructor olarak ArrayList() seciyorduk
//		 */
//
//        java.util.LinkedList<String> ll1 = new LinkedList<>();
//        ll1.add("Ali");
//        ll1.add("Veli");
//        ll1.add("Emine");
//        ll1.add("Beyhan");
//        ll1.add("Ridvan");
//        System.out.println(ll1); // [Ali, Veli, Emine, Beyhan, Ridvan]
//
//        ll1.add(1, "Kemal");
//        System.out.println(ll1); //[Ali, Kemal, Veli, Emine, Beyhan, Ridvan]
//
//        List<String> ll2 = new ArrayList<>();
//        ll2.add("XXX");
//        ll2.add("YYY");
//
//		/*
//		 		addAll() methodu LinkedList'e ArrayList2'den gelen LinkedList'den gelen
//		 kisacasi tum Collection'lardan gelen elemanlari ekleyebilir.
//		 */
//        ll1.addAll(ll2);
//        System.out.println(ll1); // [Ali, Kemal, Veli, Emine, Beyhan, Ridvan, XXX, YYY]
//
//        ll1.addAll(2, ll2);
//        System.out.println(ll1); // [Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY]
//
//        ll1.addFirst("AAA");
//        System.out.println(ll1); // [AAA, Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY]
//
//        ll1.addLast("BBB");
//        System.out.println(ll1); //[AAA, Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
//
//        //remove() method'uilk elemani siler
//        ll1.remove();
//        System.out.println(ll1);// [Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
//
//        ll1.remove();
//        System.out.println(ll1); // [Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
//
//        // removeFirst() ilk elemani daha hizli siler
//        ll1.removeFirst();
//        System.out.println(ll1); // [XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY, BBB]
//
//        // remove(4) method'u index'i 4 olan elemani bulur, siler ve return eder.
//        System.out.println(ll1.remove(4));
//        System.out.println(ll1); // [XXX, YYY, Veli, Emine, Ridvan, XXX, YYY, BBB]
//
//        //remove("YYY") method'u ilk "YYY" yi siler ve rapor verir.
//        // Silinmesi istenen eleman List'de yoksa false return eder, var ise siler ve true return eder.
//        System.out.println(ll1.remove("YYY")); // true
//        System.out.println(ll1); // [XXX, Veli, Emine, Ridvan, XXX, YYY, BBB]
//        System.out.println(ll1.remove("Hirsiz")); // false
//        System.out.println(ll1);
//
//        // removeFirstOccurrence("XXX") method'u en soldaki XXX elemanini siler
//        ll1.removeFirstOccurrence("XXX"); // [Veli, Emine, Ridvan, XXX, YYY, BBB]
//        System.out.println(ll1);
//
//        ll1.add(5, "Ridvan");
//        System.out.println(ll1); // [Veli, Emine, Ridvan, XXX, YYY, Ridvan, BBB]
//
//        // removeLastOccurrence("Ridvan") method'u en sagdaki "Ridvan" i siler.
//        ll1.removeLastOccurrence("Ridvan");
//        System.out.println(ll1); // [Veli, Emine, Ridvan, XXX, YYY, BBB]
//
//        //removeLast() method'u en sagdaki elemani siler
//        ll1.removeLast();
//        System.out.println(ll1); // [Veli, Emine, Ridvan, XXX, YYY]
//
//        ll1.add(2, "Veli");
//        ll1.add(4, "Veli");
//        System.out.println(ll1); // [Veli, Emine, Veli, Ridvan, Veli, XXX, YYY]
//
//        LinkedList01<String> ll3 = new LinkedList01<>();
//        ll3.add("Veli");
//
//        // removeAll(l5) method'u l5 icindeki elemanlari ll22 icinden siler
//        ll1.removeAll(ll3);
//        System.out.println(ll1); // [Emine, Ridvan, XXX, YYY]
//
//        LinkedList01<String> ll4 = new LinkedList01<>();
//        ll4.add("Emine");
//        ll4.add("XXX");
//        System.out.println(ll1.containsAll(ll4)); // trıe cunku Emine ve XXX ll22'in icinde var
//
//        LinkedList01<String> ll5 = new LinkedList01<>();
//        Collections.addAll(ll5, "Emine", "XXX", "MMM");
//        System.out.println(ll1.containsAll(ll5)); // false cunku Emine ve XXX ll22'in icinde var olmasina ragmen MMM yok
//
//        System.out.println(ll1.get(1)); // Ridvan
//
//
//        LinkedList01<Integer> int1 = new LinkedList01<>();
//        Collections.addAll(int1, 1,2,3,4,5);
//        System.out.println(int1);
//
//        System.out.println(int1.remove(3));
//        System.out.println(int1);
///*
// 	LinkedHashSet'ler 1) Tekrarli eleman kabul etmezler
// 								  2) Elemanlari ekleme sirasina(insertion order) gore dizerler.
// 								  3) LinkedHashSet, HashSet'den yavas calisir.
//
// */
//
//        List<Integer> ll22 = new LinkedList01<>();
//        ll22.add(3);
//        ll22.add(2);
//        ll22.add(0);
//        ll22.add(1);
//        ll22.add(33);
//        System.out.println(ll22);
//
//        ll22.remove(2); //remove() method'unun icine integer koyarsaniz Java her zaman onu index kabul eder.
//        //Burada index'i 2 olan sifir silinir.
//        System.out.println(ll22);
//
//        //remove() method'unun icinde olmayan bir index kullanirsaniz
//        //Java IndexOutOfBoundsException throw eder
//        //ll22.remove(33);
//        List<String> liste = new ArrayList<>();
//        liste.add("X");
//        liste.add("Y");
//        System.out.println(liste); //[X, Y]
//
//        LinkedList01<String> l5 = new LinkedList01<>(); //class dan obje uretilir
//
//        l5.add("A");
//        l5.add("B");
//        System.out.println(l5); //[A, B]
//        l5.add(1, "C");  //1.index eC yi ekler
//        System.out.println(l5); //[A, C, B]
//        l5.addAll(liste);  //ll22 e listeyi ekler
//        System.out.println(l5); //[A, C, B, X, Y]
//
//        l5.addAll(2, liste);  //istenilen indexten itibaren listeyi ekler
//        System.out.println(l5); //[A, C, X, Y, B, X, Y]
//
//        l5.addFirst("E");  //ilk siraya ekler   Oueue nun �zelliklerini alir
//        l5.addLast("K");    //son siraya ekler
//        System.out.println(l5); //[E, A, C, X, Y, B, X, Y, K]
//
//        // LinkedList List ve Queue interface'lerine implemnt ile child oldugundan
//        // her iki interface'deki tum method'lari override etmek zorundadir.
//        // Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit edilmistir
//
//        // Ben bir linkedList  olusturmak istiyorum ama sadece List ozelliklerini tasisin
//
//        List<String>  listList = new LinkedList01<>();
//        listList.add("Sadece list den gelen ozellikler var");
//
//        // Ben bir linkedList  olusturmak istiyorum ama sadece Queue ozelliklerini tasisin
//
//        Queue<String> queueList = new LinkedList01<>();
//        queueList.add("\"Sadece  queueList den gelen ozellikler var\"");
//    }
//}
