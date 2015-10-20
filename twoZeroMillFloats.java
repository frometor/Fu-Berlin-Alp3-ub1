import java.util.Random;

/**
 * Created by Erik on 18.10.2015.
 */
public class twoZeroMillFloats {
    public static float[] twoZeroMillFloats() {
        Random twoZeroMillFloats = new Random();
        float[] array = new float[20000000];
        for (int i = 0; i < array.length; i++) {
            float rand = (((twoZeroMillFloats.nextFloat())));
            float rando = (float) rand;

            array[i] = rando;
        }
        return array;
    }
}
