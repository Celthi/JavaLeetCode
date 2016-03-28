package romaToInt;

public class DictTree {
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
		
	public void buildDT() {
		/* todo: build dict tree */
		System.out.println("Method of inner class");
	}
}
