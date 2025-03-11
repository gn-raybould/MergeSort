import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int fibNum = 0;
        int num2 = 1;
        Scanner lengthScanner;
        lengthScanner = new Scanner(System.in);
        System.out.print("Please choose how many Fibonacci numbers you would like to be given: ");
        int length = lengthScanner.nextInt();
        System.out.print(0);
        for (int i = 0; i < (length - 1); i++) {
            fibNum = fibNum + num2;
            System.out.print(" " + fibNum);
            num2 = fibNum - num2;
        }
        lengthScanner.close();
    }
}