package java_programs;

public class Constructors {
	int id;
	String name;
	Constructors(int id,String name){
		this.id=id;
		this.name=name;
	}
	Constructors()
	{	
	}
	void display() {
		System.out.println("Your id and ypor name is "+ id +" "+name);
	}
}
class MainClass{
	public static void main(String[] args)
	{
		Constructors c= new Constructors(1,"ram");
		Constructors d= new Constructors();
		c.display();
		d.display();
	}
}
