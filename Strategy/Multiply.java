package Strategy;

public class Multiply implements Strategy{
    @Override
    public void operation(int a, int b) {
        int result = a * b;
        System.out.println("The product of " + a + " * " + b + " is " + result);
    }
}
