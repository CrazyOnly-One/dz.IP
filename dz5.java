import java.util.Scanner;

public class dz5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        for (int i = 1; i <= 9; i++) {
            m = i * n;
            System.out.println(n + " * " + i + " = " + m);
        }
    }
}
