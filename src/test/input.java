package test;

import java.util.Scanner;

/**
 * 输入功能测试
 */
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的名字:");
        String name = sc.nextLine();
        System.out.print("请输入您的年龄:");
        Integer age = sc.nextInt();
        System.out.print("请输入您的工资:");
        Float salary = sc.nextFloat();

        System.out.println("姓名:" + name + ", 年龄:" + age + ", 工资:" + salary);

    }
}
