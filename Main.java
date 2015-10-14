import java.util.Arrays;
public class Main {

    public static void sortiere(int[] unordered) {
        quickSort(unordered, 0, unordered.length-1);
    }


   public static void quickSort(int[] A, int p, int r) {
       if (p < r){
            int q = partition(A,p,r);
            quickSort(A,p,q-1);
            quickSort(A,q+1,r);

   }}

    private static int partition(int[] A, int p, int r) {
        System.out.println(Arrays.toString(A));
        int s=(int) (Math.random() * (r));
        System.out.println("pivot place is:"+s+" value: "+A[s]);
        int x=A[s];
        int i = p-1;
        int tmp=0;
        for (int j=p; j<=r-1;j++){
            if (A[j]<=A[r]){
              //  System.out.println("Is A[u]: "+A[u] +" >= A[r]: "+A[r] );
                i++;
                tmp=A[i];
                A[i]= A[j];
                A[j]=tmp;
            }


        }
        tmp = A[i+1];
        A[i+1]= A[r];
        A[r]=tmp;
       // System.out.println("Ordered? "+Arrays.toString(A));
        //System.out.println("pivot reordered: "+q);
        return (i+1);
    }

    public static void main(String[] args) {

        int[] unordered = {13,25,4,6,12,5,17,3};
        System.out.println(Arrays.toString(unordered));
        sortiere(unordered);
        System.out.println(Arrays.toString(unordered));


    }


}
