import java.util.*;

public class prob2 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];

		ar = new int[n];

		int f[];
		
		f = new int[1000];

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
			f[ar[i]]++;
		}

		for(int i=0;i<n;i++) {
			if(f[ar[i]] % 2 != 0) {
				System.out.println(ar[i]);
				break;
			}
		}

	}
}