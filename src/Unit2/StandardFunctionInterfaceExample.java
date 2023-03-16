package Unit2;


import Unit1.Person;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionInterfaceExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",39)
        );

        //Step 1 : Sort list by last name
        Collections.sort(people, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        System.out.println("All person");
        performConditionally(people, p -> true, p -> System.out.println(p));

        //Step 3: Create a method thet prints all people that have last name beginning with C
        System.out.println("\nAll person with Last name beginning with C");
        performConditionally(people,p -> p.getLastName().startsWith("C"), p -> System.out.println(p));


        System.out.println("\nAll person with Fist name beginning with C");
        performConditionally(people,p -> p.getFistName().startsWith("C"), p -> System.out.println(p.getFistName()));
    }

    private static  void  performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}

