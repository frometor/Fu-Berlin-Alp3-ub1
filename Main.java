import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


       // int[] unordered = {13, 25, 4, 6, 12, 5, 17, 3};
        Quicksort sorting = new Quicksort();
        Quicksort2 sorting2 = new Quicksort2();
        //System.out.println(Arrays.toString(unordered));

       // sorting.quicksorting(unordered);

        //System.out.println(Arrays.toString(unordered));

        //int[] input = { 23, 31, 1, 21, 36, 72};

       // System.out.println("Before sorting : " + Arrays.toString(input));
        long start = System.currentTimeMillis();
        float[] input = twoZeroMillFloats.twoZeroMillFloats();
        // sorting2.quickSort(input);
        sorting.quicksorting(input); // sort the integer array using quick sort algorithm

        long stop = System.currentTimeMillis();
        long duration = stop - start;
        System.out.println(duration);
        System.out.println("After sorting : " + Arrays.toString(input));
        // input with duplicates
       // int[] withDuplicates = { 11, 14, 16, 12, 11, 15};
       // System.out.println("Before sorting : " + Arrays.toString(withDuplicates));
        //sorting2.quickSort(withDuplicates); // sort the integer array using quick sort algorithm
        //System.out.println("After sorting : " + Arrays.toString(withDuplicates));
    }

    /**
     * public method exposed to client, sorts given array using QuickSort
     * Algorithm in Java
     * @param array
     */

    }


