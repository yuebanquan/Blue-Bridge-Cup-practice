package 基础练习;

import java.util.Scanner;

public class BASIC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 10000; i <= 99999; i++) {
            int num = i;
            int w = num / 10000;
            num %= 10000;
            int q = num / 1000;
            num %= 1000;
            int b = num / 100;
            num %= 100;
            int s = num / 10;
            int g = num % 10;

            int sum = w + q + b + s + g;

            if (w == g && q == s && sum == input) {
                System.out.println(i);
            }
        }
        for (int i = 100000; i <= 999999; i++) {
            int num = i;
            int sw = num / 100000;
            num %= 100000;
            int w = num / 10000;
            num %= 10000;
            int q = num / 1000;
            num %= 1000;
            int b = num / 100;
            num %= 100;
            int s = num / 10;
            int g = num % 10;

            int sum = sw + w + q + b + s + g;

            if (sw == g && w == s && q == b && sum == input) {
                System.out.println(i);
            }
        }

    }
}
