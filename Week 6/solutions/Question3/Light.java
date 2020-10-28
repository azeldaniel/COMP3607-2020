package Question3;

import java.util.*;

/**
 * 
 */
public class Light implements OnOffDevice{

    /**
     * 
     */
    private boolean on;

    /**
     * Default constructor
     */
    public Light() {
    }

    /**
     * @return
     */
    public void switchOn() {
        // TODO implement here
        on = true;
        System.out.println("lights on");
    }

    /**
     * @return
     */
    public void switchOff() {
        // TODO implement here
        on = false;
        System.out.println("lights off");
    }

}