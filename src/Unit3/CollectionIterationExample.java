package Unit3;

import Unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
        System.out.println("\nUsing for each loop");
        for (Person p : people){
            System.out.println(p);
        }

        System.out.println("\nUsing lambda for each");
        people.forEach(System.out::println);

    }

}
