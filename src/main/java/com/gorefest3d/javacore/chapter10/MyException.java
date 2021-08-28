package main.java.com.gorefest3d.javacore.chapter10;

public class MyException extends Exception{
    private int detail;

    MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
