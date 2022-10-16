package ru.job4j.calculator.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 0, 4, 2);
        double result3 = Point.distance(10, 12, 20, 24);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 0) to (4, 2) " + result2);
        System.out.println("result (10, 12) to (20, 24) " + result3);
    }
}
