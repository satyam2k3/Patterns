package _Pattern;

public class pattern_7 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str = n;
		while (row < n) {
			int star = 0;
			while (star < cnt_str) {
				if (row == 0 || row == n - 1 || star == 0 || star == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				star++;
			}

			row++;
			System.out.println();
		}

	}

}
