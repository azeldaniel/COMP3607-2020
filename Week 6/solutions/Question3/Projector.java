package Question3;

import java.util.*;

/**
 * 
 */
public class Projector implements OnOffDevice{

    /**
     * 
     */
    private boolean on;

    /**
     * Default constructor
     */
    public Projector() {
    }

    /**
     * @return
     */
    public void switchOn() {
        // TODO implement here
        on = true;
        System.out.println("Projector on");
    }

    /**
     * @return
     */
    public void switchOff() {
        // TODO implement here
        on = false;
        System.out.println("Projector off");
    }

}