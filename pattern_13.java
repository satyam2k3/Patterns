package _Pattern;

public class pattern_13 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int cnt_str = 1;
		while (row <= 2 * n - 1) {
			int star = 0;
			while (star < cnt_str) {
				System.out.print("* ");
				star++;
			}
			if (row <= n-1) {
				cnt_str++;
			} else {
				cnt_str--;
			}
			System.out.println();
			row++;
		}
//		while (row < n) {
//			int star = 0;
//			while (star < cnt_str) {
//				System.out.print("* ");
//				star++;
//			}
//			cnt_str++;
//			System.out.println();
//			row++;
//		}
//		int cnt_str1 = n-1;
//		while (row > 0) {
//			int star = 0;
//			while (star < cnt_str1) {
//				System.out.print("* ");
//				star++;
//			}
//			cnt_str1--;
//			System.out.println();
//			row--;
//		}

	}

}
