import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another Number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is : "+sum);
    }
}