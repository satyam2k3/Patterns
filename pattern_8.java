package _Pattern;

public class pattern_8 {

	public static void main(String[] args) {
		int n = 5;
		int n1 = 1;
		int n2 = n;
		int row = 1;
		int cnt_str = n;
		while (row <= n && n1 <= n && n2 > 0) {
			int star = 1;
			while (star <= cnt_str) {
				if ((row == n1 && star == n1) || (row == n1 && star == n2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				star++;

			}
			System.out.println();
			row++;
			n1++;
			n2--;
		}

	}

}
//row space star
//1		0	 5
//2		1	 4
//3		2	 3
//4		3	 2
//5 	4 	 1
