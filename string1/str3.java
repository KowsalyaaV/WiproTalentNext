package string1;

public class str3 {
	public static void main(String[] args) {
		String s1 = "Wipro";
		int n = s1.length();

		s1 = s1.substring(0, 2);
		for (int i = 0; i < n; i++) {
			System.out.print(s1);
		}
	}

}
