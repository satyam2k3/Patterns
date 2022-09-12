package _Pattern;

public class pattern_21 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str1 = 1;
		int cnt_str2 = 1;
		int cnt_sp = 7;
		while (row < n) {
			int star1 = 0;
			int star2 = 0;
			int space = 0;
			while (star1 < cnt_str1) {
				System.out.print("* ");
				star1++;
			}
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			while (star2 < cnt_str2) {
				System.out.print("* ");
				star2++;
			}
			cnt_str1++;
			cnt_str2++;
			cnt_sp = cnt_sp - 2;
			System.out.println();
			row++;
		}

	}

}
