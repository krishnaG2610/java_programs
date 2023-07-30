package java_programs;
public class Multilevel {
	void carName()
	{
			System.out.println("bugatti");
	}
}
class bugatti extends Multilevel{
	void speed()
	{
		System.out.println("408kmph");
	}
}
class CarModel extends bugatti{
	void model()
	{
			System.out.println("veyron");
	}
}
class vehicle {
	public static void main(String [] args)
	{
		CarModel t =new CarModel();
		t.carName();
		t.speed();
		t.model();
	}

}
