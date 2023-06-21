import java.util.Scanner;

public class dz8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите число n: ");
        int n = sc.nextInt();
        System.out.println("введите числа: ");
        int a = sc.nextInt();

        int Multi = 1;
        int cnt = 0;

        while (Multi < n) {
            
            Multi = Multi * a;
            cnt = cnt + 1;
            a = sc.nextInt();
        }
        System.out.println("кол-во чисел и произведение: ");
        System.out.println(cnt);
        System.out.println(Multi);
    }
}
