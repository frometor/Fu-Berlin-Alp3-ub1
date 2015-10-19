import java.util.Random;

/**
 * Created by Erik on 18.10.2015.
 */
public class twoZeroMillFloats {
    public static float[] twoZeroMillFloats() {
        Random twoZeroMillFloats = new Random();
        float[] array = new float[2000];
        for (int i = 0; i < array.length; i++) {
            int rand = (((twoZeroMillFloats.nextInt(10))));
            float rando = (float) rand / 10;
            //System.out.print(rando+", ");
            array[i] = rando;

        }
        return array;
    }
}
