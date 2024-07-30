package strings;

import java.util.Scanner;
class StrReverse {
	public static void main (String[] args) {
		String str,reversed="";
        char ch;
		Scanner aja=new Scanner(System.in);
        System.out.print("Enter string");
        str=aja.nextLine();
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i);
		reversed= ch+reversed;
	}
	System.out.println("Reversed string "+ reversed);
	aja.close();
	}
}
//with inbuild method

//public static  String reverseString(String str){
//	StringBuilder sb=new StringBuilder(str);
//	sb.reverse();
//	return sb.toString();
//}