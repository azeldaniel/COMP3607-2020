package Question3;

import java.util.*;

/**
 * 
 */
public class OnCommand implements Command {

    /**
     * 
     */
    private OnOffDevice device;

    /**
     * Default constructor
     */
    public OnCommand() {
    }

    /**
     * 
     */
    public OnCommand(OnOffDevice device) {
        // TODO implement here
        this.device = device;
    }

    /**
     * 
     */
    public void execute() {
        // TODO implement here
        device.switchOn();
    }

}