package Template;

public class Basketball extends Game{
    @Override
    public void initializeGame() {
        System.out.println("initializing basketball ...");
    }

    @Override
    public void playing() {
        System.out.println("playing basketball ...");


    }

    @Override
    public void showResults() {
        System.out.println("showing results for basketball ...");

    }
}
