package pl.dom.ZadaniaPodstawy.Podstawy;

public class Zadanie10 {

//Zadeklaruj trzy zmienne (liczby). Wypisz na ekran wszystkie z nich,
// a następnie wypisz na ekran największą oraz najmniejszą z nich.

    public static void main(String[] args){

        int a = 2;
        int b = 12;
        int c = 12;

        int max = 0;
        int min = 0;

        if ((a>b && a>c ) && (b>c)){
            min = c;
            max = a;
        }else if ((a>b && a>c ) && (c>b)){
            min = b;
            max = a;
        }else if ((b>a && b>c) && (a>c)){
            min = c;
            max = b;
        } else if ((b>a && b>c) && (c>a)){
            min = a;
            max = b;
        } else if ((c>a && c>b) && (b>a)){
            min = a;
            max = c;
        } else if ((c>a && c>b) && (a>b)) {
            min = b;
            max = c;
        }else if((a==b) && (c>a)) {
            min = a;
            max = c;
        }else if((a==c) && (b>a)) {
            min = a;
            max = b;
        }else if ((a==c) && (b<a)) {
            min = b;
            max = a;
        }else if ((b==c) && (c<a)) {
            min = c;
            max = b;
        }else if ((b==c) && (c>a)){
            min = a;
            max = c;
        } else if (a==b && a==c){
            System.out.println("wszystkie liczby rowne");
        }

        if(!(a==b && a==c)){
            System.out.println("max= " + max + " min= " + min);
        }

    }



}
