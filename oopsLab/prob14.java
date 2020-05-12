import java.util.*;

public class prob14 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];
		ar = new int[1000];

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
		}

		String choice;
		choice = in.next();

		String s1 = "enqueue";
		String s2 = "dequeue";

		if(choice.equals(s1)) {

			int num;
			num = in.nextInt();

			enqueue(ar, n, num);
		
		}

		else if(choice.equals(s2)) {

			dequeue(ar, n);
		}

	}

	static void enqueue(int ar[], int n, int num) {

		ar[n] = num;
		n++;

		for(int i=0;i<n;i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();

	}

	static void dequeue(int ar[], int n) {

		for(int i=0;i<n-1;i++)
			ar[i] = ar[i+1];

		n--;
		
		for(int i=0;i<n;i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();

	}
}