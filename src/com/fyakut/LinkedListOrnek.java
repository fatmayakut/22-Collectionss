package com.fyakut;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOrnek {


    public static  void main(String... args){
        /**
        Musteri m1=new Musteri(15);
        Musteri m2;
        m2=m1;
        m2.setHesap(10);
        System.out.println(m1.getHesap());**/
/*
        ArrayList<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(8);
        sayılar.add(12);
        sayılar.add(5);
        for (int i:sayılar) {
            System.out.println(i);
        }sayılar.add(3, 15);
        for (int i:sayılar){
            System.out.println(i);

        }*/
/**
 * LinkedList
 */

     LinkedList<String> gezilecekyerler=new LinkedList<>();
     /*      gezilecekyerler.add("Diyarbakır");
        gezilecekyerler.add("Ergani");
        gezilecekyerler.add("Mardin");
        gezilecekyerler.add("Van");
*/
        sıralıekle(gezilecekyerler,"İstanbul");

        sıralıekle(gezilecekyerler,"Antep");
        sıralıekle(gezilecekyerler,"Ankara");

        sıralıekle(gezilecekyerler,"Malatya");


        yeryazdır(gezilecekyerler);
//gezilecekyerler.add(2,"urfa");
yeryazdır(gezilecekyerler);


    }


    private static void yeryazdır(LinkedList<String> gezilecekyerler) {
        ListIterator<String> listIterator=gezilecekyerler.listIterator();
        while(listIterator.hasNext()) {//icerisinde eleman var mı yokmu kontrolü eleman yok ise çalışmaz
            System.out.println("suanki yer:" + listIterator.next());
        }
        System.out.println("----------------");
    }


    private static boolean sıralıekle(LinkedList<String> gezilecekyerler,String yenisehir) {
        ListIterator<String> listIterator=gezilecekyerler.listIterator();
        while (listIterator.hasNext()){
            int karsilastir=listIterator.next().compareTo(yenisehir);//karşılastırma
            if (karsilastir==0){
                System.out.println("zaten var"+yenisehir);

          return false;

        }else if (karsilastir>0){
            listIterator.previous();
            listIterator.add(yenisehir);
        listIterator.add(yenisehir);
        return true;}

    }
    listIterator.add(yenisehir);
        return true;
}

}
