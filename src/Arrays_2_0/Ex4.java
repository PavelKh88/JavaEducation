package Arrays_2_0;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int result = list.stream().filter(e -> e % 2 == 0).reduce((ac,el) -> ac + el).get();
        System.out.println( "Result sum = " + result);

    }
}
