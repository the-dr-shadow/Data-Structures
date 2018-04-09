public class Node {
	// Class that represents each node of a BST.

	int data; // contains the data part of the node
	Node left, right; // pointers (C/C++) /References (Java) to the left and
						// right subtrees of the node

	Node(int data) { // Constructor that created a new node with the value
						// passed as param to the constructor.
		this.data = data;
		this.left = this.right = null;
	}

	Node() { // Empty constructor that creates a new node with data as -1
		this.data = -1;
		this.left = this.right = null;
	}
}