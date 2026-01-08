import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int sum = addNumbers(num1,num2);
        System.out.println(num1 + "+" + num2 + "=" + sum);

    }
    private static int addNumbers(int num1, int num2){
        while (num2 != 0){
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }
        return num1;
    }
}
