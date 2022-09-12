package _Pattern;

public class pattern_20 {

	public static void main(String[] args) {
		int n = 6;
		int row = 0;
		int cnt_sp = n-2;
		int cnt_str = 1;
		while (row < 2 * n - 3) {
			int star = 0;
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			while (star < cnt_str) {
				if (star == cnt_str - 1 || star == 0||(row==4&&star==4)) {
					System.out.print("* ");
					star++;
				} else {
					System.out.print("  ");
					star++;
				}

			}
			if (row < n / 2 + 1) {
				cnt_sp--;
				cnt_str = cnt_str + 2;
			} else {
				cnt_sp++;
				cnt_str = cnt_str - 2;

			}
			System.out.println();
			row++;
		}
	}
}