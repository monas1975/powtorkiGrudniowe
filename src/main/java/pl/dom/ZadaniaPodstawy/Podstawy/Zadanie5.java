package pl.dom.ZadaniaPodstawy.Podstawy;

public class Zadanie5 {

    public static void main(String[] args){
        //Zadeklaruj zmienne logiczne (boolean) które noszą nazwe:
//    jest_cieplo
//    wieje_wiatr
//    swieci_slonce
//
//    oraz zmienne:
//    ubieram_sie_cieplo - jesli nie jest cieplo lub wieje wiatr
//    biore_parasol - jesli nie swieci slonce ale nie wieje wiatr
//    ubieram_kurtke - jesli wieje, nie ma slonca i nie jest cieplo

        boolean jest_cieplo=true;
        boolean jest_wiatr=true;
        boolean swieci_slonce=true;

        boolean ubieram_sie_cieplo;
        boolean biore_parasol;
        boolean ubieram_kurtke;

        if(!jest_cieplo || jest_wiatr) {ubieram_sie_cieplo = true;}
        if (!swieci_slonce && !jest_wiatr) {biore_parasol=true;}
        if (jest_wiatr &&!swieci_slonce && !jest_cieplo){ubieram_kurtke=true;}


    }
}
