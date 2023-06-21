import java.util.Scanner;

public class dz12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        System.out.println("Введите матрицу: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                int k = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = k;
            }
        }
        System.out.println("Измененная матрица: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");                
            }
            System.out.println(" ");
        }
    }
}
