package romaToInt;

public class DictTree {
	private Node dictTree;
	public DictTree() {
		this.dictTree = new Node('s', 0);
		
	}
	class Node {
		private char str;
		private int value;
		private Node leftChild;
		private Node rightChild;
		
		public Node(char str, int value) {
			this.str = str;
			this.value = value;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
		
	public static DictTree buildDT() {
		/* todo: build dict tree */
		DictTree  dictTree = new DictTree();
		Node root = dictTree.new Node('C',100);
		dictTree.dictTree = root;
		root.leftChild = dictTree.new Node('C', 200);
		root.rightChild = dictTree.new Node('D', 400);
		root.leftChild.leftChild = dictTree.new Node('C', 300);
		return dictTree;
		
	}
}
