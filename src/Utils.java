import java.util.Scanner;

public class Utils {
	static int data;

	public static boolean isInputValid(String userInput) {
		data = Integer.valueOf(userInput);
		return data <= getPropertiesSupportCount();
		;
	}

	private static int getPropertiesSupportCount() {
		// TODO Auto-generated method stub
		/*
		 * 1 -> For insertion 2-> Deletion 3-> Print TRee 4-> Searching in TRee
		 * 5 -> isValid BST tree
		 */
		return 5;
	}

	public static int isValidKey(String key) {
		// TODO Auto-generated method stub
		try {
			data = Integer.parseInt(key);
			return data;
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static int getInputAndValidate(String message) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		String key = sc.next();
		return isValidKey(key);
	}

	public static void showErrorMessage() {
		System.out.println("The key inserted is not correct. PLease select another option to be performed. \n");
	}
	
	public static void showMessageOnScreen(String message) {
		System.out.println(message);
	}
}
