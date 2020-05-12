import java.util.*;

public class prob3 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];
		ar = new int[n];

		int f[];
		f = new int[1000];

		HashSet <Integer> hash = new HashSet <Integer>();

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
			hash.add(ar[i]);
			f[ar[i]]++;
		}

		Iterator <Integer> i = hash.iterator();

		int c, count = 0;

		while(i.hasNext()) {
			c = i.next();
			// System.out.println(c);
			if(f[c] < 2)
				count += f[c];
			else
				count += 2;
		}

		System.out.println(count);


	}
}