package 基础练习;

public class BASIC8 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int num = i;
            int q = num / 1000;
            num %= 1000;
            int b = num / 100;
            num %= 100;
            int s = num / 10;
            int g = num % 10;

            if (q == g && s == b) {
                System.out.println(i);
            }
        }
    }
}
