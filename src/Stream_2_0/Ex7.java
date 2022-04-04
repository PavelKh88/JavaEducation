package Stream_2_0;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex7 {
public static void main(String[] args) {
//  1)  Vivesti 11 chisel nachinaya s 2.
//    for (int i = 2; i <= 22 ; i += 2) {
//        System.out.println(i);
//    }
//    System.out.println(Stream.iterate(2,e -> e += 2).limit(11).collect(Collectors.toList()));
//    2)Proverit Spisok users Vsem Li ,bolshe 18 let;
    Random random = new Random();
    List<User> usersList = new ArrayList<>();
    for (int i = 1; i <= 100 ; i++) {
        usersList.add(new User("user" + i ,random.nextInt(100) + 1 ,
                random.nextInt(10) %2 == 1 ? Sex.MALE :Sex.FEMALE));
    }
//    usersList.stream().forEach(System.out::println);
//    System.out.println( "Users is = " + usersList.size());
//    System.out.println(  "Male users :" + usersList.stream().filter(e -> e .sex == Sex.MALE).count());
//    System.out.println(  "Male users :" + usersList.stream().filter(e -> e .sex == Sex.FEMALE).count());
//    System.out.println("Average Years Male :" + usersList.stream().filter(e -> e.sex == Sex.MALE).mapToInt(e -> e.age).average().getAsDouble());
//    System.out.println("Average Years Female :" + usersList.stream().filter(e -> e.sex == Sex.FEMALE).mapToInt(e -> e.age).average().getAsDouble());
//    System.out.println(" Min Years is user : " + usersList.stream().min((e , y) -> e.age - y.age ).get());
//    System.out.println(" Max Years is user : " + usersList.stream().max((e , y) -> e.age - y.age ).get());
//    System.out.println("First User in List: " + usersList.stream().findFirst().get());
//    System.out.println("Last User in List: " + usersList.stream().skip(usersList.size() - 1).findFirst().get());
//    System.out.println("50 User in List: " + usersList.stream().skip(49).findFirst().get());
//    System.out.println("First 10 users in List: " +  usersList.stream().limit(10).collect(Collectors.toList()));
//    System.out.println("First 5 users max years: " +  usersList.stream().sorted((x,y)-> x.age - y.age).
//                                                    skip(usersList.size() - 5).collect(Collectors.toList()));
//    System.out.println("5 users Female min years: " + usersList.stream().filter(e -> e.sex == Sex.FEMALE)
//                                                    .sorted((x,y) -> x.age -y.age).limit(5).collect(Collectors.toList()));
    Map<String, Integer> mapUsers = usersList.stream().sorted((x,y) -> x.getName().charAt(4) - y.getName().charAt(4)).
            collect(Collectors.toMap(User::getName, User::getAge));
//    System.out.println(mapUsers);
        mapUsers.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
}
}
enum Sex{MALE,FEMALE}

class User{
    String name;
    int age;
    Sex sex;

    public User(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
