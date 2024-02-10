package lesson2_stream_api;

import lesson1_stream_api_project_task.Person;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                // one-to-many
                .flatMap(x -> Stream.generate(() -> 6).limit(5))
                .forEach(System.out::println);
        Person person = new Person("Ser", 20);
        person.setAge(15);
        Human human = new Human("Sergey", -10);
        Human human2 = new Human("Sergey", 21);
        System.out.println(human);
        System.out.println(human.age());
        System.out.println(human.name());
        System.out.println(human.equals(human2));
        // ...
        System.out.println(person); // Sergey, -20
    }
}
