import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Erik on 18.10.2015.
 */
public class twoZeroMillFloats {
    public static float[] twoZeroMillFloats() {
        Random twoZeroMillFloats = new Random();
        float[] array = new float[2000];
        NumberFormat nf = NumberFormat.getInstance();
        DecimalFormat df = new DecimalFormat("#,##");
         //nf.setMaximumFractionDigits(3);
        for (int i = 0; i < array.length; i++) {
            int rand = (((twoZeroMillFloats.nextInt(10))));
            float rando = (float)rand /10;
           //System.out.print(rando+", ");
//            array[i] = Double.parseDouble(df.format(rand));
            array[i] = rando;
           // System.out.print(rand);
        }
        //System.out.println(array[1000]);
        //System.out.println();
        //System.out.println(Arrays.toString(array));
        return array;
    }
}
