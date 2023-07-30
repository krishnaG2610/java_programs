package java_programs;

public class hierarachical {
	void carName()
	{
			System.out.println("lamborghini");
	}
}
class Car extends hierarachical {
	void speed()
	{
		System.out.println("320kmph");
	}
}
class Model extends hierarachical{
	void model()
	{
			System.out.println("huracan");
	}
}
class Carmain{
	public static void main(String [] args)
	{
		Model t =new Model();
		Car c= new Car();
		t.carName();
		t.model();
		c.carName();
		c.speed();
	}
}
