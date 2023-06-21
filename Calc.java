import java.util.Scanner;
import java.util.Arrays;

public class Calc {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Введите числа для калькулятора: ");
        int operand1;
        int operand2;
        char operation;
        int result;

        if (scanner.hasNextInt()) {
            operand1 = nextInt();
            operand2 = nextInt();
            operation = getOperation();
            result = calc(operand1, operand2, operation);
            System.out.println("Результат: " + result);
        } else if (scanner.hasNext()) {
            
            String RomanNum1 = getRoman();
            String RomanNum2 = getRoman();
            
            operand1 = RomanToArab(RomanNum1);
            operand2 = RomanToArab(RomanNum2);
            operation = getOperation();
            
            result = calc(operand1, operand2, operation);
            String RomanRes = ArabToRoman(result);
            System.out.println("Результат: " + RomanRes);
        }

    }

    public static int nextInt(){
        System.out.println("Введите число: ");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа ");
            scanner.next(); //рекурсия
            operand = nextInt();
        }
        return operand;
    }

    public static String getRoman(){
        System.out.println("Введите римские числа: ");
        String operand;
        String[] values = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        operand = scanner.next();
        if (Arrays.asList(values).contains(operand)) {
        } else {
            System.out.println("error");
            operand = getRoman();
        }

        return operand;
    }

    public static int RomanToArab(String operand){
        int operand1 = 0;
        switch (operand){
            case "I":
            operand1 = 1;
            break;
            case "II":
            operand1 = 2;
            break;
            case "III":
            operand1 = 3;
            break;
            case "IV":
            operand1 = 4;
            break;
            case "V":
            operand1 = 5;
            break;
            case "VI":
            operand1 = 6;
            break;
            case "VII":
            operand1 = 7;
            break;
            case "VIII":
            operand1 = 8;
            break;
            case "IX":
            operand1 = 9;
            break;
            case "X":
            operand1 = 10;
            break;
        }
        return operand1;
    }

    public static String ArabToRoman(int res) {
        String RomanRes = "";
    while (res == 100) {
        RomanRes += "C";
        res -= 100;
    }
    while (res >= 90) {
        RomanRes += "XC";
        res -= 90;
    }
    while (res >= 50) {
        RomanRes += "L";
        res -= 50;
    }
    while (res >= 40) {
        RomanRes += "XL";
        res -= 40;
    }
    while (res >= 10) {
        RomanRes += "X";
        res -= 10;
    }
    while (res >= 9) {
        RomanRes += "IX";
        res -= 9;
    }
    while (res >= 5) {
        RomanRes += "V";
        res -= 5;
    }
    while (res >= 4) {
        RomanRes += "IV";
        res -= 4;
    }
    while (res >= 1) {
        RomanRes += "I";
        res -= 1;
    }
    return RomanRes;
    }



    // ------------------------------



    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char operation;
        if (scanner.hasNextLine()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("error");
            scanner.next();
            operation = getOperation();
        }
        return operation;   
    }
    
    public static int calc(int operand1, int operand2,char operation) {
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Операция не распознана. повторите ввод ");
                result = calc(operand1, operand2, getOperation());
            
        }
        return result;
    }
}
