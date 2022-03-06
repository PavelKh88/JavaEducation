package com.rusin.Nested_Classes.Inner_Class;


public class Car {
    String color;
    int door;
   Engine1 engine;

    public Car(String color, int door) {
        this.color = color;
        this.door = door;
//        this.engine = this.new Engine1(horsePower);
    }

    public void setEngine(Engine1 engine) {
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

    class Engine1 {
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
        Car car = new Car("Black" , 4 );
        Car.Engine1 engine1 = car.new Engine1(150);
        car.setEngine(engine1);
        System.out.println(car);
    }
}
