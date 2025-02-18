package ExceptionHandlingFiles;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Reading a file"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found" +  e.getMessage());
        }
    }
}