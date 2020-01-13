package 入门训练;

import java.util.Scanner;

/**
 * 要计算只包含加法、减法和乘法的整数表达式除以正整数n的余数，可以在每步计算之后对n取余，结果不变.
 */
public class BEGIN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[1000001];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= num; i++) {
            a[i] = (a[i - 1] + a[i - 2]) % 10007;
        }
        System.out.println(a[num]);
    }
}

///**
// * 原始算法
// * 会出现java.lang.StackOverflowError,调用栈太深导致栈溢出.
// */
//public class BEGIN4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int res = f(num) % 10007;
//        System.out.println(res);
//
//
//    }
//
//    public static int f(int num) {
//        if (num == 1 || num == 2) {
//            return 1;
//        } else {
//            return f(num - 1) + f(num - 2);
//        }
//    }
//}