package DSA_Assignments;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int m =n;
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum = (int)(sum + Math.pow(r, 3));
            n = n / 10;
        }

        if (sum == m) {
            System.out.println("It's an armstrong number ");
        } else System.out.println("It's not armstrong number");
    }
    }
