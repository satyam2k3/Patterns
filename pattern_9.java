package _Pattern;

public class pattern_9 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str = 1;
		int cnt_spc = n - 1;
		while (row < n) {
			int space = 0;
			while (space < cnt_spc) {
				System.out.print("  ");
				space++;
			}
			int star = 0;
			while (star < cnt_str) {
				System.out.print("* ");
				star++;
			}
			cnt_str = cnt_str + 2;
			cnt_spc--;
			System.out.println();
			row++;
		}
	}

}
//row space star
//1	 4	    1
//2  3		3
//3	 2		5
//4	 1		7
//5	 0		9
