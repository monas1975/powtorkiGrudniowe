package pl.dom.ZadaniaPodstawy.Wyjatki.Zad4;

import java.util.ArrayList;

public class Club {

    //Napisz klasę Person, Club, NoAdultException. Klasa Person powinna zawierać, imię, nazwisko i wiek.
    // Klasa Club powinna zawierać metodę enter(Person person), która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.

    private String name;
    private ArrayList<Person> list;

    public Club(String name) {
        this.name = name;
        this.list = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getList() {
        return list;
    }

    public void setList(ArrayList<Person> list) {
        this.list = list;
    }

    public void enter(Person person) {

        try {

            person.getWiek();
            if (person.getWiek() < 18) {
                throw new Exception("to young");
            } else this.list.add(person);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

    }


    public void showMembers() {
        for (Person person : this.list
        ) {
            System.out.println(person.toString());

        }
    }

}
