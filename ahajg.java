package _Pattern;

public class ahajg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int cnt_st = n;
		while (row <= n) {
			int star = 0;
			while (star < cnt_st) {
//			if(row==1||row==n||star==0||star==n-1) {
				if (row == star + 1 || row + star == n) {

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
