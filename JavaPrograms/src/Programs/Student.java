package Programs;

public class Student {

	String name="";
	int id;
	
	public Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void displayData()
	{
		System.out.println("Student Details");
		System.out.println("Name : "+this.name+" Id : "+this.id);
	}
}
