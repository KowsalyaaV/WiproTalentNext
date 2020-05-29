package string1;

public class str2 {
	public static void main(String[] args) {
		String str1 = "Mark";
		String str2 = "Kate";
		int n = str2.length();
		String str3 = "";
		
		str2 = str2.substring(1,n);
		System.out.println((str1+str2).toLowerCase());
		}
}
