package _Pattern;

public class pattern_18 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_sp = 3;
		int cnt_str = 1;
		while (row < 2 * n - 3) {
			int star = 0;
			int space = 0;
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;
			}
			while (star < cnt_str) {
				System.out.print("* ");
				star++;
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
//r	sp	str
//1	3	1
//2	2	3
//3	1	5
//4	0	7
//5	1	5
//6	2	3
//7	3	1
