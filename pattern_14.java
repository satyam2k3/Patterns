package _Pattern;

public class pattern_14 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_sp = n;
		int cnt_str = 0;
		while (row <= 2 * n - 1) {
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
			if (row < n) {
				cnt_sp--;
				cnt_str++;
			} else {
				cnt_sp++;
				cnt_str--;
			}
			System.out.println();
			row++;
		}
	}

}
//row spc star
//1		4	1
//2		3	2
//3		2	3
//4		1	4
//5		0	5
//6		1	4
//7		2	3
//8	3	2
//9	4	1