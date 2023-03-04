package org.campus02;

public class DivideByZero {


    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            System.out.println(divide(a, b));
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ich räume am Ende auf.");
        }

        System.out.println("Ausserhalb Try");
    }

    public static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Divide by zero not possible");
        }
        return a / b;
    }
}
