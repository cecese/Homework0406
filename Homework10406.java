package Homework0604;

import java.util.Scanner;

public class Homework10406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Въведете число: ");
   //     num = scanner.nextInt();
        while ( true) {
            num = scanner.nextInt();
            if (0 <= num && num <= 100) {
                sum = num + sum;
                if (sum > 100)
                {
            break;
        }
            System.out.println(sum);
        } }




    }
}
