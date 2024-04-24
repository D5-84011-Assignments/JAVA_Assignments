import java.util.Scanner;

public class Assignment01 {
public static void main(String[] args) {
	double first_val;
	double second_val;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first Number:");
	if(sc.hasNextDouble()) {
		first_val = sc.nextDouble();
	}else {
		System.out.print("Error enter the double value");
		return;
	}
	
	System.out.print("Enter the second Number:");
	if(sc.hasNextDouble()) {
		second_val = sc.nextDouble();
	}else {
		System.out.print("Error enter the double value");
		return;
	}
	
	double average = (first_val + second_val)/2;
	System.out.println("Average:"+ average);
	
	

	
}
	
}
