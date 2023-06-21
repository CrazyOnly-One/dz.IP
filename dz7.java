import java.util.Scanner;

public class dz7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите число n: ");
        int n = sc.nextInt();
        System.out.println("введите число x: ");
        int x = sc.nextInt();

        int Sum = x;

        while (Sum < n) {
            Sum = Sum + x;
        }
        System.out.println("сумма");
        System.out.println(Sum);
    }
}
