package myExercise;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class PostfixOrigin {
	Stack<String> stack = new Stack<String>();
	Vector<String> postfix = new Vector<String>();
	String exp = "10+10*2-2";

	public PostfixOrigin() {
		StringTokenizer st = new StringTokenizer(exp, "+*-/()", true);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();

			if (!isOperator(token)) {
				if (token.equals("(")) {
					stack.add(token);
				} else if (token.equals(")")) {
					String tmp = "";
					while (!(tmp = stack.pop()).equals("(")) {
						postfix.add(tmp);
					}
				} else
					postfix.add(token);
			} else {
				if (stack.isEmpty() || !isOperator(stack.get(stack.size() - 1)))
					stack.push(token);
				else {
					if (getPriority(stack.get(stack.size() - 1)) < getPriority(token)) {
						stack.push(token);
					} else {
						while( true ) {
							if (getPriority(stack.peek()) >= getPriority(token)) {
								postfix.add(stack.pop());
							} else {
								stack.push(token);
								break;
							}
							if ( stack.isEmpty() ) {
								stack.push(token);
								break;
							}
						}
					}
				}
			}
		}

		while (!stack.isEmpty()) {
			postfix.add(stack.pop());
		}

		System.out.print("postfix: ");
		for (int i = 0; i < postfix.size(); i++)
			System.out.print(postfix.get(i));
		System.out.println();

		calcPostfix();
	}

	public void calcPostfix() {
		stack.clear();

		for (int i = 0; i < postfix.size(); i++) {
			String token = postfix.get(i);

			if (!isOperator(token)) {
				stack.push(token);
			} else {
				if (getPriority(stack.get(stack.size() - 1)) < getPriority(token)) {
					stack.push(token);
				} else {
					int op1 = Integer.parseInt(stack.pop());
					int op2 = Integer.parseInt(stack.pop());
					int tmp = calc(op1, op2, token);
					stack.push(tmp + "");
				}
			}
		}

		System.out.println("result: " + stack.get(0));
		// return stack.get(0);
	}

	public void printStack() {
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " ");
		}
		System.out.println();
	}

	public int calc(int op1, int op2, String op) {
		int result = 0;
		if (op.equals("+")) {
			result = op1 + op2;
		} else if (op.equals("-")) {
			result = op1 - op2;
		} else if (op.equals("*")) {
			result = op1 * op2;
		} else if (op.equals("/")) {
			result = op1 / op2;
		}

		return result;
	}

	public int getPriority(String op) {
		if (op.equals("+") || op.equals("-"))
			return 1;
		else if (op.equals("*") || op.equals("/"))
			return 2;
		else
			return 3;
	}

	public boolean isOperator(String str) {
		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		new PostfixOrigin();
	}
}