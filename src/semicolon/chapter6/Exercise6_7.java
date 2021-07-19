package semicolon.chapter6;
/*
What is the value of all after each of the following statements is executed?
a) a= Math.abs(7.5);
b) b= Math.floor(7.5);
c) c = Math.abs(0.0);
d) d = Math.ceil(0.0);
e) e = Math.abs(-6.4);
f) f = Math.ceil(-6.4);
g) g = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
 */
public class Exercise6_7 {
    public static void main(String[] args) {
        double a = Math.abs(7.5);
        double b = Math.floor(7.5);
        double c = Math.abs(0.0);
        double d = Math.ceil(0.0);
        double e = Math.abs(-6.4);
        double f = Math.ceil(-6.4);
        double g = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));

        System.out.println("Value of a is :" + a);
        System.out.println("Value of b is :" + b);
        System.out.println("Value of c is :" + c);
        System.out.println("Value of d is :" + d);
        System.out.println("Value of e is :" + e);
        System.out.println("Value of f is :" + f);
        System.out.println("Value of g is :" + g);
    }
}
