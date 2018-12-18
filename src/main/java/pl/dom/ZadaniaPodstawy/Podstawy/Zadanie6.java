package pl.dom.ZadaniaPodstawy.Podstawy;

public class Zadanie6 {

    public static void main(String[] args) {

        //Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
        // Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która  na kolejkę/rollercoaster) jest
        // wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.

        int wzrost = 180;
        int waga = 70;



        if (wzrost > 150 && waga < 180){
            System.out.println("nadajesz sie");
        }else if (waga >= 180){
            System.out.println("jestes za cizki");
        }else if(wzrost < 150){
            System.out.println("jestes za niski");
        }
    }

}
