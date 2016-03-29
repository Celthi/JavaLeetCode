package romaToInt;


public class Node extends DictTree {
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
	public int parseStr(String str) {
		int res = 0;
		if (str == null || str.length()== 0) {
			return 0;
		}
		if (str.charAt(0) == this.str) {
			if (str.length() > 1) {
				res = this.leftChild.parseStr(str.substring(1));
				if (res == 0) {
					res = this.rightChild.parseStr(str.substring(1));
				}
				}
			if (res != 0) {
				return res;
			} else {
				return this.value;
			}

		}
		
		return res;
	}
	public static Node buildDT() {
		/* todo: build dict tree */
		Node root = new Node('C',100);
		root.leftChild = new Node('C', 200);
		root.rightChild = new Node('D', 400);
		root.leftChild.leftChild = new Node('C', 300);
		return root;
	}
}
