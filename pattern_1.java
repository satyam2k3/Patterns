package _Pattern;

public class pattern_1 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		while (row < n) {
			int star = 0;
			while (star < n) {
				System.out.print("* ");
				star++;
			}
			System.out.println();
			row++;
		}
	}
}