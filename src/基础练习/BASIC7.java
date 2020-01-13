package 基础练习;

public class BASIC7 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int num = i;
            int b = num / 100;
            num %= 100;
            int s = num / 10;
            int g = num % 10;

            if (Math.pow(b, 3) + Math.pow(s, 3) + Math.pow(g, 3) == i) {
                System.out.println(i);
            }
        }
    }
}
