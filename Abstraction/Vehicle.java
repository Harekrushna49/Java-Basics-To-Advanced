package Abstraction;

public abstract class Vehicle {
    private int Clutch;
    private int Break;
    private int Acclerator;
    private int Gear;

    public abstract void TurningOn();

    public abstract void TurningOff();

    public void InitialPickup()
    {
        if (Acclerator > 0)
        {
            System.out.println("Now car was running...");
        }
        else
        {
            System.out.println("Apply gear to run your car...");
        }
    }

    public void setClutch(int Clutch)
    {
        this.Clutch=Clutch;
    }

    public int getClutch()
    {
        return Clutch;
    }

    public void setBreak(int Break)
    {
        this.Break=Break;
    }

    public int getBreak() {
        return Break;
    }

    public void setAcclerator(int Acclerator)
    {
        this.Acclerator=Acclerator;
    }

    public int getAcclerator() {
        return Acclerator;
    }

    public void setGear(int Gear)
    {
        this.Gear=Gear;
    }

    public int getGear() {
        return Gear;
    }
}
