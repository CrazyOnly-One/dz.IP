import java.util.Scanner;

public class dz6 {
    public static void main(String[] args) throws Exception {
        System.out.println("введите числа: ");
        Scanner sc = new Scanner(System.in);
        int Sum = 0;
        int a = sc.nextInt();
    
        while (a != 0) {
            Sum = Sum + a;
            a = sc.nextInt();
        }
        System.out.println("сумма");
        System.out.println(Sum);
    }
}
