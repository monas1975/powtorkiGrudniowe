package pl.dom.ZadaniaPodstawy.Tablice;

import java.util.Scanner;

public class Zadanie3 {

    //Napisać program, który wczytuje od użytkownika liczbę całkowitą, a następnie wyświetla jej reprezentację w kodzie binarnym (ZM).
    // Podczas konwersji liczby należy kolejne jej bity zapisywać w pomocniczej tablicy liczb całk. o rozmiarze 32.
    // Konwersji należy dokonać korzystając z operacji dzielenia całkowitego oraz operacji modulo.
    //
    //Przykład:
    //        Wejście:
    //            -75 (liczba podana przez użytkownika)
    //        Wynik:
    //            Liczba -75 binarnie: 1.1001011

    public static void main(String[] args){

        int recivedNumber=0;
        int[] binary = new int[32];
        Scanner scanner = new Scanner(System.in);
     //   System.out.println("Podaj liczbe w systemie dziesietnym");
     //   recivedNumber = scanner.nextInt();
//        printBinaryNumber(binary);

        for(int i=0; i<=100;i++){
            binary = decimal2binaryConventer(i);
            System.out.print(i + "=       ");
            printBinaryNumber(binary);
            System.out.println("");
        }


    }

    public static int[] decimal2binaryConventer(int number){
        int[] binaryNumber = new int[32];
        int tempNumber = number;
        int counter =31;

        while(tempNumber>0){
            binaryNumber[counter]=tempNumber%2;
            tempNumber = tempNumber/2;
            counter--;

        }

        return binaryNumber;
    }

    public  static void printBinaryNumber(int[] tab){
        int lastOneIndex=0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]==1) {
                lastOneIndex = i;
                break;
            }
        }


        for(int i=lastOneIndex; i<tab.length; i++){

                System.out.print(tab[i]);

        }

    }

}
