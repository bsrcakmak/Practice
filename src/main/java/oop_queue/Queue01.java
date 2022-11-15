package oop_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
              1) Elemanlar en sonra eklenir ve en bastan silinir.
              Bu sisteme FIFO(First in, first out) denir.
              Eczaneler, Yemekhaneler bu sistemi kullanir...
          */
    public static void main(String[] args) {

        // PriorityQueue kullanarak Queue uretirseniz, Java kendisi bir Priority kurali belirler
        // ve urettigi bu kurala gore elemanlari dizer. Istersek biz kendi Priority kuralimizi
        // uretip elemanlari bu kurala gore dizebiliriz.
        Queue<String> q1 = new PriorityQueue<>();
        q1.add("Milk");
        q1.add("Cheese");
        q1.add("Water");
        q1.add("Oil");
        q1.add("Meat");
        System.out.println(q1); // [Cheese, Meat, Water, Oil, Milk]

        // peek() method'u ilk elemani silmeden bize return eder. copy-paste gibi
        System.out.println(q1.peek()); // Cheese
        System.out.println(q1);

        //poll() method'u ilk elemani silip bize return eder. cut-paste gibi
        System.out.println(q1.poll()); // Cheese
        System.out.println(q1); // [Meat, Milk, Water, Oil]

        //offer() eleman eklemek icin kullanilir. add() method'u gibi. Eleman siniri konulmus
        // Queue'larda eleman ekleme istenirse offer() kullanilabilir.
        q1.offer("Coke");
        System.out.println(q1); // [Coke, Meat, Water, Oil, Milk]
        System.out.println("=============");

        Queue<String> q2 = new LinkedList<>();
        q2.add("Bread");
        q2.add("Sugar");
        q2.add("Rice");
        q2.add("Bean");
        q2.add("Salt");
        System.out.println(q2); // [Bread, Sugar, Rice, Bean, Salt]

		/*
		 	remove() ve poll() ilk elemani siler ve return eder.
		 ama collection'da eleman yoksa remove () method'u Exception verir.
		 poll() method'u Exception atmaz null return eder.
		 */
        //q2.remove();
        q2.poll();
        System.out.println(q2); // [Sugar, Rice, Bean, Salt]
        q2.clear();
        System.out.println(q2.remove());// Exception verir.
        System.out.println(q2.poll()); // null
    }
}
