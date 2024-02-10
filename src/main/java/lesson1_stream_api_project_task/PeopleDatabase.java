package lesson1_stream_api_project_task;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleDatabase {
    private List<Person> people;

    public PeopleDatabase(List<Person> people) {
        this.people = people;
    }

    public Stream<Person> getPeopleStream() {
        return people.stream();
    }

    public List<Person> getPeopleAboveAge(int age) {
        return people.stream()
                .filter(p -> p.getAge() > age)
                .collect(Collectors.toList());
    }
}

