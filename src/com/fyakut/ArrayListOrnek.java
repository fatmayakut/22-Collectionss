package com.fyakut;



import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOrnek {

    public static  void main(String... args){

        String[] isimler={"fatma","ümran","yakut"};
        String[] soyisimler={"zana","ümran","yakut"};

        ArrayList<String>isimlistesi=new ArrayList<>();
        ArrayList<String>soyisimlistesi=new ArrayList<>();
        for (String s:isimler){
            isimlistesi.add(s);}

        for (String s:soyisimler){
            soyisimlistesi.add(s);}
/** iki listeden aynı olanları getirme İşlemi
 *
 * iterator ile hem listede gezme hemde işlem yapma kolaylığı vardr.
 */
isimlistesi.retainAll(soyisimlistesi);
for (String a:isimlistesi){
    System.out.println(a+"ortak olanlar");
    System.out.println(isimlistesi.size());
}
/** iki listeden aynı olanları getirmeme İşlemi
 *
        Iterator<String>iterator=isimlistesi.listIterator();

        while (iterator.hasNext())
            if (soyisimlistesi.contains(iterator.next()))
                iterator.remove();
for (String s:isimlistesi){
        System.out.println(s+"tekil olanalar");}
*/
/**
 * silme işlemini gelişmiş for ile yapınca hata vermektedr
 */
for (String s:isimlistesi){
    if (soyisimlistesi.contains(s))
    isimlistesi.remove(s);}
    }
}
