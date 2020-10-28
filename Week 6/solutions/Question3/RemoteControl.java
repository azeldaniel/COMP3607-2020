package Question3;

import java.util.*;

/**
 * 
 */
public class RemoteControl {

    private Command command;

    /**
     * Default constructor
     */
    public RemoteControl() {

    }

    /**
     * @param Command
     */
    public void setCommand(Command command) {
        // TODO implement here
        this.command = command;
    }

    /**
     * 
     */
    public void pressButton() {
        // TODO implement here
        command.execute();
    }

}