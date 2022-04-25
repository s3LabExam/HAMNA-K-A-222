import java.util.Scanner;
class Cpu
{
	int price;

    Cpu(int p)
    {
        this.price = p;
    }
    void display()
    {
        System.out.println("Price of cpu: " + this.price);
    }
    class Processor
    {
        int cores;
        String manufacture;

        Processor(int n, String m)
        {
            this.cores = n;
            this.manufacture = m;
        }

        void display()
        {
            System.out.println("No of cores in processor: " + this.cores);
            System.out.println("Name of processor Manufacture is : " + this.manufacture);
        }
    }
    static class Ram
    {
        int memory;
        String manufacture;

        Ram(int n, String m) 
        {
            this.memory = n;
            this.manufacture = m;
        }

        void display() 
        {
            System.out.println("Memory Size:" + this.memory);
            System.out.println("Name of memory manufacture is : " + this.manufacture);
        }
    }


	public static void main(String args[])
	{
		int price;
		int ncores;
		String pmanuname;
		int memory;
		String rmanuname;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the price of CPU:");
		price=scanner.nextInt();
		System.out.println("Enter the no of cores in processor:");
		ncores=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name of manufacture of processor:");
		pmanuname=scanner.nextLine();
		System.out.println("Enter the size of memeory:");
		memory=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name of manufacture of ram:");
		rmanuname=scanner.nextLine();
		
		 Cpu c= new Cpu(price);
	     Cpu.Processor iprocessor = c.new Processor(ncores,pmanuname);
	     Cpu.Ram ram = new Ram(memory,rmanuname);
	     c.display();
	     iprocessor.display();
	     ram.display();
		
		
	}
}