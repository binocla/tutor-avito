package lesson2_stream_api;

public record Human(String name, int age) {
    public Human {
        if (age < 0 || age > 110) {
            System.out.println("error");
            System.exit(0);
        }
    }
}