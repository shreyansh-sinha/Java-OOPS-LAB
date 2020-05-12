import java.util.*;

public class prob9 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];
		ar = new int[n];

		int sum = 0;

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
			sum += ar[i];
		}

		if(sum%3 == 0) {

			int sum1 = 0;

			for(int i=0;i<n;i++) {
				if(sum1 + ar[i] == sum/3) {
					System.out.print(ar[i]);
					sum1 = 0;
					System.out.println();
				}
				else {
					System.out.print(ar[i] + " ");
					sum1 += ar[i];
				}
			}
		}
		else {
			System.out.println("Not possible");
		}
	}
}