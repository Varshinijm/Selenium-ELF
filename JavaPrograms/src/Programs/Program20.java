package Programs;

public class Program20 {
	
	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		
		System.out.println("Before Swapping num1 : "+num1+" num2 : "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping num1 : "+num1+" num2 : "+num2);
		
	}
}
