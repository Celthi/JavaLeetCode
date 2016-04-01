package romaToInt;


public class Node extends DictTree {
	private char str;
	private int value;
	private Node leftChild;
	private Node rightChild;
	private Node middleChild;
	
	public Node(char str, int value) {
		this.str = str;
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	public int parseStr(String str) {
		int res = 0;
		if (str == null || str.length()== 0) {
			return 0;
		}
		if (str.charAt(0) == this.str) {
			if (str.length() > 1) {
				if (this.leftChild != null)
					res = this.leftChild.parseStr(str.substring(1));
				if (res == 0) {
					if (this.rightChild != null)
						res = this.rightChild.parseStr(str.substring(1));
				}
				if (res == 0) {
					if (this.middleChild != null)
						res = this.middleChild.parseStr(str.substring(1));
				}
				if (res == 0)
					return this.value + this.parseStr(str.substring(1));
				return res;
			} else {
				return this.value;
			}
		} else {
			return 0;
		}
	}
	public static Node buildDT(char C, char D, char M, int value) {
		/* todo: build dict tree */
		Node root = new Node(C,value);
		root.leftChild = new Node(C, 2*value);
		root.rightChild = new Node(D, 4*value);
		root.middleChild = new Node(M, 9*value);
		root.leftChild.leftChild = new Node(C, 3*value);
		
		return root;
	}
}
