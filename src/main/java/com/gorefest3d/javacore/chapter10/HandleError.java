package main.java.com.gorefest3d.javacore.chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a, b, c;
        Random random = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
