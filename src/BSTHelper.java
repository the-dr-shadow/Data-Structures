import java.util.Scanner;

public class BSTHelper {

	public static Node insertANode(Node root) {
		// TODO Auto-generated method stub

		int data = Utils.getInput(Resources.getString(Resources.INSERT_KEY));
		if (data != -1) {
			root = BstApiProvider.performNodeInsertion(root, data);
		} else {
			Utils.showErrorMessage();
		}
		return root;
	}

	public static void deleteANode(Node root) {
		int data = Utils.getInput(Resources.getString(Resources.DELETE_KEY));
		if (data != -1) {
			root = BstApiProvider.performNodeDeletion(root, data);
		} else {
			Utils.showErrorMessage();
		}
	}

	public static void printTree(Node root) {
		// TODO Auto-generated method stub
		if (root != null) {
			printTree(root.left);
			Utils.showMessageOnScreen(root.data + " , ");
			printTree(root.right);
		}
	}

	public static void searchKey(Node root) {
		// TODO Auto-generated method stub
		int data = Utils.getInput(Resources.getString(Resources.SEARCH_KEY));
		if (data != -1) {
			boolean isPresent = BstApiProvider.searchForkey(root, data);
			Utils.showMessageOnScreen(Resources.getKeyPresentInTreeString(isPresent));
		} else {
			Utils.showErrorMessage();
		}
	}

	public static void isValidBST(Node root) {
		// TODO Auto-generated method stub
		boolean isValidTree = BstApiProvider.isValidTree(root, Integer.MAX_VALUE, Integer.MIN_VALUE);

		Utils.showMessageOnScreen(Resources.getValidTreeString(isValidTree));
	}

	public static void findLowestCommonAncestor(Node root) {
		// TODO Auto-generated method stub
		Utils.showMessageOnScreen(Resources.getString(Resources.LOWEST_ANCESTOR_NODES));
		int key1 = Utils.getInput("");
		int key2 = Utils.getInput("");
		int ancestor = BstApiProvider.lowestCommonAncestor(root,key1,key2);
		Utils.showMessageOnScreen(Resources.getCommonAncestorString(ancestor));
	}

}