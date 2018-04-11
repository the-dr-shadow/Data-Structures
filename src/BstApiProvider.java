
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

	public static Node performNodeDeletion(Node root, int data) {
		// TODO Auto-generated method stub
		
		if (root == null || (root.left == null && root.right == null)) {
			return null;
		}
		
		if(data > root.data) {
			root.right = performNodeDeletion(root.right, data);
		} else if (data < root.data) {
			root.right = performNodeDeletion(root.left, data)
		} else {
			if(root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				root.data = findInOrderSuccessorData(root.right);
				root.right = performNodeDeletion(root.right, root.data);
			}
		}
		return root;
	}

	private static int findInOrderSuccessorData(Node right) {
		// TODO Auto-generated method stub
		int min = right.data;
		while (right.left != null) {
			right = right.left;
			min = right.data;
		}
		return min;
	}

	public static boolean isValidTree(Node root, int maxValue, int minValue) {
		// TODO Auto-generated method stub
		if (root == null) {
			return true;
		}

		if (root.data > maxValue || root.data < minValue) {
			return false;
		}

		return isValidTree(root.left, root.data - 1, minValue) && isValidTree(root.right, maxValue, root.data + 1);
	}

	public static int lowestCommonAncestor(Node root, int key1, int key2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
