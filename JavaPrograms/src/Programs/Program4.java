package Programs;

public class Program4 {

	public static void main(String[] args) {
		String str1 = "genteleman";
		String str2 = "elegent man";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		str1=str1.replace(" ", "");
		str2=str2.replace(" ", "");

		int count = 0;
		int anaCount = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				char ch = str1.charAt(i);
				for (int j = 0; j < str2.length(); j++) {
					if (ch == str2.charAt(j)) {
						count++;
					}
				}
				if (count > 0) {
					anaCount++;

				}
				count = 0;
			}
			System.out.println(anaCount);
			if (anaCount == str1.length()) {
				System.out.println("Given two strings are anagrams");
			}
			else
			{
				System.out.println("Given two strings are not anagrams");
			}
		}
		else
		{
			System.out.println("Given two strings are not anagrams");
		}
	}
}
