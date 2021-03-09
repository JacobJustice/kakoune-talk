import java.util.Random;
public class ParkingGarage
{
    Random randNumGen;
    int size;
    Car[] garage;

    public ParkingGarage(int c)
    {
        size = 0;
        garage = new Car[c];
        randNumGen = new Random();
    }


    public Car remove()
    {
        int index = 0;
        if (size>0)
        {
            index = randNumGen.nextInt(size);
            size--;
            Car temp = garage[index];

            for (int i = index; i < garage.length-1; i++)
            {
                garage[i] = garage[i+1];
            }

            return temp;
        }
        else
        {
            return null;
        }
        
    }

    public int capacity()
    {
        return garage.length;
    }

    public int size()
    {
        return size;
    }
}
