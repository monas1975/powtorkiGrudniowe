package pl.dom.Wiwala.ComparableExcercise.Zadanie1;

import java.util.Comparator;

public class PracownikWiekComperator implements Comparator<Pracownik> {

    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return o1.getAge()-o2.getAge();
    }
}

