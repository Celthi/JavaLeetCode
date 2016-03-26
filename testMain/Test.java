package testMain;
import romaToInt.Solution;

import static org.junit.Assert.*;

import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {
		// fail("Not yet implemented");
		String str;
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		
		Solution one = new Solution();
		int num = 0;
		num = one.romanToInt(str);
		System.out.println(num);
		
		
	}


}
