package java_programs;
public class SingleInheritance {
	void engineCapacity()
	{
			System.out.println("5.0L");
	}
}
class cars extends SingleInheritance{
	void speed()
	{
		System.out.println("400kmph");
	}
}
class Inherit{
	public static void main(String [] args)
	{
		cars n=new cars();
		n.speed();
		n.engineCapacity();	
	}
}
