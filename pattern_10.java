package _Pattern;

public class pattern_10 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str = 2 * n - 1;
		int cnt_sp = 0;
		while (row < n) {
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
			System.out.println();
			cnt_str=cnt_str-2;
			cnt_sp++;
			row++;
		}

	}

}
//row spc str
//1		0	9
//2		1	7
//3		2	5
//4		3	3
//5		4	1