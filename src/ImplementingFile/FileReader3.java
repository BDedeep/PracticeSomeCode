package ImplementingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3 {
    public static void main(String[] args) {
        try{
            Scanner scanner =new Scanner(new File("Sample.txt"));
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Error reading file" +  e.getMessage());
        }
    }
}
