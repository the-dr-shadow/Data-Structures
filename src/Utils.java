
public class Utils {
	static int data;
	public static boolean isInputValid(String userInput) {
		data = Integer.valueOf(userInput);
		return data == 1 || data == 2 || data ==3;
	}

	public static int isValidKey(String key) {
		// TODO Auto-generated method stub
		try {
			data =  Integer.parseInt(key);
			return data;
		} catch (NumberFormatException e) {
			return -1;
		}
	}

}
