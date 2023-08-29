import java.util.Scanner;
class namerev{
	public static void main (String[] args) {
		String str,nstr="";
        char ch;
		Scanner aja=new Scanner(System.in);
        System.out.print("Enter string");
        str=aja.nextLine();
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i);
		nstr= ch+nstr;
	}
	System.out.println("Reversed string "+ nstr);
	aja.close();
	}
}
//with inbuild method

//public static  String reverseString(String str){
//	StringBuilder sb=new StringBuilder(str);
//	sb.reverse();
//	return sb.toString();
//}