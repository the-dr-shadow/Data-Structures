import java.util.Scanner;

public class BSTHelper {

	public static Node insertANode(Node root) {
		// TODO Auto-generated method stub

		int data = Utils.getInputAndValidate("Enter the key to be inserted :-");
		if (data != -1) {
			root = BstApiProvider.performNodeInsertion(root, data);
		} else {
			Utils.showErrorMessage();
		}
		return root;
	}

	public static void deleteANode() {
		int data = Utils.getInputAndValidate(null);
	}

	public static void printTree(Node root) {
		// TODO Auto-generated method stub
		if (root != null) {
			printTree(root.left);
			System.out.println(root.data + " , ");
			printTree(root.right);
		}
	}

	public static void searchKey(Node root) {
		// TODO Auto-generated method stub
		int data = Utils.getInputAndValidate("Enter key to be searched :- ");
		if (data != -1) {
			if (BstApiProvider.searchForkey(root, data)) {
				System.out.println("Key is present in the tree");
			} else {
				System.out.println("Key not found");
			}
		} else {
			Utils.showErrorMessage();
		}
	}

}