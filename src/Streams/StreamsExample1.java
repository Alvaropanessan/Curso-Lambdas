package Streams;

import Unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //people.stream().forEach(p -> System.out.println(p.getFistName()));

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .filter(p-> p.getFistName().startsWith("L"))
                .forEach(System.out::println);

        System.out.println(people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count());

        people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(System.out::println);
    }
}
