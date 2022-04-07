package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class RandomAccessFileEX1 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("text2.txt" , "rw")) {
            FileChannel channel = file.getChannel();
            StringBuilder stix = new StringBuilder();
            ByteBuffer buffer = ByteBuffer.allocate(10);
            int byteRead = channel.read(buffer);
            while (byteRead > 0 ) {
                System.out.println("Read" + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()) {
                    stix.append((char)buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stix);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
