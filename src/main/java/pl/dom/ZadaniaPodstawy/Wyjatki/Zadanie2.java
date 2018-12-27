package pl.dom.ZadaniaPodstawy.Wyjatki;

public class Zadanie2 {

    //Stwórz program obliczający równanie kwadratowe (http://matematyka.pisz.pl/strona/54.html).
    // Na wejściu użytkownik podaje wartość zmiennych A, B i C,
    // a na wyjściu wypisują sie odpowiednie komunikaty o wartościach x1 i x2 lub x0,
    // a także wartość delty. Jeśli dla podanych wartości delta jest ujemna, rzuć stworzony przez siebie wyjątek.

    public static void main(String[] args){

        double a=1;
        double b=2;
        double c=4;
        double Delta;

        liczRownanieKwadratowe(a,b,c);

    }
      public static void liczRownanieKwadratowe(double a, double b, double c){

        double delta=0;
        double x0,x1,x2 = 0;

        try{
            delta = b*b - (4*a*c);
            if(delta<0){
                throw new Exception("Ujemna delta/ Brak rozwiazania w zbiorze liczb rzeczwistych");
            }


        }catch(Exception e){
            System.out.println("Error " + e.getMessage());

        }

        if (delta > 0){
            x1 = (-b-Math.sqrt(delta)) /(2*a);
            x2 = (-b+Math.sqrt(delta)) /(2*a);
            System.out.println("Rozwiazaniem rownania jest x1=" + x1 + " x2= " + x2);
        }
        if(delta == 0){
            x0 = -b/(2*a);
            System.out.println("Rozwiazaniem rownania jest x0=" + x0);
        }

      }
}
