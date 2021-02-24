package java_prog.pr1.Circle;

public class DemoCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle (4.5, "red");
        System.out.println(c1);
        c1.setColor("green");
        c1.setRadius(78.9);
        System.out.println(c1);
    }
}
