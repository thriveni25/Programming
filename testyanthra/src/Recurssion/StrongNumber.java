package Recurssion;

public class StrongNumber {

    public static int factorial(int num) {
        if (num <=1)
            return 1;
        else
            return (num * factorial(num - 1));
    }

    public static boolean StrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while(num > 0) {
            int rem = num % 10;
            sum += factorial(rem);
            num = num / 10;
        }

        if (sum == temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int num =145;

        if (StrongNumber(num))
            System.out.println("Strong Number");
        else
            System.out.println("not a Strong Number");
    }
}