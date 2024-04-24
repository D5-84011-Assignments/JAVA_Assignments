import java.util.Scanner;
public class Assignment02 {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double totalBill = 0.0;
	
	System.out.println("Welcome to the Food MEnu!");
	System.out.println("1. Dosa - Rs. 50");
	System.out.println("2. Samosa - Rs. 20");
	System.out.println("3. Wada - Rs. 15");
	System.out.println("4. Jalebi - Rs. 30");
	System.out.println("5. Dhokla - Rs. 50");
	System.out.println("6. Kachori - Rs. 30");
	System.out.println("7. Idli - Rs. 30");
	System.out.println("8. Bajia - Rs. 50");
	System.out.println("9. Manchurian - Rs. 50");
	System.out.println("10. Noodles - Rs. 70");
	System.out.println("11. Genrate Bill");
	
	while (true) {
		System.out.println("Enter your choice between (1-11):");
		int choice = scanner.nextInt();
		
		
		if(choice>= 1 && choice<=10) {
		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();
		double price = 0.0;
		switch (choice) {
		case 1:
			price = 50;
			
			break;
		case 2:
			price = 20;
			
			break;
		case 3:
			price = 15;
			
			break;
		case 4:
			price = 50;
			
			break;
		case 5:
			price = 50;
			
			break;
		case 6:
			price = 30;
			
			break;
		case 7:
			price = 30;
			
			break;
		case 8:
			price = 50;
			
			break;
		case 9:
			price = 50;
			
			break;
		case 10:
			price = 70;
			
			break;
		}
		
		totalBill += price * quantity;
		}
		else if (choice == 11) {
			break;
		}else {
			System.out.println("invalid choice. Please Enter a number between (1-11)");
			

		
		}
	}
	
	System.out.println("Total Bill: Rs. "+ totalBill);
	System.out.println("Thank You for odering");
	scanner.close();
}
}
