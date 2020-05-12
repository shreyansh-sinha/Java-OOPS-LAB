import java.util.*;

public class prob10 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[][];
		ar = new int[n][n];

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j] = in.nextInt();
			}
		}

		int ans[][];
		ans = new int[n][n];

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans[i][j] = 0;
				for(int k=0;k<n;k++) {
					ans[i][j] += ar[i][k] * ar[k][j];
				}
			}
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}