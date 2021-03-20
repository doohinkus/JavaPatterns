package Template;

public abstract class Game {
    public abstract void initializeGame();
    public abstract void playing();
    public abstract void showResults();
    final public void playGame(){
        initializeGame();
        playing();
        showResults();
    }
}
