package ru.mirea.kovalenko.pr3;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", false, 7);
        System.out.println(s1.toString());
        System.out.println(s1.getColor());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());

        Circle c2 = new Circle("Green",false, 5);
        System.out.println(c2.getRadius());
    }
}
