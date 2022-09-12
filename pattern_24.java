package _Pattern;

public class pattern_24 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int cnt_sp=4;
		int cnt_str=1;
		int num=1;
		while (row < n) {
			int star=0;
			int space=0;
			while(space<cnt_sp) {
				System.out.print("  ");
				space++;
			}
			while(star<cnt_str) {
				System.out.print(num+" ");
				star++;
			}
			num++;
			cnt_sp--;
			cnt_str=cnt_str+2;
			row++;
			System.out.println();
		}
	}
}
