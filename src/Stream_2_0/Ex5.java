package Stream_2_0;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Buy");
        list.add("Hi");
        list.add("Hell");
        int result = (int) list.stream().filter(e -> e == "Hi").count();
        System.out.println(result);
        String first = list.stream().findFirst().get();
        System.out.println(first);
        String last = list.stream().skip(list.size() - 1).findFirst().get();
        System.out.println(last);
    }
}
