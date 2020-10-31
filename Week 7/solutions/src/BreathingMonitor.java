public class BreathingMonitor implements Observer {

    private Subject subject;

    public BreathingMonitor(Subject subject) {
        this.subject = subject;
    }

    private String checkBreathingRate(int breathingRate) {
        if (breathingRate <= 12)
            return "Low";
        if (breathingRate >= 25)
            return "High";
        return "Normal";
    }

    public void update() {
        System.out.println("Breathing Rate: " + ((Patient) subject).getBreathingRate() + " breaths per min is "
                + checkBreathingRate(((Patient) subject).getBreathingRate()));
    }
}
