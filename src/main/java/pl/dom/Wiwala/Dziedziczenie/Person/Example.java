package pl.dom.Wiwala.Dziedziczenie.Person;

public class Example implements Person,Identified {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return Identified.super.getId();
    }
}
