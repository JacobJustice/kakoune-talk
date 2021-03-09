## Kakoune Fundamental Concepts

# As compared to vim

In vim there are *objects* and *verbs*

 - The Linux philosophy is 'Laugh in the face of danger'.


(This is inside of a block)

{
	"Hello world";
	
	[ test test test ]
	
	( Laugh in the face of danger )
}


# Navigation

**Goto**

Find the desired function getDescription()

``
public Car(String d)
{
    description = d;
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


public String getDescription()
{
    return description;
}

public String toString()
{
    return description;
}
``

# Selection

public static void main(String[] args)
{
	System.out.println('This is inside of a block');
	
    System.out.println('I'm going to make a statement:');
	
	System.out.println('...');
}

# Alignment

  String firstName;
         String middleName;
 String lastName;
    int workID;
   managerEmployee manager;
     Project currentProject;
     
# Buffers

Check out this file: ./file.txt
