package pl.dom.ZadaniaPodstawy.Enum;

public class Zadanie2 {
    //Stwórz enum TypRoweru i daj mu dwie wartości: ROWER, TANDEM. Dodatkowo enum posiada pole o nazwie ilośćMiejsc.
    // Dla enuma ROWER pole ma wartość 1, dla TANDEM’u ma wartość 2. Stwórz metodę ‘pobierzIlośćMiejsc():int’.
    //
    //Stwórz klasę Rower która posiada pola:
    //ilośćPrzerzutek, typRoweru, nazwaRoweru
    //
    //Stwórz metodę ‘wypiszInformacjeORowerze():void” która wypisuje informacje oraz podaje/wypisuje ilość miejsc (w postaci liczby).
    //Stwórz main’a, w metodzie main stwórz 3 rowery, przechowaj je w tablicy i wypisz je pętlą for.
    
    
    
    public static void main(String[] args){
        
        Rower r1 = new Rower(0,TypRoweru.ROWER,"skladak");
        Rower r2 = new Rower(0,TypRoweru.TANDEM,"malzenski");
        Rower r3 = new Rower(7,TypRoweru.ROWER,"goral");
        
        Rower[] list = new Rower[3];
        
        list[0] = r1;
        list[1] = r2;
        list[2] = r3;

        for(int i=0;i<list.length;i++){
            list[i].wypiszInformacjeOrowerze();
        }

        
        
    }
    
    
    
    
}
