package Question1;
/**
 *
 * @author phaedramohammed Question 1: fix the code n agent that keeps track of
 *         the number of requests made for a reference to the agent using the
 *         Singleton design pattern.
 * 
 */

// Hide the constructor
// a function to access a single instance
    // This instance is created when we request the instance for the first time
    // 

public class Agent {
    private static int numRequests;
    private static Agent singletonAgent;

    private Agent() {
        numRequests = 0;
    }

    public static Agent getAgent() {
        if(singletonAgent == null)
            singletonAgent = new Agent();

        numRequests++;
        return singletonAgent;
    }

    public String toString() {
        return "C'est moi, le singleton agent pour le " + numRequests + " fois!";
    }

    public void foo(){
        // does nothing
    }
}
