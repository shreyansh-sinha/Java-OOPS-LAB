import java.util.*;

public class prob4 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j <= i)
					System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j > i)
					System.out.print("* ");
			}
			System.out.println();
		}		

	}
}