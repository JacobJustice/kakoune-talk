public class PGSimulation
{
    public int numProducers = 1;
    public int numConsumers = 1;
    public int sizeGarage =  20;

    public static void main(String[] args) throws InterruptedException
    {
        PGSimulation pgs = new PGSimulation();
        ParkingGarage pg = new ParkingGarage(pgs.sizeGarage);
    pgs.processArgs(args);

    System.out.println("Welcome to the Parking Garage Simulator!\n\n");
        Producer[] producers = new Producer[pgs.numProducers];
        for (int i = 0; i < producers.length; i++)
        {
            producers[i] = new Producer("EntryGate#" + i, pg);
            producers[i].start();
        }

        Consumer[] consumers = new Consumer[pgs.numConsumers];
        for (int i = 0; i < consumers.length; i++)
        {
            consumers[i] = new Consumer("ExitGate#" + i, pg);
            consumers[i].start();
        }

    }

    public void processArgs(String[] args)
    {
        if (args.length % 2 == 0)
        {
            try
            {
                for (int i = 0; i < args.length; i+=2)
                {
                    int num = Integer.parseInt(args[i+1]);
                    if (args[i].equals("-s") && num >= 1)
                    {
                        sizeGarage = num;
                    }
                    else if (args[i].equals("-c") && num >= 1)
                    {
                        numConsumers = num;
                    }
                    else if (args[i].equals("-p") && num >= 1)
                    {
                        numProducers = num;
                    }
                    else
                    {
                        System.out.println("invalid args... using defaults instead");
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("invalid args... using defaults instead");
            }
        }
        else
        {
            System.out.println("invalid args... using defaults instead");
        }
    }

    public boolean add(Car c)
    {
        if (this.size() < this.capacity())
        {
            garage[size] = c;
            size++;
            return true;
        }
        else
        {
            return false;
        }
    }
}
