import java.util.*;

class Marvellous
{
	public void Display(String Data)
	{
		System.out.println("Welcome :"+Data);
	}
	
}
class Program2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		String str;
		
		System.out.println("Enter your name :");
		str=sobj.nextLine();
		
		//System.out.println("Helllo :"+str);
		
		Marvellous mobj=new Marvellous();
		mobj.Display(str);
		
	}
}