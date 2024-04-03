package Programs;

public class Program45 {

	public static void main(String[] args) {
		String str="Varshini";
		String str1="JM";
		
		System.out.println("Befor Swapping");
		System.out.println("String1 : "+str);
		System.out.println("String2 : "+str1);
		str=str+str1;
		str1=str.substring(0,str.length()-str1.length());
		str=str.substring(str1.length());
		
		System.out.println("After Swapping");
		System.out.println("String1 : "+str);
		System.out.println("String2 : "+str1);
		
	}
}
