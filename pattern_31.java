package _Pattern;

public class pattern_31 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str = 5;
		while (row < n) {
			int num = 5;
			int star = 0;
			while (star < cnt_str) {
				if (row + star == n - 1) {
					System.out.print("* ");
					star++;
				} else {
					System.out.print(num + " ");
					star++;
					num--;
				}
			}
			System.out.println();
			row++;
		}

	}

}
