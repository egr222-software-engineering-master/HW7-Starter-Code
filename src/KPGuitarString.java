import java.util.*;

/**
 * Implement your code here.
 * Change comments
 * @Author Your Name
 * @Date
 */
public class KPGuitarString implements GuitarString{
    protected Queue<Double> ringBuffer;
    public static final double ENERGY_DECAY_FACTOR = 0.996;

    /**
     * TODO: Constructor: Implement your code here
     * change comments
     */
    public KPGuitarString(double frequency){
    }

    /**
     * TODO: Constructor: Implement your code here
     * change comments
     */
    public KPGuitarString(double[] init){
    }

    /**
     * TODO: Implement your code here
     * Change comments
     */
    @Override
    public void pluck(){
    }

    /**
     * TODO: Implement your code here
     * Change comments
     */
    @Override
    public void tic(){
    }

    /**
     * TODO: Implement your code here
     * Change comments
     */
    @Override
    public double sample(){
        return -1;
    }
}
