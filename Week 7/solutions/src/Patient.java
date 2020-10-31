
/**
 *
 * @author phaedramohammed
 */
import java.io.*;

import sun.jvm.hotspot.debugger.ThreadAccess;

public class Patient implements Subject {

    private int heartRate;
    private int breathingRate;
    private int kidneyOutput;
    private java.util.ArrayList<Observer> monitors;

    public Patient() {
        monitors = new java.util.ArrayList<>();
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

                String filename = "Week 7/data/patientStats.txt";// may change based on your IDE config
                java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filename));

                String line = br.readLine();
                java.util.StringTokenizer st = null;

                while (line != null) {
                    st = new java.util.StringTokenizer(line);
                    heartRate = Integer.parseInt(st.nextToken().trim());
                    breathingRate = Integer.parseInt(st.nextToken().trim());
                    kidneyOutput = Integer.parseInt(st.nextToken().trim());
                    notifyObservers();
                    Thread.sleep(1000);

                    // System.out.println("Heart Rate: " + heartRate);
                    // System.out.println("Breathing Rate: " + breathingRate);
                    // System.out.println("Kidney Output: " + kidneyOutput);

                    line = br.readLine();
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
    }

    public void notifyObservers() {
        for (Observer observer : monitors)
            observer.update();
    }

    public void addObserver(Observer observer) {
        monitors.add(observer);
    }

    public void detachObserver(Observer observer) {
        monitors.remove(observer);
    }
}
