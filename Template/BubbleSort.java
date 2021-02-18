package Template;

public class BubbleSort extends Algorithm{
    private int[] numbers;

    public BubbleSort(int[] numbers){
         this.numbers = numbers;

    }
    @Override
    public void initiatlize() {
      System.out.println("Initializing Bubble Sort....");
    }

    @Override
    public void sorting() {
        System.out.println("Sorting with Bubble Sort....");
    }

    @Override
    public void printResult() {
        for(int i = 0; i < this.numbers.length; i++){
            System.out.println(numbers[i] + " > Bubble");
        }
    }
}
