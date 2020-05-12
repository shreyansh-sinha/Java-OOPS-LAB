import java.util.*;

public class prob7 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		double sum = 0;

		for(int i=1;i<=n;i++) {
			sum += 1.0/fact(i-1);
		}

		System.out.println(sum);
	}

	static double fact(int n) {

		if(n == 0)
			return 1.0;
		
		double ans = 1;

		for(double i=1;i<=n;i++)
			ans = ans*i;

		return ans;
	}
}