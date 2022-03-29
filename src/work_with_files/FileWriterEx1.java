package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно,что мне ничего не известно.\n" +
                "Вот последняя правда,открытая мной.\n";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("text2.txt",true);
            for (int i = 0; i < rubai.length() ; i++) {
                fileWriter.write(rubai.charAt(i));
            }
            System.out.println("Done!");
            String s = "privet\n";
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fileWriter.close();
        }
    }
}
