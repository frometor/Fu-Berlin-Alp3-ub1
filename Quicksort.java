/**
 * Created by Erik on 13.10.2015.
 */

import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    public static long cmp = 0;
    Random rando = new Random();
    int random;
    int pivot;
    final static int b = 5;

    public void quicksorting(float[] unordered) {

        quickSort(unordered, 0, unordered.length - 1);
    }

    private void quickSort(float[] unordered, int linkeSeite, int rechteSeite) {
        if ((rechteSeite + 1 - linkeSeite) <= b) {
            // cmp++;
            insertionSort(unordered, linkeSeite, rechteSeite);
        } else {
            if (linkeSeite < rechteSeite) {
                pivot = partition(unordered, linkeSeite, rechteSeite);

                quickSort(unordered, linkeSeite, pivot - 1);
                quickSort(unordered, pivot + 1, rechteSeite);
            }
        }
    }


    private int partition(float[] unordered, int linkeSeite, int rechteSeite) {

        random = (int) (rando.nextFloat() * (rechteSeite));
        // System.out.println(random);
        float pivot = unordered[random];
        int i = linkeSeite - 1;
        float tmp = 0;
        for (int j = linkeSeite; j <= rechteSeite - 1; j++) {
            if (unordered[j] <= unordered[rechteSeite]) {
                cmp++;
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

    public static float[] insertionSort(float[] sort, int linkeSeite, int rechteSeite) {
        float tmp;
        for (int i = linkeSeite + 1; i <= rechteSeite; i++) {
            cmp++;
            tmp = sort[i];
            int j = i;
            while (j > 0 && sort[j - 1] > tmp) {
                cmp += 2;
                sort[j] = sort[j - 1];
                j--;
            }
            sort[j] = tmp;
        }
        return sort;
    }
}
