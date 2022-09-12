package _Pattern;

public class pattern_17 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_st1 = 3;
		int cnt_st2 = 3;
		int cnt_sp = 1;
		while (row < 2 * n - 3) {
			int star1 = 0;
			int space = 0;
			int star2 = 0;
			while (star1 < cnt_st1) {
				System.out.print("* ");
				star1++;
			}
			while (space < cnt_sp) {
				System.out.print("  ");
				space++;

			}
			while (star2 < cnt_st2) {
				System.out.print("* ");
				star2++;

			}
			if (row < n / 2 + 1) {
				cnt_st1--;
				cnt_st2--;
				cnt_sp = cnt_sp + 2;

			} else {
				cnt_st1++;
				cnt_st2++;
				cnt_sp = cnt_sp - 2;

			}
			System.out.println();
			row++;
		}

	}

}
//R	S1	sp	s2
//1	3	1	3
//2	2	3	2
//3	1	5	1
//4	0	7	0
//5	1	5	1
//6	2	3	2
//7	3	1	3
