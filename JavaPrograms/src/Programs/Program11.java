package Programs;

public class Program11 {

	public static void main(String[] args) {
		String str="I am a traVeLLerAABBeed";
		int lowerCount = 0;
		int upperCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				lowerCount++;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				upperCount++;
			}
		}
		System.out.println("Number os lowercase character in a string : "+lowerCount);
		System.out.println("Number os uppercase character in a string : "+upperCount);
				
	}
}
