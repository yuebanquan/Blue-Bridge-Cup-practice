package 基础练习;

import java.util.Scanner;

/**
 * 字母的序号与两个坐标的差的绝对值有关。
 */
public class BASIC3 {
    public static void main(String[] args) {
        final char A = 'A';

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char out = (char) (Math.abs(i - j) + A);
                System.out.print(out);
            }
            System.out.println();
        }

    }
}
