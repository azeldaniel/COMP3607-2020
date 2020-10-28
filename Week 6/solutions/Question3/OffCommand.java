package Question3;

/**
 * 
 */
public class OffCommand implements Command {

    /**
     * 
     */
    private OnOffDevice device;

    /**
     * Default constructor
     */
    public OffCommand() {
    }

    /**
     * 
     */
    public OffCommand(OnOffDevice device) {
        // TODO implement here
        this.device = device;
    }

    /**
     * 
     */
    public void execute() {
        // TODO implement here
        device.switchOff();
    }

}