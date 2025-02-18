package ImplementingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader4 {
    public static void main(String[] args){
        Path path = Paths.get("Sample.txt");
        try{
            List<String> lines = Files.readAllLines(path);
            for(String line : lines){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file" +  e.getMessage());
        }
    }
}
