import java.util.Random;
public class Producer extends Thread
{
    Random randNumGen;
    String[] CARTYPES= {"LimeGreenVW", "MerlotToyota", "MidnightTesla", "BlueCivic", "RedRollsRoyce"};
    String name;
    ParkingGarage garage;
    public Producer(String n, ParkingGarage pg)
    {
        randNumGen = new Random();
        name = n;
        garage = pg;
    }

    public void run()
    {
        while (true)
        {
            try {
                Thread.sleep(randNumGen.nextInt(501)+200);
            } catch (InterruptedException e) {
                System.out.println("Interrupt exception");
            }
            Car car = new Car(getRandCarName());
            if (garage.add(car))
            {
                System.out.println(name + " added a " + car);
            }
            else
            {
                System.out.println(name + " tried to add a " + car + " but the garage was full");
            }
        }
    }

    public String getRandCarName()
    {
        return CARTYPES[randNumGen.nextInt(CARTYPES.length)];
    }
}
