package pl.dom.ZadaniaPodstawy.Enum;

//Stwórz enum Płeć która posiada wartości: KOBIETA, MĘŻCZYZNA
//
//Stwórz klasę Obywatel która posiada pola:
//Płeć
//Imie
//Nazwisko
//Pesel
//
//Stwórz Maina w formie 'formularza' w którym zadajemy użytkownikowi pytania o jego dane (imie, nazwisko, pesel, płeć). Użytkownik podaje informacje o sobie i po podaniu wszystkich wartości tworzymy nowy obiekt typu "Obywatel".
//
//Zaimplementuj w klasie Obywatel metodę toString i w mainie (po wypełnieniu formularza) wypisz dane obywatela. (sout)

public class Citizen {

    private Sex sex;
    private String firstName;
    private String lastName;
    private String pesel;

    public Citizen(Sex sex, String firstName, String lastName, String pesel) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public Citizen() {
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "sex=" + sex +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
