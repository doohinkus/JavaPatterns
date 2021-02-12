package Strategy;

public class Add implements Strategy{

    @Override
    public void operation(int a, int b) {
        int result = a + b;
        System.out.println("The sum of " + a + " + " + b + " is " + result);
    }
}
