/**
 * Created by Erik on 13.10.2015.
 */

import java.util.Arrays;


import static java.util.Arrays.sort;

public class Quicksort {
    public static void quicksorting(float[] unordered) {
        quickSort(unordered, 0, unordered.length - 1);
    }

    private static void quickSort(float[] unordered, int linkeSeite, int rechteSeite) {

        if (linkeSeite < rechteSeite) {

            int pivot = partition(unordered, linkeSeite, rechteSeite);


            quickSort(unordered, linkeSeite, pivot - 1);
            quickSort(unordered, pivot + 1, rechteSeite);

        }
    }


    private static int partition(float[] unordered, int linkeSeite, int rechteSeite) {

        int random = (int) (Math.random() * (rechteSeite));
        //System.out.println(random);
        float pivot = unordered[random];
        int i = linkeSeite - 1;
        float tmp = 0;
        for (int j = linkeSeite; j <= rechteSeite - 1; j++) {
            if (unordered[j] <= unordered[rechteSeite]) {
                i++;
                tmp = unordered[i];
                unordered[i] = unordered[j];
                unordered[j] = tmp;
            }


        }
        tmp = unordered[i + 1];
        unordered[i + 1] = unordered[rechteSeite];
        unordered[rechteSeite] = tmp;

        return (i + 1);
    }

}
