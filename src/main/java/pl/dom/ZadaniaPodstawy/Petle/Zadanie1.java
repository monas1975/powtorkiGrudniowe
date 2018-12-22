package pl.dom.ZadaniaPodstawy.Petle;

public class Zadanie1 {

    //Napisz aplikację która wypisuje:
    //liczby z zakresu 1 - 100 w nowych liniach
    //liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
    //liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
    //liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
    //liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
    //liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
    //liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
    //litery od 'a' do 'z'
    //litery od ‘A’ do ‘Z’
    //litery od ‘A’ do ‘Z’, tylko co drugą
    //litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
    //‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania) np.
    //
    //Hello World
    //Hello World
    //Hello World
    //….
    //
    //	Całą aplikację (wszystkie podpunkty) zrealizuj pętlą for ORAZ pętlą while.

    public static void main(String[] args){
        System.out.println("a) z for");
        for(int i= 1;i<=100;i++) {
            System.out.println(i);
        }
        System.out.println("a) z while");
        int counter = 1;
        while(counter<=100){
            System.out.println(counter++);

        }
        System.out.println("b) z for");
        for(int i=1000; i<=1020; i++){
            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.println("b) z while");
        counter = 1000;
        do {
            System.out.print(counter++ + ",");

        }while (counter<=1020);

        System.out.println("c) z for");
        for(int i=-30; i<=1000; i++){
            if(i%5==0) {
                System.out.println(i);
            }
        }
        System.out.println("c) z while");
         counter = -30;
         do {
             if(counter%5==0){
                 System.out.println(counter);
             }
             counter++;
         }while(counter<=1000);

        System.out.println("d) z for");
        for(int i=1; i<=100; i++){
            if(i%3==0) {
                System.out.println(i);
            }
        }
        System.out.println("d) z while");
        counter = 1;
        do {
            if(counter%3==0){
                System.out.println(counter);
            }
            counter++;
        }while(counter<=100);

        System.out.println("e) z for");
        for(int i=30; i<=300; i++){
            if((i%3==0) && (i%5==0)){
                System.out.println(i);
            }
        }
        System.out.println("e) z while");
        counter = 3;
        do {
            if((counter%3==0)&& (counter%5==0)){
                System.out.println(counter);
            }
            counter++;
        }while(counter<=300);

        System.out.println("f) z for");
        for(int i=-300; i<=300; i++){
            if((i%2!=0)){
                System.out.println(i);
            }
        }
        System.out.println("f) z while");
        counter = -30;
        do {
            if((counter%2!=0)){
                System.out.println(counter);
            }
            counter++;
        }while(counter<=300);

        System.out.println("g) z for");
        for(int i=-100; i<=100; i++){
            if((i%2==0)){
                System.out.println(i);
            }
        }
        System.out.println("g) z while");
        counter = -100;
        do {
            if((counter%2==0)){
                System.out.println(counter);
            }
            counter++;
        }while(counter<=100);

        System.out.println("h) z for");
        int a = (int) 'a';
        int z = (int) 'z';

        for(int i=a; i<=z; i++){
                System.out.println((char)i);
        }
        System.out.println("h) z while");
        counter = a;
        do {
            System.out.println((char)counter);
            counter++;
        }while(counter<=z);

        System.out.println("i) z for");
         a = (int) 'A';
         z = (int) 'Z';

        for(int i=a; i<=z; i++){
            System.out.println((char)i);
        }
        System.out.println("i) z while");
        counter = a;
        do {
            System.out.println((char)counter);
            counter++;
        }while(counter<=z);

        System.out.println("j) z for");
        a = (int) 'A';
        z = (int) 'Z';

        for(int i=a; i<=z; i=i+2){
            System.out.println((char)i);
        }
        System.out.println("j) z while");
        counter = a;
        do {
            System.out.println((char)counter);
            counter=counter+2;
        }while(counter<=z);

        System.out.println("k) z for");
        a = (int) 'b';
        z = (int) 'z';

        for(int i=a; i<=z; i=i+2){
            if(i%5==0) {
                System.out.println((char) i);
            }
        }
        System.out.println("k) z while");
        counter = a;
        do {
            if(counter%5==0){
                System.out.println((char)counter);
            }

            counter=counter+2;
        }while(counter<=z);

        System.out.println("l) z for");
        for(int i=1;i<=100; i++){
            System.out.println(i + " Hello world");
        }
        System.out.println("l) z while");
        counter = 1;
        while(counter<=100){
            System.out.println(counter + " Hello world");
            counter++;
        }
    }
}
