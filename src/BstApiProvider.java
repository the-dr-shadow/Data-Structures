
public class BstApiProvider {
	public static Node performNodeInsertion(Node root, int key) {
		// TODO Auto-generated method stub

		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left = performNodeInsertion(root.left, key);
		} else {
			root.right = performNodeInsertion(root.right, key);
		}
		return root;
	}

	public static boolean searchForkey(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data == key) {
			return true;
		} else if (root.data < key) {
			return searchForkey(root.right, key);
		} else {
			return searchForkey(root.left, key);
		}
	}
}
