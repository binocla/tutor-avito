package lesson1_stream_api_project_task;

public class PeopleAnalyzer {
    private PeopleDatabase database;

    public PeopleAnalyzer(PeopleDatabase database) {
        this.database = database;
    }

    public long countPeopleWithNameStartingWith(String prefix) {
        return database.getPeopleStream()
                .filter(p -> p.getName().startsWith(prefix.toLowerCase()))
                .count();
    }

    public double averageAgeOfPeopleWithNameStartingWith(String prefix) {
        return database.getPeopleStream()
                .filter(p -> p.getName().startsWith(prefix.toLowerCase()))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
}

