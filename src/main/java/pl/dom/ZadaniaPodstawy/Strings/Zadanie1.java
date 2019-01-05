package pl.dom.ZadaniaPodstawy.Strings;

//Zadeklaruj zmienną tekstową text i przypisz do niej jakąś wartość.
//sprawdź czy w tekście występuje słowo “ania” - contains
//sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
//sprawdź czy tekst kończy się słowem “ania” - endsWith
//sprawdź czy tekst równa się słowu “ania” - equals
//sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” - toLowerCase + contains
//zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf

public class Zadanie1 {

    public static void main(String[] args){

       String text1 = "aniajjkkkkk";
       String text2 = "ania";
       String text3 = "fGrrryAnIAkkkkk";
       String text4 ="dhhhddh";

       System.out.println(text1.contains("ania"));
       System.out.println(text1.startsWith("ania"));
       System.out.println(text1.endsWith("ania"));
        System.out.println(text1.equals("ania"));
        System.out.println(text2.equals("ania"));
        System.out.println("ania".equals(text1));
        System.out.println(text3.toLowerCase().contains("ania"));
        System.out.println(text1.indexOf("ania"));
        System.out.println(text3.toLowerCase().indexOf("ania"));

    }


}
