import java.util.*;

public class prob1 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];

		ar = new int[n];

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
		}

		int sum;
		sum = in.nextInt();

		int flag = 0;

		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i] + ar[j] == sum) {
					System.out.println(ar[i] + "," + ar[j]);
					flag = 1;
				}
			}
		}

		if(flag == 0)
			System.out.println("Not found");
	}
}