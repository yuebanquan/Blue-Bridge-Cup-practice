package 基础练习;

import java.util.Scanner;

public class BASIC4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a[] = new int[num];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;

        for(int i = 0; i < a.length; i++){
            max = max > a[i] ? max : a[i];
            min = min < a[i] ? min : a[i];
            sum += a[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
