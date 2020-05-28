import java.util.*;
public class fc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if (Character.isLowerCase(s)) 
			System.out.println(s + "->" + Character.toUpperCase(s));
		else
			System.out.println(s + "->" + Character.toLowerCase(s));
	}

}
