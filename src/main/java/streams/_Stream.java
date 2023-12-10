package streams;

import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

     /*       people.stream()
                .map(person ->person.name)
                .mapToInt(name -> name.length())
                    .forEach(System.out::println);*/
        Predicate<Person> onlyFemales =person -> Gender.FEMALE.equals(person.gender);
        boolean containsOnlyFemales =people.stream().allMatch(onlyFemales);

        System.out.println(containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final _Stream.Gender gender;

        public Person(String name, _Stream.Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }


}
