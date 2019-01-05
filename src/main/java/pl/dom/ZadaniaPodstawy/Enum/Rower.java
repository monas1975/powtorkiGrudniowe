package pl.dom.ZadaniaPodstawy.Enum;

public class Rower {

    //
    //Stwórz enum TypRoweru i daj mu dwie wartości: ROWER, TANDEM. Dodatkowo enum posiada pole o nazwie ilośćMiejsc.
    // Dla enuma ROWER pole ma wartość 1, dla TANDEM’u ma wartość 2. Stwórz metodę ‘pobierzIlośćMiejsc():int’.
    //
    //Stwórz klasę Rower która posiada pola:
    //ilośćPrzerzutek, typRoweru, nazwaRoweru
    //
    //Stwórz metodę ‘wypiszInformacjeORowerze():void” która wypisuje informacje oraz podaje/wypisuje ilość miejsc (w postaci liczby).
    //Stwórz main’a, w metodzie main stwórz 3 rowery, przechowaj je w tablicy i wypisz je pętlą for.

    private int liczbaPrzerzutek;
    private TypRoweru typRoweru;
    private String nazwaRowery;

    public Rower(int liczbaPrzerzutek, TypRoweru typRoweru, String nazwaRowery) {
        this.liczbaPrzerzutek = liczbaPrzerzutek;
        this.typRoweru = typRoweru;
        this.nazwaRowery = nazwaRowery;
    }

    public int getLiczbaPrzerzutek() {
        return liczbaPrzerzutek;
    }

    public void setLiczbaPrzerzutek(int liczbaPrzerzutek) {
        this.liczbaPrzerzutek = liczbaPrzerzutek;
    }

    public TypRoweru getTypRoweru() {
        return typRoweru;
    }

    public void setTypRoweru(TypRoweru typRoweru) {
        this.typRoweru = typRoweru;
    }

    public String getNazwaRowery() {
        return nazwaRowery;
    }

    public void setNazwaRowery(String nazwaRowery) {
        this.nazwaRowery = nazwaRowery;
    }

    public void wypiszInformacjeOrowerze() {
        System.out.println("Nazwa: " + this.getNazwaRowery());
        System.out.println("Typ: " + this.getTypRoweru());
        System.out.println("Ilosc miejsc: " + this.getTypRoweru().pobierzIloscMiejsc());
        System.out.println("Ilosc przerzutek:  " + this.getLiczbaPrzerzutek());
        System.out.println("-----------------------------------------");
    }

}