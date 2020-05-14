import java.util.*;

public class prob7 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int t;
		t = in.nextInt();

		Stack <Integer> stack = new Stack<Integer>();
		while(t-- > 0) {

			int size;
			size = in.nextInt();

			while(size-- > 0) {

				int op;
				op = in.nextInt();

				if(op == 1) {

					int num;
					num = in.nextInt();

					if(stack.size() == 0)
						stack.push(num);

					else{

						Stack <Integer> temp = new Stack<Integer>();

						int top = stack.peek();
						if(top > num) {
							stack.push(num);
						}

						else {

							while(top < num && stack.size() > 0) {
								temp.push(top);
								stack.pop();
							}

							stack.push(num);

							while(temp.size() > 0) {
								stack.push(temp.peek());
								temp.pop();

							}
						}						
					}
					
				}
				else if(op == 2) {
					if(stack.size() == 0)
						System.out.println("Empty Stack");
					
					else {
						stack.pop();
						System.out.println(stack);
					}
				}
				else {

					if(stack.size() == 0)
						System.out.println("Empty Stack");

					else {
						int top = stack.peek();
						System.out.println(top);
					}
				}
			}

			System.out.println();
		}
	}
}