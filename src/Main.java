import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter your first number: ");
        int num2 = scanner.nextInt();

        System.out.println(divMethod(num1, num2));

    }

    static int divMethod(int num1, int num2) {
        int divResult = num1/num2;
        return divResult;
    }
}
