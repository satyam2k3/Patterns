package _Pattern;

public class pattern_5 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str = n;
		int cnt_sp = 0;
		while (row < n) {
			int space = 0;
			int star = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			while (star < cnt_str) {
				System.out.print("* ");
				star++;
			}

			System.out.println();
			row++;
			cnt_str--;
			cnt_sp++;
		}

	}

}
