package lesson1_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("Sergey");
        Person p2 = new Person("John");
        Person p3 = new Person("a");
        Person p4 = new Person("Name");

        List<Person> people = new ArrayList<>(List.of(p1, p2, p3, p4));

        Comparator<Person> comparator = (o1, o2) -> {
            if (o1.getName().length() > o2.getName().length()) {
                return 1;
            } else if (o1.getName().length() < o2.getName().length()) {
                return -1;
            }
            return 0;
        };
        people = people.stream().sorted(comparator).toList();
        System.out.println(people);
    }
}
