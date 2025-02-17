package SortigSearching;

import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        StudentSortingExample[] Students = {
                new StudentSortingExample("Deep", 85),
        new StudentSortingExample("Nani", 72),
        new StudentSortingExample("Dani", 98),
        };
        Arrays.sort(Students, Comparator.comparingInt(s -> s.marks));
        System.out.println(Arrays.toString(Students));

        }
    }
