package pl.dom.ZadaniaPodstawy.Wyjatki.Zadanie4;

public class Person {
    //Napisz klasę Person, Club, NoAdultException. Klasa Person powinna zawierać, imię, nazwisko i wiek.
    // Klasa Club powinna zawierać metodę enter(Person person), która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.


     private String imie;
     private String nazwisko;
     private int wiek;

    public Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
