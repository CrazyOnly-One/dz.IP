import java.util.Scanner;
public class dz11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int[][] arr = new int[n][];
        int summa = 0;
        int max = Integer.MIN_VALUE;
        int IndMaxSum = 0;
        int i;
        for (i=0; i<n; i++) {
            m = sc.nextInt();
            arr[i] = new int[m];
            for (int j = 0; j<m;j++) {
                arr[i][j] = sc.nextInt();
                summa += arr[i][j];
            }
            if (summa > max) {
                max = summa;
                IndMaxSum = i;
            }
            summa = 0;
        }
        System.out.println(IndMaxSum+1);
        System.out.println(max);
        i = IndMaxSum;
        int k = arr[IndMaxSum].length;
        for (int j = 0; j<k; j++) {
            System.out.print(arr[i][j]);
            System.out.print(' ');
        }
    }
}