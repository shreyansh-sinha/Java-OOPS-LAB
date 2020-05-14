import java.util.*;

public class prob4 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int ar[];
		ar = new int[10000];

		int size = 0;

		while(true) {

			String str;
			str = in.next();

			if(str.equals("Push")) {

				int num;
				num = in.nextInt();
				ar[size] = num;
				size++;

			}

			else if(str.equals("Pop")) {

				size--;
			}

			else if(str.equals("show")) {

				for(int i=0;i<size;i++) {
					System.out.print(ar[i] + " ");
				}
				System.out.println();
			}
		}
	}

}