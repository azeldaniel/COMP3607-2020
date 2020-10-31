public class HeartRateMonitor implements Observer {

    private Subject subject;

    public HeartRateMonitor(Subject subject) {
        this.subject = subject;
    }

    private String checkHeartRate(int heartRate) {
        if (heartRate <= 60)
            return "Low";
        if (heartRate >= 80)
            return "High";
        return "Normal";
    }

    public void update() {
        System.out.println("Heart Rate: " + ((Patient) subject).getHeartRate() + " beats per min is "
                + checkHeartRate(((Patient) subject).getHeartRate()));
    }
}
