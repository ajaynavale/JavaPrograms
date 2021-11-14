import java.util.*;

class StringX
{
	public String str;
	
	public void Accept()
	{
	Scanner sobj=new Scanner(System.in);
	System.out.println("Enter your name :");
	str=sobj.nextLine();	
	}
	
	public void Display()
	{
		System.out.println("String is :"+str);
	}	
}

class Program3
{
	public static void main(String args[])
	{
		StringX str=new StringX();
		str.Accept();
		str.Display();
	}
}