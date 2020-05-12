import java.util.*;

public class prob8 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];
		ar = new int[n];

		int sum = 0;

		for(int i=0;i<n-1;i++) {
			ar[i] = in.nextInt();
			sum += ar[i];
		}

		int ans = (n*(n+1))/2 - sum;
		System.out.println(ans);
	}
}