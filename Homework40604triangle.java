package Homework0604;

public class Homework40604triangle {
    public static void main(String[] args) {
        int size = 6;
        int i;
        int j;
        for (i = 0; i <= size - 1; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= size - 1 - i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
