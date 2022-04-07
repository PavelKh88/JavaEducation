package work_with_files;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Map;

public class PathAndFilesEX1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\38096\\Desktop\\M\\");
        System.out.println(".getFileName - " + filePath.getFileName());
        System.out.println(".getFileName - " + directoryPath.getFileName());
        System.out.println("--------------------------------------------");
        System.out.println(".getParent - " + filePath.getParent());
        System.out.println(".getParent - " + directoryPath.getParent());
        System.out.println("--------------------------------------------");
        System.out.println(".getRoot - " + filePath.getRoot());
        System.out.println(".getRoot - " + directoryPath.getRoot());
        System.out.println("--------------------------------------------");
        System.out.println(".isAbsolute - " + filePath.isAbsolute());
        System.out.println(".isAbsolute - " + directoryPath.isAbsolute());
        System.out.println("--------------------------------------------");
        System.out.println(".toAbsolutePath - " + filePath.toAbsolutePath());
        System.out.println(".toAbsolutePath - " + directoryPath.toAbsolutePath());
        System.out.println("--------------------------------------------");
        System.out.println(".resolve - " + directoryPath.resolve(filePath));
        System.out.println("--------------------------------------------");
        Path anotherPath = Paths.get("C:\\Users\\38096\\Desktop\\M\\N\\Z\\test20.txt");
        System.out.println("directoryPath.relativize(anotherPath) " + directoryPath.relativize(anotherPath));
        System.out.println("--------------------------------------------");
        if(!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }
        System.out.println("Files.isReadable - " + Files.isReadable(filePath));
        System.out.println("Files.isWritable - " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable - " + Files.isExecutable(filePath));
        System.out.println("--------------------------------------------");
        Path filePath2 = Paths.get("C:\\Users\\38096\\IdeaProjects\\JavaEducation\\test15.txt");
        System.out.println("Files.isSameFile - " + Files.isSameFile(filePath, filePath2));
        System.out.println("--------------------------------------------");
        System.out.println("Files.size - " + Files.size(filePath));
        System.out.println("--------------------------------------------");
        System.out.println("Files.getAttribute - " + Files.getAttribute(filePath, "creationTime"));
        Map<String,Object> attributes =  Files.readAttributes(filePath, "*");
        System.out.println(attributes);
    }
}
