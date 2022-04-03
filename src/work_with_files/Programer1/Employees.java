package work_with_files.Programer1;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class Employees implements Serializable {
    String name;
    String department;
    int age;
   transient double salary;
    Car car;

    public Employees(String name, String department, int age, double salary,Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
