package 基础练习;

import java.util.Scanner;

public class BASIC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
