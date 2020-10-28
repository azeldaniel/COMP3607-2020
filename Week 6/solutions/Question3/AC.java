package Question3;

import java.util.*;

/**
 * 
 */
public class AC implements OnOffDevice{

    /**
     * 
     */
    private boolean on;

    /**
     * Default constructor
     */
    public AC() {
    }

    /**
     * @return
     */
    public void switchOn() {
        // TODO implement here
        on = true;
        System.out.println("AC on");
    }

    /**
     * @return
     */
    public void switchOff() {
        // TODO implement here
        on = false;
        System.out.println("AC off");
    }

}