import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0) {
            int b = a%2;
            System.out.print(b);
            a = a/2;
        }
    }
}
