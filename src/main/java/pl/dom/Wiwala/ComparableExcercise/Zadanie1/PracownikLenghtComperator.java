package pl.dom.Wiwala.ComparableExcercise.Zadanie1;

import java.util.Comparator;

public class PracownikLenghtComperator implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
