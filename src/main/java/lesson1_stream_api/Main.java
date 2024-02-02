package lesson1_stream_api;

/**
 * Stream API - появилась такая библиотека с Java 8
 * <p>
 * Поток данных, который мы может удобно и классно обрабатывать
 * <p>
 * 1. Инициализация (Создание) (init) -- создание возможности использовать Steam API
 * 2 (Optional). Стадия операций (конвейерные методы) -- обработка наших данных
 * 3. Терминальная стадия - куда-то сохранить или что-либо сделать по итогу с нашими обработанными данными
 * Pipeline
 * <p>
 * 1. Non-interference -- не влияют на исходный источник данных
 * 2. Lazy -- пока мы не будем использовать какую-либо терминальную операцию, наш Stream API никогда и никем не будет использоваться
 * 3. Parallel
 * <p>
 * Interface Spliterator. -- специальный интерфейс (Java 8) который на самом деле тот же Iterator
 */
public class Main {
    public static void main(String[] args) {
        // 1. Инициализация
//        Stream.of(1, 2, 3, 4, 5, 6); // 1
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.stream(); // 2
//        Stream.generate(() -> 6); // 3
//        int[] ar = {1, 2 ,3};
//        Arrays.stream(ar) // 4

//        Stream.of(1, 2, 3, 4, 5)
//                .map(x -> x * 2) // map операция для элемента "потока"
//                .filter(x -> {
//                    if (x == 1) {
//                        return true;
//                    }
//                    return false;
//                }) // if
//                .sorted() // сортировка, принимает компаратор или использует дефолтную сортировку (на основе Comparable)
//                .skip(2) // skip пропускает 2 элемента cnt++
//                .limit(5) // ограничиваем до 5 элементов
//                .peek(System.out::println); // пробежаться по всему, for
        // Стадия 3
//        var data = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList())); // Собирает наши обработанные данные куда-либо
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        stream.forEach(item -> System.out.println(item));
//        stream.count(); // какое-то количество
//        stream.max(); // максимальное значение
//        stream.reduce(0, (a, b) -> a + b); // схлопывает все элементы до 1 и выполняет над ними какое-то действие

//        System.out.println(Stream.of(1, 2, 3, 4, 5)
//                .map(x -> x * 3)
//                .filter(x -> x % 2 == 0)
//                .peek(x -> System.out.println("Element1 " + x))
//                .toList());

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, list.get(i) * 3);
//            if (list.get(i) % 2 == 0) {
//                System.out.println("Element1 " + list.get(i));
//            }
//        }
    }
}
