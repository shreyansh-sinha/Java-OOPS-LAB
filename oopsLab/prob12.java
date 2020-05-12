import java.util.*;
import java.util.Stack;

public class prob12 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n;
		n = in.nextInt();

		Stack<Integer> st = new Stack<Integer>();

		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			st.push(x);
		}

		while(!st.empty()) {

			int mn = 100000;

			Stack <Integer> newStack = (Stack <Integer>)st.clone();

			while(!newStack.empty()) {

				int top = newStack.peek();
				if(top < mn)
					mn = top;
				newStack.pop();
			
			}

			System.out.print(mn + " ");

			while(!st.empty()) {

				int nextTop = st.peek();
				if(nextTop != mn) {
					newStack.push(nextTop);
				}
				st.pop();
			}

			st = (Stack <Integer>)newStack.clone();

		}

		System.out.println();

	}
}