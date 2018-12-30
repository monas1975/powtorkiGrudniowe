package pl.dom.ZadaniaPodstawy.Wyjatki;

import pl.dom.ZadaniaPodstawy.Wyjatki.Zad4.Club;
import pl.dom.ZadaniaPodstawy.Wyjatki.Zad4.Person;

public class Zadanie4 {

    //Napisz klasę Person, Club, NoAdultException. Klasa Person powinna zawierać, imię, nazwisko i wiek.
    // Klasa Club powinna zawierać metodę enter(Person person), która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.


    public static void main(String[] args){

        Person p1 = new Person("Tomek", "Szymanski", 43);
        Person p2 = new Person("Anka", "Szymanska", 42);
        Person p3 = new Person("Antek", "gggg", 17);
        Person p4 = new Person("Piotr", "xxxx", 27);

        Club club1  = new Club("club");
        club1.enter(p1);
        club1.enter(p2);
        club1.enter(p3);
        club1.enter(p4);

        club1.showMembers();


    }
}
