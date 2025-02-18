package ImplementingFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File("Sample.txt"));
            int ch;
            while((ch = reader.read()) != -1){
                System.out.println((char)ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file" +  e.getMessage());;
        }
    }
}
