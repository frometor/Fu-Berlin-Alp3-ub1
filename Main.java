import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Quicksort sorting = new Quicksort();
        float[] input = twoZeroMillFloats.twoZeroMillFloats();

        double start = System.currentTimeMillis();

        sorting.quicksorting(input); // sort the integer array using quick sort algorithm

        double stop = System.currentTimeMillis();
        double duration = (stop - start)/1000;
        System.out.println(duration+" Sekunden");
        System.out.println(sorting.cmp);
        //System.out.println(Arrays.toString(input));
    }
}


