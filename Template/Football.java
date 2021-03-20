package Template;

public class Football extends Game{
    @Override
    public void initializeGame() {
        System.out.println("initializing football ...");
    }

    @Override
    public void playing() {
        System.out.println("playing football ...");


    }

    @Override
    public void showResults() {
        System.out.println("showing results for football ...");

    }
}
