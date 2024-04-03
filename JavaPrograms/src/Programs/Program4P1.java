package Programs;

import java.util.Arrays;

public class Program4P1 {

	public static void main(String[] args) {
		String str1 = "genteleman";
		String str2 = "elegent man";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		int len1 = s1.length;
		int len2 = s2.length;
		
//		for(int i=0;i<len1;i++)
//		{
//			System.out.print(s1[i]);
//		}
//		System.out.println();
//		for(int i=0;i<len1;i++)
//		{
//			System.out.print(s2[i]);
//		}

		int flag = 0;
		//System.out.println(len1 + " " + len2);

		if (len1 == len2) {
			for (int i = 0; i < s1.length; i++) {
				if (s1[i] != s2[i]) {
					flag = 1;
				}
			}
		} else {
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Given two strings are anagrams");
		} else {
			System.out.println("Given two strings are not anagrams");
		}
	}
}
