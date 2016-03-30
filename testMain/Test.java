package testMain;
import romaToInt.Solution;
import romaToInt.DictTree;
import romaToInt.Node;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public int parse(ArrayList<DictTree> dictTree, String str) {
		int len = dictTree.size();
		int res = 0;
		for (DictTree dt : dictTree) {
			res += dt.parseStr(str);
			
		}
		return res;
	}
	

	@org.junit.Test
	public void test() {
		// fail("Not yet implemented");
		String str;
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		
		// Solution one = new Solution();
		// int num = 0;
		// num = one.romanToInt(str);
		// System.out.println(num);
		DictTree C = Node.buildDT('C', 'D', 'M', 100);
		DictTree X = Node.buildDT('X', 'L', 'C', 10);
		DictTree I = Node.buildDT('I', 'V', 'X', 1);
		ArrayList<DictTree> dictTree = new ArrayList<>();
		dictTree.add(C);
		dictTree.add(X);
		dictTree.add(I);

		int result = parse(dictTree, str);
		System.out.println((result));
		
		
	}


}
