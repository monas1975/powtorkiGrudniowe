package pl.dom.Wiwala.ComparableExcercise.Zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

////7. Sortowanie:
////Stwórz arraylistę 5 pracowników
////    - Anna, 15
////    - Jan, 14
////    - Magda, 28
////    - Katarzyna, 20
////    - Robert, 19
////
////1.
////Zaimplementuj interfejs comparable który sortuje domyślnie pracowników alfabetycznie, po imieniu.
////-> Posortuj pracowników alfabetycznie po imieniu, a następnie wypisz ich na ekran.
////
////2.Posortuj pracowników rosnąco względem długości imienia i wypisz ich na ekran.
////
////3. Posortuj pracowników rosnąco względem wieku i wypisz ich na ekran.
////
////Podpowiedź:
////    Collections.sort();
////    Comparator
////    Comparable

public class PracownikMain {

    public static void main(String[] args){

        Pracownik p1 = new Pracownik("Anna",15);
        Pracownik p2 = new Pracownik("Jan",14);
        Pracownik p3 = new Pracownik("Magda",28);
        Pracownik p4 = new Pracownik("Katarzyna",20);
        Pracownik p5 = new Pracownik("Robert",19);

        List<Pracownik> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        for (Pracownik pracownik: list
             ) {
             System.out.println(pracownik.toString());
        }
        System.out.println("-----------------------------------------");
        Collections.sort(list);

        for (Pracownik pracownik: list
        ) {
            System.out.println(pracownik.toString());
        }
        System.out.println("-----------------------------------------");
        Collections.sort(list,new PracownikLenghtComperator());
        for (Pracownik pracownik: list
        ) {
            System.out.println(pracownik.toString());
        }
        System.out.println("-----------------------------------------");

        //c - wiek
       // Collections.sort(list, new PracownikWiekComperator());
        Collections.sort(list, (Pracownik o1, Pracownik o2)->o1.getAge() - o2.getAge());
        for (Pracownik pracownik: list
        ) {
            System.out.println(pracownik.toString());
        }

        System.out.println("-----------------------------------------");

        list.removeIf((p)->p.getAge()<16);
        for (Pracownik pracownik: list
        ) {
            System.out.println(pracownik.toString());
        }

        repeat(5,()->System.out.println("Hello"));
    }

    public static void repeat(int n, Runnable r){
        for(int i=0;i<n;i++){
            r.run();
        }
    }
}
