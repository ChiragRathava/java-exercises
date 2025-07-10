package List;// How do you sort a LinkedList of custom objects by a specific field?

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;



public class Ex_24 {

    public static void main(String[] args) {
        List<Person> list = new LinkedList<>(Arrays.asList(new Person("Chirag",21),new Person("Paresh",28),new Person("Viju",25)));
        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        for (Person person: list)
        {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName()
    { return name; }

    public int getAge()
    { return age; }
}

