package pl.dom.ZadaniaPodstawy.Petle;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadanie7 {

    //Napisać program, który pobiera od użytkownika ilość liczb N, a następnie wczytuje:
    //N liczb całkowitych od użytkownika
    //W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z podanych liczb oraz ich średnią arytmetyczną.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = 0;


        System.out.println("Podaj ilosc licz, ktore chcesz wprowadzic - n :");
        n= scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("podaj liczbe " + (i+1) + " :");
            list.add(scanner.nextInt());
        }
        printList(list);
        System.out.println("Minimum to  " + findMin(list) );
        System.out.println("Max =   " + findMax(list) );
        System.out.println("suma max and min to = " + (findMin(list) +  findMax(list)) );
        System.out.println("srednia max and min to = " + ((findMin(list) +  findMax(list))/2) );





        }

    public static Integer findMax(List<Integer> list) {
        Integer max = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }

    public static Integer findMin(List<Integer> list) {
        Integer min = list.get(0);
        for (Integer item: list
             ) {
           if(item< min){
               min = item;
           }
        }

        return min;
    }

    public  static void printList(List<Integer> list){
        for (Integer item: list
             ) {
            System.out.print(item + " , ");

        }
        System.out.println("");
    }



    }


