package 入门训练;

import java.util.Scanner;

public class BEGIN3 {
    public static void main(String[] args) {
        final double PI = 3.14159265358979323;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double s = Math.pow(r,2) * PI;
        System.out.printf("%.7f", s);
    }
}
