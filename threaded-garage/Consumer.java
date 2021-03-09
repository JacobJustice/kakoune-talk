import java.util.Random;
public class Consumer extends Thread
{
    String name;
    Random randNumGen;
    ParkingGarage garage;

    public Consumer(String n, ParkingGarage pg)
    {
        randNumGen = new Random();
        name = n;
        garage = pg;
    }

    public void run()
    {
        Car car;
        while (true)
        {
            try {
                Thread.sleep(randNumGen.nextInt(601)+100);
                //Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Interrupt exception");
            }
            car = garage.remove();
            if (car != null)
            {
                System.out.println(name + " removed a " + car);
            }
            else
            {
                System.out.println(name + " found garage empty");
            }
        }
    }
}
