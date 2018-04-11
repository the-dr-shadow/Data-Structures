
public class Resources {

	// TO-DO
	// Static constants -> change them to ints
	public static final String INSERT_KEY = "insert_key";
	public static final String DELETE_KEY = "delete_key";
	public static final String INVALID_INPUT = "invalid_input";
	public static final String SEARCH_KEY = "search_key";
	public static final String LOWEST_ANCESTOR_NODES = "lowest_ancestor_nodes";
	public static final String VALID_BST = "valid_bst";
	public static final String INVALID_BST = "invalid_bst";
	public static final String KEY_PRESENT_IN_TREE = "key_present";
	public static final String KEY_NOT_PRESENT_IN_TREE = "key_not_present";
	public static final String COMMON_ANCESTOR_FOUND = "common_ancestor";
	public static final String COMMON_ANCESTOR_NOT_FOUND = "no_common_ancestor";

	public static String getString(String option) {
		String str;
		switch (option) {
		case INVALID_INPUT:
			str = "The key inserted is not correct. PLease select another option to be performed. \n";
			break;
		case INSERT_KEY:
			str = "Enter the key to be inserted :-";
			break;
		case DELETE_KEY:
			str = "Enter node to be deleted :-";
			break;
		case SEARCH_KEY:
			str = "Enter key to be searched :- ";
			break;
		case LOWEST_ANCESTOR_NODES:
			str = "Enter the keys of which lowest common ancestor is required";
			break;
		case VALID_BST:
			str = "This is a valid BST";
			break;
		case INVALID_BST:
			str = "Not a valid BST";
			break;
		case KEY_PRESENT_IN_TREE:
			str = "Key is present in the tree";
			break;
		case KEY_NOT_PRESENT_IN_TREE:
			str = "Key not found";
			break;
		case COMMON_ANCESTOR_FOUND:
			str = "Common ancestor is :- ";
			break;
		case COMMON_ANCESTOR_NOT_FOUND:
			str = "No Common Ancestor Founc.";
			break;
		default:
			str = null;
		}
		return str;

	}
	
	public static String getValidTreeString(boolean isValid) {
		return isValid ? getString(VALID_BST) : getString(INVALID_BST);
	}

	public static String getKeyPresentInTreeString(boolean isPresent) {
		return isPresent ? getString(KEY_PRESENT_IN_TREE) : getString(KEY_NOT_PRESENT_IN_TREE);
	}

	public static String getCommonAncestorString(int ancestor) {
		// TODO Auto-generated method stub
		return ancestor != -1 ? getString(COMMON_ANCESTOR_FOUND) + String.valueOf(ancestor)
				: getString(COMMON_ANCESTOR_NOT_FOUND);
	}
}
