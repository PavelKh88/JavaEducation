package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\38096\\Desktop\\M\\");
        Files.copy(filePath,directoryPath.resolve(filePath));
        Files.copy(filePath,directoryPath.resolve("test16.txt"));
        System.out.println("Done!");

    }
}
