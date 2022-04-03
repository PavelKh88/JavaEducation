package work_with_files.Programer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan ", "white");
        Employees employees = new Employees("Maria", "IT" , 28, 500.0, car);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
