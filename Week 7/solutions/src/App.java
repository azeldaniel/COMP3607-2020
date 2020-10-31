public class App {
    public static void main(String[] args) throws Exception {

        Patient p = new Patient();

        Observer heartMonitor = new HeartRateMonitor(p);
        Observer breathingMonitor = new BreathingMonitor(p);
        Observer kidneyMonitor = new KidneyMonitor(p);
        Observer doc = new Doctor(p);

        p.addObserver(heartMonitor);
        p.addObserver(breathingMonitor);
        p.addObserver(kidneyMonitor);
        p.addObserver(doc);

        p.hookUpMonitors();
    }
}
