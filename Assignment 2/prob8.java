import java.util.*;

public class prob8 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int t;
		t = in.nextInt();

		while(t-- > 0) {

			int n;
			n = in.nextInt();

			int ar[];
			ar = new int[n];

			for(int i=0;i<n;i++)
				ar[i] = in.nextInt();

			int mx = Integer.MIN_VALUE, end = 0;

			for(int i=0;i<n;i++) {

				end = end + ar[i];
				if(mx < end)
					mx = end;
				if(end < 0)
					end = 0;
			}

			System.out.println(mx);
		}
	}
}