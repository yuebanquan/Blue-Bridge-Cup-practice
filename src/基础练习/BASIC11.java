package 基础练习;

import java.util.Scanner;

public class BASIC11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Long output = Long.valueOf(input, 16);
        System.out.println(output);
    }
}
