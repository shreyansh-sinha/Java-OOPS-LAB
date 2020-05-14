import java.util.*;

public class prob5 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		Queue <Integer> q = new LinkedList<>();

		int num;

		for(int i=0;i<n;i++) {
			num = in.nextInt();
			q.add(num);
		}	

		Queue <Integer> newq = new LinkedList<>();

		int c = n;

		while(c >= 1) {

			int cur = 1;

			while(cur != c) {

				int top = q.remove();
				// System.out.println(top);
				q.add(top);
				cur++;
			}

			int head = q.remove();
			newq.add(head);

			c--;

			// System.out.println(newq);
		}		

		System.out.println(newq);

	}
}