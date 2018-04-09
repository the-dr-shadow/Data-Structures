import java.util.Scanner;

// Class that shows Binary Search Tree creation, along with functionality of Deleting a node and inserting of a new node.

/* Binary tree are the trees which follow these properties :-
 * 
 * 1. There are not more than 2 child of any node i.e it should be a Binary Tree :P
 * 2. The left subtree of a node contains only nodes with keys lesser than the node�s key.
 * 3. The right subtree of a node contains only nodes with keys greater than the node�s key.
 * 4. The left subtree an the right subtree are themselves Binary Search Trees.
 * 
 */

public class BinarySearchTree {
	
	Node root; // reference to the root the tree
	static BinarySearchTree tree;


	public static void main(String[] args) {
		tree = new BinarySearchTree();
		
		String userInput;
		Scanner sc = new Scanner(System.in);
		
		boolean isValidInput;
		do {
			System.out.println("\nOptions :- Press \n"
					+ "1 - For inserting a node\n"
					+ "2 - For deleting a node\n"
					+ "3 - Printing the tree\n"
					+ "4 - Exit");
			userInput = sc.next();
			
			isValidInput = Utils.isInputValid(userInput);
			
			if(isValidInput) {
				performAction(Integer.valueOf(userInput));
			}
			//System.out.print(userInput +"  ,  "+isValidInput);
			
		} while(isValidInput);
		
	}


	private static void performAction(Integer valueOf) {
		// TODO Auto-generated method stub
		switch (valueOf) {
		case 1:
			tree.root = BSTHelper.insertANode(tree.root);
			BSTHelper.printTree(tree.root);
			break;
		case 2:
			BSTHelper.deleteANode();
			break;
		case 3:
			BSTHelper.printTree(tree.root);
			break;
		default:
			break;
		}
		
	}
}
