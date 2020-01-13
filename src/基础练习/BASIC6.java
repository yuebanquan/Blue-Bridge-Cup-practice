package 基础练习;

import java.util.Scanner;

public class BASIC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[][] = new int[num + 1][num + 1];
        a[0][0] = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
