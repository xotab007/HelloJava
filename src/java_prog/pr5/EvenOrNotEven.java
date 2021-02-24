package java_prog.pr5;

public class EvenOrNotEven {
    public static int recursion(double n) {
        if (n == 1) {
            return 1; }
        else if (n > 1 && n < 2) {
            return 0; }
        else {
            return recursion(n / 2); }
    }
    public static void main(String[] args) {
        double n = 32;
        if (recursion(n) == 1) { System.out.println("Even");
        } else {
            System.out.println("Not even"); }
    }
}