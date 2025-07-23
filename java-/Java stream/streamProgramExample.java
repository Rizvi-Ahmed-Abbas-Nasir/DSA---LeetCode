import java.util.*;
import java.util.stream.Collectors;

public class streamProgramExample {

    public static void main(String[] args) {
        // Example 1: Working with names
        List<String> names = List.of("Alice", "Bob", "Charlie");

        List<String> result = names.stream()              // Source
            .filter(n -> n.length() > 3)                  // Intermediate: names longer than 3 characters
            .map(String::toUpperCase)                     // Intermediate: convert to uppercase
            .sorted()                                     // Intermediate: sort alphabetically
            .collect(Collectors.toList());                // Terminal: collect as list

        System.out.println("Filtered and Sorted Names:");
        result.forEach(System.out::println);

        System.out.println("\n----------------------------\n");

        // Example 2: Working with custom Person class
        var persons = new ArrayList<Person>();
        persons.add(new Person("Lara", 35));
        persons.add(new Person("Peter", 21));
        persons.add(new Person("Zach", 45));
        persons.add(new Person("Karl", 50));
        persons.add(new Person("Barbara", 17));
        persons.add(new Person("Lois", 16));

        List<Person> minors = persons.stream()            // Source: list of Person
            .filter(p -> p.getAge() < 18)                 // Intermediate: filter under 18
            .collect(Collectors.toList());                // Terminal: collect to a list

        System.out.println("Minors (under 18):");
        minors.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }

    // Static inner class for Person
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
