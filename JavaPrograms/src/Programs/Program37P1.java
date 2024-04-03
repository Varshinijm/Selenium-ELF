package Programs;

public class Program37P1 extends Program37 {

	public void childRun()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		
		Program37P1 obj=new Program37P1();
		obj.childRun();
		obj.run();
	}
}
