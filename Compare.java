import java.util.Scanner;

public class Compare {
    public static String compare_int(int a, int b) {
        if (a == b) {
            return a+" = "+b;
        } else if (a > b) {
            return a+" > "+b;
        } else {
            return a+" < "+b;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.println(compare_int(a, b));
        input.close();
    }
}
