public class KidneyMonitor implements Observer {

    private Subject subject;

    public KidneyMonitor(Subject subject) {
        this.subject = subject;
    }

    private String checkKidneyOutput(int kidneyOutput) {
        if (kidneyOutput <= 10)
            return "Low";
        if (kidneyOutput >= 20)
            return "High";
        return "Normal";
    }

    public void update() {
        System.out.println("Kidney output: " + ((Patient) subject).getKidneyOutput() + " ml per min is "
                + checkKidneyOutput(((Patient) subject).getKidneyOutput()));
    }
}
