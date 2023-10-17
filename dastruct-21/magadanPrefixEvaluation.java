/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magadan;

import java.util.*;

/**
 *
 * @author VV702
 */
public class magadanPrefixEvaluation {

   static Scanner scanner = new Scanner(System.in);

	static Boolean isOp(char c)
	{
       return c >= 48 && c <= 57;
	}

	static double evaluateP(String exp)
	{
		Stack<Double> stack = new Stack<>();

		for (int j = exp.length() - 1; j >= 0; j--) {

			if (isOp(exp.charAt(j)))
				stack.push((double)(exp.charAt(j) - 48));

			else {
				double a = stack.peek();
				stack.pop();
				double b = stack.peek();
				stack.pop();

				switch (exp.charAt(j)) {
				case '+':
					stack.push(a + b);
					break;
				case '-':
					stack.push(a - b);
					break;
				case '*':
					stack.push(a * b);
					break;
				case '/':
					stack.push(a / b);
					break;
				}
			}
		}

		return stack.peek();
	}

	public static void main(String[] args)
	{
		System.out.print("Enter Expression: ");
		String exp = scanner.nextLine();
		
		System.out.println("Prefix Evaluation: "+ evaluateP(exp));
    
    }
}
