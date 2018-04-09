import java.util.Scanner;

public class BSTHelper {
	
	public static Node insertANode(Node root) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to be inserted :-");
		String key = sc.next();
		int data = Utils.isValidKey(key);
		if(data != -1) {
			 root = performNodeInsertion(root,data);
		} else {
			showErrorMessage();
		}
		return root;
	}

	private static Node performNodeInsertion(Node root,int key) {
		// TODO Auto-generated method stub
		
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left =  performNodeInsertion(root.left, key);
		} else {
			root.right = performNodeInsertion(root.right, key);
		}
		return root;
	}

	public static void deleteANode() {
		// TODO Auto-generated method stub
		
	}

	public static void printTree(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			System.out.println("Node is null");
			return ;
		}
		
		printTree(root.left);
		System.out.println(root.data+" , ");
		printTree(root.right);
	}

	private static void showErrorMessage() {
		System.out.println("The key inserted is not correct. PLease select another option to be performed. \n");
	}

}