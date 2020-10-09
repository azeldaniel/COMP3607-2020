public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback();

    void proximityCallback();
}
