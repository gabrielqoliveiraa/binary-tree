
public class Principal {
	
	public static void main(String[] args) {
		Tree tree = new Tree(14);
		tree.insertSorted(18, tree.root);
		tree.insertSorted(12, tree.root);
		tree.insertSorted(22, tree.root);
		tree.insertSorted(16, tree.root);
			
		tree.printInOrderTree(tree.root);

	}

}
