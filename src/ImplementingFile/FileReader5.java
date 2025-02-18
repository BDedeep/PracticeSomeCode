package ImplementingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader5 {
    public static void main(String[] args) {
        Path path = Paths.get("Sample.txt");
        try{
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
