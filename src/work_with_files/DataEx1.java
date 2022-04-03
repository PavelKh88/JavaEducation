package work_with_files;

import java.io.*;

public class DataEx1 {
    public static void main(String[] args) {

        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("testData.bin"));
                DataInputStream inputStream = new DataInputStream(new FileInputStream("testData.bin")))
     {

         outputStream.writeBoolean(true);
         outputStream.writeByte(1);
         outputStream.writeInt(2222);
         outputStream.writeLong(100L);
         outputStream.writeDouble(10.0);
         System.out.println("File Write!");
         System.out.println("Boolean " + inputStream.readBoolean());
         System.out.println(" Byte " + inputStream.readByte());
         System.out.println("Int " + inputStream.readInt());
         System.out.println("Long " + inputStream.readLong());
         System.out.println("Double " +  inputStream.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
