package test;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String brand = null;

        Optional<String> brandOptional = Optional.ofNullable(brand);
        System.out.println(brandOptional.isEmpty());

        // The first way to check if the variable is null
        brandOptional.ifPresentOrElse(b -> System.out.println(b.toUpperCase()),
                () -> System.out.println("Brand is empty"));

        // If the brandOptional is null, it will get "Khaidev Foundation" as the default.
        // Otherwise, it will get the value of brandOptional
        var result = brandOptional.orElse("Khaidev Foundation");
        System.out.println(result);

        // The second way to check if the variable is null
        printInUpperCase(Optional.of("foo"));
    }

    public static void printInUpperCase(Optional<String> input) {
        input.ifPresentOrElse(s -> System.out.println(s.toUpperCase()),
                () -> System.out.println("input is null"));
    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return STR."Cat{name='\{name}'}";
        }

        public String getName() {
            return name;
        }
    }
}
