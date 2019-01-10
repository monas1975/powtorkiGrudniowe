package pl.dom.Wiwala.Dziedziczenie.Person;

public interface Identified {

    default int getId(){
        return Math.abs(hashCode());
    }
}
