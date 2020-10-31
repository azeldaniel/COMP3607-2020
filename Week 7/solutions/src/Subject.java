public interface Subject {
    public void notifyObservers();

    public void addObserver(Observer observer);

    public void detachObserver(Observer observer);
}
