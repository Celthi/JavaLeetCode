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

		if (s.charAt(0) == 'M') {
			sum += 1000;
			if (s.length() > 1) {
				sum += this.romanToInt(s.substring(1));
			}

			return sum;
		} else if (s.charAt(0) == 'C') {
			if (s.length() == 1) {
				return 100;
			}
			if (s.length() > 0) {
				if (s.charAt(1) == 'C') {
					if (s.length() > 2 && s.charAt(2) == 'C') {
						sum += 300;
						if (s.length() > 3) {
							sum += this.romanToInt(s.substring(3));
						}
						return sum;
					} else {
						sum += 200;
						if (s.length() > 2) {
							sum += this.romanToInt(s.substring(2));
						}
						return sum;
					}
				}
				if (s.charAt(1) == 'D') {
					sum += 400;
					if (s.length() > 2) {
						sum += this.romanToInt(s.substring(2));
					}
					return sum;
				}
				if (s.charAt(1) == 'M') {
					sum += 900;
					if (s.length() > 2) {
						sum += this.romanToInt(s.substring(2));
					}
					return sum;
				}

			}
		} else if (s.charAt(0) == 'X') {
			if (s.length() == 1) {
				return 100;
			}
			if (s.length() > 0) {
				if (s.charAt(1) == 'X') {
					if (s.length() > 2 && s.charAt(2) == 'X') {
						sum += 30;
						if (s.length() > 3) {
							sum += this.romanToInt(s.substring(3));
						}
						return sum;
					} else {
						sum += 20;
						if (s.length() > 2) {
							sum += this.romanToInt(s.substring(2));
						}
						return sum;
					}
				}
				if (s.charAt(1) == 'L') {
					sum += 40;
					if (s.length() > 2) {
						sum += this.romanToInt(s.substring(2));
					}
					return sum;
				}
				if (s.charAt(1) == 'C') {
					sum += 90;
					if (s.length() > 2) {
						sum += this.romanToInt(s.substring(2));
					}
					return sum;
				}

			}

		}
		return 0;

	}

}
