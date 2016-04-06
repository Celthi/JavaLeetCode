package LongestPalinSubstring;

public class LongestPalinSubstring {
	public String preProcess(String s) {
		String res = "^";
		for (int i = 0; i < s.length(); i++) {
			res += "#" + s.substring(i, i+1);
		}
		res += "$";
		System.out.println(res);
		return res;
	}
	public int maxPalinSubstring(String s) {
		String str = preProcess(s);
		int [] p = new int[str.length()]; /* the radix of the palin str */
		for (int i = 0; i < p.length; i++) {
			p[i] = 0;
		}
		int id = 1;
		int mx = 1;
		for (int i = 1; i < p.length - 1; i++) {
			if (mx > i) {
				p[i] = mx-i > p[2*id-i] ? p[2*id-i] : mx - i;
			}
			while (str.charAt(i-p[i]) == str.charAt(i+p[i])) {
				p[i]++;
			}
			if ((i + p[i]) > mx) {
				mx = i + p[i];
				id = i;
			}
		}
		int maxp = 0;
		int pos = 1;
		for (int i = 1; i < p.length; i++) {
			if (p[i] - 1 > maxp) {
				maxp = p[i] - 1;
				pos = (i - 1) / 2 ;
			}
		}
		
		System.out.printf("pos in %d and length is %d", pos, maxp);
		
		return 0;
	}

}
