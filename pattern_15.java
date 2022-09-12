package _Pattern;

public class pattern_15 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str = n;
		int cnt_sp = 0;
		while (row < 2 * n - 1) {
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while (star < cnt_str) {
				System.out.print("* ");
				star++;
			}
			if (row < n-1) {
				cnt_str--;
				cnt_sp = cnt_sp + 2;
			} else {
				cnt_str++;
				cnt_sp = cnt_sp - 2;

			}
			System.out.println();
			row++;
		}

	}

}
