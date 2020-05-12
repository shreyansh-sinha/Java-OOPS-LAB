import java.util.*;

public class prob5 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		int ar[];
		ar = new int[n];

		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
		}

		insertionSort(ar, n);
	}

	static void insertionSort(int ar[], int n) {

		int i, key, j;

		for(i=1;i<n;i++) {
			key = ar[i];
			j = i-1;

			while(j >= 0 && ar[j] > key) {
				ar[j+1] = ar[j];
				j--;
			}

			ar[j+1] = key;
		}

		for(i=0;i<n;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}