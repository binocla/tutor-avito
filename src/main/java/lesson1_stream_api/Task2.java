package lesson1_stream_api;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>(Set.of("Hello", "Binocla", "qweqwe", " xx    xased"));

        // Я хочу получить строку, которая соединяет все элементы Set'a через ☺
        String result = strings.stream().collect(Collectors.joining());
        System.out.println(result);

    }
}
