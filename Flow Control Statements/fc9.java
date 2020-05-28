import java.util.Scanner;
public class fc9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		switch(s) {
		  case "Sample 1":
		    System.out.println("January");
		    break;
		  case "Sample 2":
			System.out.println("February");
		    break;
		  case "Sample 3":
		    System.out.println("March");
			break;
		  case "Sample 4":
			System.out.println("April");
			break;
		  case "Sample 5":
			System.out.println("May");
			break;
		  case "Sample 6":
			System.out.println("June");
			break;
		  case "Sample 7":
			System.out.println("July");
			break;
		  case "Sample 8":
			System.out.println("August");
			break;
		  case "Sample 9":		
			System.out.println("August");
			break;
		  case "Sample 10":
			System.out.println("October");
			break;
		  case "Sample 11":
			System.out.println("November");
			break;
		  case "Sample 12":
			System.out.println("December");
			break;
		  default:
		    System.out.println("Enter valid month");
		}
	}

}