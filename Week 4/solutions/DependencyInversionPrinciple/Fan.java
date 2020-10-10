public class Fan implements Equipment
{
    private int speed;

    @Override
    public void turnOn()
    {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Fan turned off");
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}