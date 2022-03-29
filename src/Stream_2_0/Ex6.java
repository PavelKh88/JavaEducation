package Stream_2_0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("f1000");
        list.add("f000");
        list.add("f12");
        list.add("f9");
        list.add("fee");
        list.add("f10000");
        Comparator<String> comparator =Comparator.comparingInt(str -> str.charAt(1));
        String min = list.stream().min (comparator).get();
        System.out.println(min);

    }
}
