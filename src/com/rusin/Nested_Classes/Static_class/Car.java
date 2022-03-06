package com.rusin.Nested_Classes.Static_class;


public class Car {
    String color;
    int door;
    Engine1 engine;

    public Car(String color, int door, Engine1 engine) {
        this.color = color;
        this.door = door;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car : {" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    static class Engine1 {
        int  horseRower;

        public Engine1(int horseRower) {
            this.horseRower = horseRower;
        }

        @Override
        public String toString() {
            return "Car Engine1 : {" +
                    "horseRower=" + horseRower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine1 engine1 = new Car.Engine1(256);
        Car car = new Car("Red", 4, engine1);
        System.out.println(car);
    }
}
