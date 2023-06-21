import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c1 = 0;
        int c2 = 0;
        while (a != 0) {
            if (a%3 == 0) {
                c1 = c1 + 1;
            }
            if (a < 0) {
                c2 = c2 + 1;
            }
            a = sc.nextInt();
        }
        if (c1 > c2) {
            System.out.println(333);
        } 
        if (c2 > c1) {
            System.out.println("negative");
        }
        if (c1 == c2) {
            System.out.println("Equal");
        }
    }
}
