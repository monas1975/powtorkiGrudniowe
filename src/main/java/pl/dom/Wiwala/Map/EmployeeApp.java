package pl.dom.Wiwala.Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeApp {

    public static void main(String[] args){

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Nowak"));
        list.add(new Employee(2,"Kowalski"));

        Map<Integer,String> idNazwisko = list.stream().collect(Collectors.toMap(Employee::getId,Employee::getNazwisko));
        System.out.println(idNazwisko.get(1));
        System.out.println(idNazwisko.get(2));
        System.out.println(idNazwisko.get(3));
    }
}