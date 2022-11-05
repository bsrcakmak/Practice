package s14_lists;

import java.util.ArrayList;
import java.util.List;

public class ListedenElemanKaldir {
    public static void main(String[] args) {

       // Listede 15 veya 13 varsa, bu elemanları kaldırınız.

        List<Integer> list= new ArrayList<>();

        list.add(13);
        list.add(13);
        list.add(54);
        list.add(15);
        list.add(15);
        list.add(15);
        System.out.println(list);


        // 1. yol;
        List<Integer> removeList= new ArrayList<>();

        for (Integer w: list){

            if (w==13 || w==15){

                removeList.add(w);
            }

        }

        list.removeAll(removeList);
        System.out.println(list);


//        // 2. yol;
//
//        for (int i=0; i<list.size(); i++){
//
//            if (list.get(i)==13){
//                list.remove(i);
//                i--;
//            }
//        }
//
//        for (int i=0; i<list.size(); i++){
//
//            if (list.get(i)==15){
//                list.remove(i);
//                i--;
//            }
//
//        }
//        System.out.println(list);









    }






}
