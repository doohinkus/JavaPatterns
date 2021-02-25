package Factory;

import SingleResponsibility.InsertionSort;
import SingleResponsibility.MergeSort;
import SingleResponsibility.Sorter;

public class AlgorithmFactory {
    public static final int INSERTION_SORT = 0;
    public static final int MERGE_SORT = 1;
    public static Sorter createSorter(int type){
        switch(type){
            case INSERTION_SORT: return new InsertionSort();
            case MERGE_SORT: return new MergeSort();
            default: return null;
        }
    }
}
