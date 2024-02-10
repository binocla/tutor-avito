package lesson1_stream_api_project_task;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Сергей", 21),
                new Person("Джек", 25),
                new Person("Джон", 30),
                new Person("саймон", 35)
        );

        PeopleDatabase database = new PeopleDatabase(people);
        PeopleAnalyzer analyzer = new PeopleAnalyzer(database);

        System.out.println("Кол-во людей, чьё имя начинается с 'С': " + analyzer.countPeopleWithNameStartingWith("С"));
        System.out.println("Средний возраст людей, чьё имя начинается с 'Д': " + analyzer.averageAgeOfPeopleWithNameStartingWith("Д"));
    }
}

