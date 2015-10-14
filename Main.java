import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] unordered = {13, 25, 4, 6, 12, 5, 17, 3};
        Quicksort sorting = new Quicksort();
        System.out.println(Arrays.toString(unordered));

        Quicksort.quicksorting(unordered);

        System.out.println(Arrays.toString(unordered));


    }


}
