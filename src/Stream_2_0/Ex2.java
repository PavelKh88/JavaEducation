package Stream_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List<Students11> students11s = new ArrayList<>();
        Students11 st1 = new Students11("Marya");
        Students11 st2 = new Students11("Petr");
        Students11 st3 = new Students11("Stas");
        Students11 st4 = new Students11("Andrey");
        Students11 st5 = new Students11("Aleksandra");
        students11s.add(st1);
        students11s.add(st2);
        students11s.add(st3);
        students11s.add(st4);
        students11s.add(st5);
        students11s.stream().forEach(System.out::println);
        System.out.println("_______________________________________________");
      List<Students11> list2 =  students11s.stream().
              filter(el -> el.getName().charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(list2 + "Size " + list2.size());

    }
}

 class Students11 {

    private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Students11(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "Students11{" +
                 "name='" + name + '\'' +
                 '}';
     }
 }

