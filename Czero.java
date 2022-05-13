import java.util.*;

public class Czero {

    static int countTZero(int n) {
        int res = 0;

        for (int i = 5; i <= n; i = i * 5) {
            res = res + (n / i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("enter your Trailing Zero in Factorial number ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(countTZero(number));

    }
}
