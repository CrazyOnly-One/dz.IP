import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        int c = 0;
        while (a != 0) {
            if (a > max) {
                max = a;
                c = 0;
            }
            if (a == max) {
                c +=1;
            }
            a = sc.nextInt();
        }
        System.out.println(c);
    }
}
