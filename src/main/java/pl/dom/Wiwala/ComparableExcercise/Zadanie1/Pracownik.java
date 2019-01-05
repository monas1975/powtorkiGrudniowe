package pl.dom.Wiwala.ComparableExcercise.Zadanie1;

//7. Sortowanie:
//Stwórz arraylistę 5 pracowników
//    - Anna, 15
//    - Jan, 14
//    - Magda, 28
//    - Katarzyna, 20
//    - Robert, 19
//
//1.
//Zaimplementuj interfejs comparable który sortuje domyślnie pracowników alfabetycznie, po imieniu.
//-> Posortuj pracowników alfabetycznie po imieniu, a następnie wypisz ich na ekran.
//
//2.Posortuj pracowników rosnąco względem długości imienia i wypisz ich na ekran.
//
//3. Posortuj pracowników rosnąco względem wieku i wypisz ich na ekran.
//
//Podpowiedź:
//    Collections.sort();
//    Comparator
//    Comparable

public class Pracownik implements Comparable<Pracownik> {

    private String name;
    private Integer age;

    public Pracownik(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Pracownik o) {
        return name.compareTo(o.name);
    }


}
