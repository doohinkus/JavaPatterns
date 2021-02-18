package Template;

public abstract class Algorithm {
    public abstract void initiatlize();
    public abstract void sorting();
    public abstract void printResult();

    public void sort(){
        initiatlize();
        sorting();
        printResult();
    }
}
