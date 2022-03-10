package com.rusin.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentsInfo {
  void testStudents(ArrayList<Students> al, Predicate<Students> pr) {
      for (Students students : al) {
          if(pr.test(students)) {
              System.out.println(students);
          }
      }
  }
//     void printStudentOverGrade(ArrayList<Students> a1, double grade) {
//         for (Students students : a1) {
//             if(students.avgGrade > grade){
//                 System.out.println(students);
//             }
//         }
//    }
//    void printStudentMixCondition(ArrayList<Students> a1, int age, double grade, char sex) {
//        for (Students students : a1) {
//            if(students.age < age && students.avgGrade < grade && students.sex == sex){
//                System.out.println(students);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Students> a1, int age) {
//        for (Students students : a1) {
//            if(students.age < age) {
//                System.out.println(students);
//            }
//        }
//    }
}

class Test{
    public static void main(String[] args) {
        Students st1 = new Students("Ivan", 'm',22, 3, 8.3 );
        Students st2= new Students("Nikolay", 'm',28, 2, 6.4 );
        Students st3 = new Students("Elena", 'f',19, 1, 8.9 );
        Students st4 = new Students("Petr", 'm',35, 4, 7 );
        Students st5 = new Students("Marya", 'f',23, 3, 9.1 );

        ArrayList<Students> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        StudentsInfo studentsInfo = new StudentsInfo();
        Function<Students,Double> f = students -> students.avgGrade ;
        double res = avgOfSmth(arrayList,students -> students.avgGrade);
        System.out.println(res);
//        studentsInfo.testStudents(arrayList,new CheckOverGrade());
//        studentsInfo.testStudents(arrayList, new StudentChecks() {
//            @Override
//            public boolean check(Students s) {
//                return s.age < 20;
//            }
//        });
//        studentsInfo.testStudents(arrayList, (Students students) -> {return students.age < 25;});
//        System.out.println("------------");
//        studentsInfo.testStudents(arrayList, (Students students) -> {return students.sex == 'm';});
//        System.out.println("------------");
//        studentsInfo.testStudents(arrayList, (Students students) -> {return students.avgGrade > 8;});
//        studentsInfo.printStudentUnderAge(arrayList, 20);
//        System.out.println("------------");
//        studentsInfo.printStudentOverGrade(arrayList,8);
    }
        private static double avgOfSmth(List<Students> list, Function<Students,Double> f ) {
        double result = 0;
            for (Students students : list) {
                result += f.apply(students);
            }
            result = result / list.size();
            return result;
        }
}
//
//interface StudentChecks {
//    boolean check(Students s);
//}
//
//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Students s) {
//        return s.avgGrade > 8 ;
//    }
//}


