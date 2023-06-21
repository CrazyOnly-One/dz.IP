import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите слова: ");
        Scanner sc = new Scanner(System.in);
        String s;
        int c = 1;
        int otvet = 0;
        for(s = sc.next(); !s.equals("STOP"); s = sc.next()) {
            if (s.equals("CUBE")) {
                otvet = c;
            }
            c ++;
        }
        if (otvet == 0) {
            System.out.println("NO");
        } else {
            System.out.println(otvet);
        }
    }
}
