package work_with_files.Programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees.bin"))) {
          list =(ArrayList) inputStream.readObject();
            System.out.println(list);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
