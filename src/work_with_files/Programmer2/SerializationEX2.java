package work_with_files.Programmer2;

import work_with_files.Programer1.Employees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEX2 {
    public static void main(String[] args) {
        Employees employees1 ;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin"))) {
           employees1 =(Employees) inputStream.readObject();
            System.out.println(employees1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
