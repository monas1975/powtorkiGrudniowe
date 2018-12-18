package pl.dom.ZadaniaPodstawy.Podstawy;

public class Zadanie11 {

    public static void main(String[] args){

        //Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych. W programie zdefiniuj wartość dochód (double)
        // na pewną wartość i po obliczeniu wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących reguł:
        // do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
        //od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
        double dochod = 178000;

        System.out.println("Podatek od " + dochod + " wynosi= "+ podatek(dochod));
    }

    public static double podatek(double dochod){
        double podatekDoZaplaty = 0;

        if(dochod<=85528){
            podatekDoZaplaty = dochod*0.18 - 556.02;
        }else{
          podatekDoZaplaty = 14839.02 + ((dochod-85528)*0.32);
        }


        return podatekDoZaplaty;
    }
}
