public class Doctor implements Observer {

    private Subject subject;

    public Doctor(Subject subject) {
        this.subject = subject;
    }

    private String checkEverything(int heartRate, int breathingRate, int kidneyOutput) {
        if (heartRate <= 60 || breathingRate <= 12 || kidneyOutput <= 10)
            return "One or more vitals too low";
        if (heartRate >= 80 || breathingRate >= 25 || kidneyOutput >= 20)
            return "One or more vitals too high";
        return "You're in perfect health";
    }

    public void update() {
        System.out.println("Doctor says: " + checkEverything(((Patient) subject).getHeartRate(),
                ((Patient) subject).getBreathingRate(), ((Patient) subject).getKidneyOutput()));
    }
}
