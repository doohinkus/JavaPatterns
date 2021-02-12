package Strategy;

public class Subtract implements Strategy{

    @Override
    public void operation(int a, int b) {
        int result = a - b;
        System.out.println("The difference of " + a + " and " + b + " is " + result);
    }
}
