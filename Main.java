import java.util.Arrays;

public class Main {

    public static void sortiere(int[] unordered) {
        quickSort(unordered, 0, unordered.length - 1);
    }


    public static void quickSort(int[] unordered, int p, int r) {
        if (p < r) {
            int q = partition(unordered, p, r);
            quickSort(unordered, p, q - 1);
            quickSort(unordered, q + 1, r);

        }
    }

    private static int partition(int[] unordered, int linkeSeite, int rechteSeite) {
        System.out.println(Arrays.toString(unordered));
        int random = (int) (Math.random() * (rechteSeite));

        int pivot = unordered[random];
        int i = linkeSeite - 1;
        int tmp = 0;
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

    public static void main(String[] args) {

        int[] unordered = {13, 25, 4, 6, 12, 5, 17, 3};
        System.out.println(Arrays.toString(unordered));
        sortiere(unordered);
        System.out.println(Arrays.toString(unordered));


    }


}
