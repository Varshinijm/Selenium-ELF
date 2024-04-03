package Programs;

public class Employee {

	String name="";
	int id;
	double sal;
	
	public Employee(String name,int id, double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	public String toString()
	{
		return "Name : "+this.name+" Id : "+this.id+" Salary : "+this.sal;
	}
	
}
