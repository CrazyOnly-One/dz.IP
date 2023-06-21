import java.util.Scanner;

public class dz13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: ");
        char c = sc.next().charAt(0);
        if ((c>= '0') && (c<= '9')) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
