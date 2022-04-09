package Homework0604;

import java.util.Scanner;

public class Homework20406factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете число: ");
        int num;
        num = scanner.nextInt();
        if (num > 0) {
            int fact = 1;
            do {
                fact = fact * num;
                num--;

            } while (num > 1);
            System.out.println(fact);
        } else {
            System.out.println("Грешка");
        }

    }
}
