package Stream_2_0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {

    List<String> array = new ArrayList<>();
    array.add("Petr");
    array.add("Andrey");
    array.add("Andreyy");
    array.add("Stas");
    array.add("Irina");
    array.add("Oleg");
        Comparator<String> comparator;
        comparator = Comparator.comparingInt(str -> str.charAt(1));
    array.stream().sorted(comparator).forEach(System.out::println);
    }
}
