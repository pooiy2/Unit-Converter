import java.util.Scanner;

public class UnitConverter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while (running) {
			//do nothing
			System.out.println("Please select an option:\n"
					+ "1. Cups to Teaspoons\n"
					+ "2. Miles to Kilometers\n"
					+ "3. US Gallons to Imperial Gallons\n"
					+ "4. Quit");
			int option = Integer.valueOf(scanner.nextLine());
			System.out.println("Enter a value.");
			int value = Integer.valueOf(scanner.nextLine());
			switch (option) {
			case 1:
				System.out.println(value + " Cups is " + value * 48 + " Teaspoons");
				break;
			case 2:
				System.out.println(value + " Miles is " + value * 1.609 + " Kilometers");
				break;
			case 3:
				System.out.println(value + " US Gallons is " + value * 48 + " Imperial Gallons");
				break;
			case 4:
				running = false;
				break;
			}
		}
	}
}