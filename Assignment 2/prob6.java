import java.util.*;

public class prob6 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		String str;
		str = in.next();

		Stack <Character> stack = new Stack <Character>();

		int len = str.length();

		int flag = 0;

		for(int i=0;i<len;i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
				stack.push(str.charAt(i));

			else {

				if(str.charAt(i) == ')') {

					char top = stack.peek();
					if(top == '(')
						stack.pop();
					else {
						flag = 1;
						break;
					}
				}

				else if(str.charAt(i) == '}') {
					
					char top = stack.peek();
					if(top == '{')
						stack.pop();
					else {
						flag = 1;
						break;
					}

				}

				else if(str.charAt(i) == ']') {

					char top = stack.peek();
					if(top == '[')
						stack.pop();
					else {
						flag = 1;
						break;
					}

				}

			}
		}

		if(flag == 1 || stack.size() > 0)
			System.out.println("Not balanced");
		else
			System.out.println("Balanced");
	}
}