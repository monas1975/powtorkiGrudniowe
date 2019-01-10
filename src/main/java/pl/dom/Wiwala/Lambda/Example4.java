package pl.dom.Wiwala.Lambda;

import java.util.Arrays;
import java.util.Comparator;


public class Example4 {

    public static void main(String[] args){
        String[] people = {"Maja", "Romuald", "Piotr", "Ala","Zenek"};
        String[] people2 = {"Maja", "Romuald", "Piotr", "Ala","Zenek"};
        Arrays.sort(people,compareInDirection(true));
        System.out.println(Arrays.toString(people));

        Arrays.sort(people,compareInDirection(false));
        System.out.println(Arrays.toString(people));
    }

    public static Comparator<String> compareInDirection(boolean direction){
        if(direction){
            return (x,y)-> x.compareTo(y);
        }
        return (x,y)->((-1)*x.compareTo(y));
    }

}
