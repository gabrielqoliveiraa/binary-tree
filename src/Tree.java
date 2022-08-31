public class Tree {
	Node root;
	
	Tree(int info) {
		this.root = new Node(info);
	}
	
	public Node maximum(Node root) {
		if (root.right == null) return root;
		return maximum(root.right);
	}
	
	public Node minimum(Node root) {
		if (root.left == null) return root;
		return minimum(root.left);
		
//		Node left = root;
//		while(left.left != null) {
//			left = left.left;
//		}
//		return left;
	}
	
	public Node successor(Node root) {
		if(root.right != null) {
			return minimum(root.right);
		}
		Node rootTwo = root.father;
		while(rootTwo.info < root.info) {
			root = rootTwo;
			rootTwo = rootTwo.father;
		}
		return rootTwo;
		
	}
	
	
	public void removeElement(int info, Node root) {
		Node elementWillBeRemoved = doSearch(info, root);
		if(elementWillBeRemoved.left != null && elementWillBeRemoved.right != null) {
			Node nextElement = successor(elementWillBeRemoved);
//			elementWillBeRemoved.father. = nextElement;
		} else {
			
		}
	}
	
	public void printPreOrderTree(Node root) {
        if (root == null) return;
        System.out.println(root.info);
        printPreOrderTree(root.left);
        printPreOrderTree(root.right);
    } 
	
	public void printInOrderTree(Node root) {
        if (root == null) return;
        printInOrderTree(root.left);
        System.out.println(root.info);
        printInOrderTree(root.right);
    } 
	
	public void printPosOrderTree(Node root) {
        if (root == null) return;
        printPosOrderTree(root.left);
        printPosOrderTree(root.right);
        System.out.println(root.info);
    } 
	
	public Node doSearch(int info, Node root) {
		if(info == root.info) return root;
		if(info < root.info) {
			return doSearch(info, root.left);
		} else {
			return doSearch(info, root.right);
		}	
	}
	
	
	public void insertSorted(int info, Node root) {
		Node newElement = new Node(info);
		if(info < root.info) {  
			if(root.left == null) {
				newElement.father = root;
				root.left = newElement;
				return;
			}
			insertSorted(info, root.left);
		} else {
			if(root.right == null) {
				newElement.father = root;
				root.right = newElement;
				return;
			}
			insertSorted(info, root.right);
		}		
	}
	

}	
