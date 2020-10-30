
/**
 *
 * @author phaedramohammed
 */
import java.io.*;

public class Patient {

    private int heartRate;
    private int breathingRate;
    private int kidneyOutput;

    public Patient() {

    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getBreathingRate() {
        return breathingRate;
    }

    public int getKidneyOutput() {
        return kidneyOutput;
    }

    public void hookUpMonitors() {
        synchronized (this) {
            try {

                String filename = "data/patientStats.txt";// may change based on your IDE config
                java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filename));

                String line = br.readLine();
                java.util.StringTokenizer st = null;

                while (line != null) {
                    st = new java.util.StringTokenizer(line);
                    heartRate = Integer.parseInt(st.nextToken().trim());
                    breathingRate = Integer.parseInt(st.nextToken().trim());
                    kidneyOutput = Integer.parseInt(st.nextToken().trim());

                    System.out.println("Heart Rate: " + heartRate);
                    System.out.println("Breathing Rate: " + breathingRate);
                    System.out.println("Kidney Output: " + kidneyOutput);

                    line = br.readLine();
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
    }

}
