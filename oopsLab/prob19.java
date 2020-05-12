import java.util.*;

public class prob19 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		LinkedList list = new LinkedList();

		int num;

		for(int i=0;i<n;i++) {
			num = in.nextInt();
			list.insert(num);
		}

		list.manipulate();

		list.show();
	}
}