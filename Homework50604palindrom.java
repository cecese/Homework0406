package Homework0604;


import java.util.Scanner;

public class Homework50604palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word: ");
        String example1;
        example1 = scanner.next();
        String reverseExample1 = "";
        int example1Lenght = example1.length();
        for ( int i = ( example1Lenght - 1); i >= 0; i--) {
            reverseExample1 = reverseExample1 + example1.charAt(i);
        }
        if (example1.toLowerCase().equals(reverseExample1.toLowerCase())) {
            System.out.println(example1 + " is a Palidrome String.");
        } else {
            System.out.println(example1 + " is not a Palidrome String.");
        }
    }
}
