import java.util.*;

public class prob6 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];
		ar = new int[n];

		HashSet <Integer> hash = new HashSet <Integer>();

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
			hash.add(ar[i]);
		}

		Iterator <Integer> i = hash.iterator();

		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}

		System.out.println();

	}
}