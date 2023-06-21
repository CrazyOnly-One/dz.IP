import java.util.Scanner;

public class dz14 {
    public static void main(String[] args) {
        boolean play = true;
        Scanner sc = new Scanner(System.in, "cp866");
        int random = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано компьетером");
        while (play){
            System.out.println("Угадайте загаданное число в промежутке от 1 до 100");
            while (true) {
                int a = sc.nextInt();
                if (a > random) {
                    System.out.println(a + " слишком много. Попробуйте еще раз!");
                }
                if (a < random) {
                    System.out.println(a + " слишком мало. Попробуйте еще раз!");
                }
                if (a == random) {
                    System.out.println(a + " соответствует загаданному числу. Вы победили!!");
                    System.out.println("Хотите сыграть заново (да/нет)?");
                    String choice = sc.next();
                    switch(choice){
                        case "да": random = 1 + (int) (Math.random() * 100);
                            System.out.println("Число загадано компьетером");
                            break;
                        case "нет": play = false;
                            break;
                    }
                    break;
                }
            }
        }
    }
}
