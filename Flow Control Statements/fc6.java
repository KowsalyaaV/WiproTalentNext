
public class fc6 {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		String gender = args[0];
		if(gender=="female") {
			if(age>1 && age< 58) {
				System.out.println("Interest = 8.2%");
			}
			else {
				System.out.println("Interest = 9.2%");
			}
		}
		else {
			if(age>1 && age< 60) {
				System.out.println("Interest = 9.2%");
			}
			else {
				System.out.println("Interest = 8.3%");
			}
		}
	}

}
