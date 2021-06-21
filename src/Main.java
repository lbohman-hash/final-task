import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter your first number: ");
        int num2 = scanner.nextInt();

        subMethod(num1, num2);
        multiplication(num1, num2);
    }

     static int subMethod(int num1, int num2) {
         int differens = num1 - num2;
         return differens;
    }

    static int multiplication(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }
}
