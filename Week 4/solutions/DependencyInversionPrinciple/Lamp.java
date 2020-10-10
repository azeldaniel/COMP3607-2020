public class Lamp implements Equipment
{
    private int color;

    @Override
    public void turnOn()
    {
        System.out.println("Lamp turned on");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Lamp turned off");
    }

    public int getColor()
    {
        return color;
    }

    public void setColor(int color)
    {
        this.color = color;
    }
}
