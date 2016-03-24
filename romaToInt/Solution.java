package romaToInt;

public class Solution {
	private int num;
	public Solution() {
		num = 0;
	}
	public int romanToInt(String s) {
		int sum = 0;
		
		if (s.length() == 0) {
			return 0;
		}
		if (s.length() == 4){
		if (s.charAt(0) == 'M') {
			sum += 1000;
			sum += this.romanToInt(s.substring(1));
			return sum;
		} else {
			if (s.charAt(0) == 'C') {
				if (s.charAt(1) == 'C') {
					if (s.charAt(2) == 'C') {
						sum += 300;
						sum += this.romanToInt(s.substring(3));
						return sum;
					} else {
						sum += 200;
						sum += this.romanToInt(s.substring(2));
						return sum;
					}
				} else {
					if (s.charAt(1) == 'D') {
						sum += 400;
						return (sum + this.romanToInt(s.substring(2)));
					}
					if (s.charAt(1) == 'M') {
						sum += 900;
						return (sum + this.romanToInt(s.substring(2)));
					}
					return (100 + this.romanToInt(s.substring(1)));
					
				}
				
			}// else if (s.charAt(0) == 'X') {
				//if (s)
				
			//}
		}
		}
	}

}
