package pl.dom.Wiwala.Map;

public class Employee {

    private int id;
    private String nazwisko;

    public Employee(int id, String nazwisko) {
        this.id = id;
        this.nazwisko = nazwisko;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
