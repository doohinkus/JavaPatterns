package Template;


public class InsertionSort extends Algorithm{
    private int[] numbers;

    public InsertionSort(int[] numbers){
        this.numbers = numbers;

    }
    @Override
    public void initiatlize() {
        System.out.println("Initializing Insertion Sort....");
    }

    @Override
    public void sorting() {
        System.out.println("Sorting with Insertion Sort....");
    }

    @Override
    public void printResult() {
        for(int i = 0; i < this.numbers.length; i++){
            System.out.println(numbers[i] + " > Insertion");
        }
    }
}
