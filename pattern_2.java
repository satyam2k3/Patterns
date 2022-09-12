package _Pattern;

public class pattern_2 {

	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_str=1;
		while (row < n) {
			int star = 0;
			while(star <cnt_str) {
				System.out.print("* ");
				star++;
			}
			System.out.println();
			row++;
			cnt_str++;
		}
	}

}
