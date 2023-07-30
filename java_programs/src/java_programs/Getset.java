package java_programs;
public class Getset {
	private int id;
	private String name;
	public int getid(){
		return id;
	}
	public void setid(int id) {
		this.id=id;
		
	}
	public int getname() {
		return id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String toString() {
		return "your id is "+id+" and name is "+name;
	}
	
}
class display{
	public static void main(String[] args) {
		Getset g= new Getset();
		g.setid(101);
		g.setname("arun");
		System.out.println(g);
	}
}

