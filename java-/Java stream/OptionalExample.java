import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Alice");

        // 1. isPresent
        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        // 2. ifPresent
        name.ifPresent(n -> System.out.println("Hello, " + n));

        // 3. orElse
        String value = name.orElse("Default");
        System.out.println("Value: " + value);

        // 4. orElseGet
        String lazy = name.orElseGet(() -> "LazyDefault");
        System.out.println("Lazy: " + lazy);

        // 5. map
        Optional<String> upper = name.map(String::toUpperCase);
        System.out.println("Upper: " + upper.get());

        // 6. filter
        Optional<String> filtered = name.filter(n -> n.length() > 3);
        filtered.ifPresent(n -> System.out.println("Filtered: " + n));

        // 7. empty Optional
        Optional<String> empty = Optional.empty();
        System.out.println("Is empty present? " + empty.isPresent());
    }
}
