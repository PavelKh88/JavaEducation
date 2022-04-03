package work_with_files.Programer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Sasha");
        employees.add("Andrey");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"));
        )
        {
            outputStream.writeObject(employees);
            System.out.println("File write!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
