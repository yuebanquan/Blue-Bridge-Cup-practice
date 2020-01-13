package 基础练习;

import java.util.Scanner;

public class BASIC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int find = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if(find == a[i]){
                System.out.println(i+1);
                break;
            }
            if(i == a.length - 1){
                System.out.println(-1);
            }
        }
    }
}
