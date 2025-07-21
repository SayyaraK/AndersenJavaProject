import java.util.Scanner;

class CheckSum {
    boolean isSumInRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1 + num2;
        return (sum >= 10 && sum <= 20);
    }
}