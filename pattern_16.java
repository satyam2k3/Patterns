package _Pattern;

public class pattern_16 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_sp = n;
		int cnt_str = n;

		while (row < 2 * n - 1) {
			int space = 1;
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
				cnt_sp--;
				cnt_str--;
			} else {
				cnt_sp++;
				cnt_str++;
			}

			System.out.println();
			row++;
		}

	}

}
