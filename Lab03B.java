// STRING TOKENISER
/* Write a Java program that would accept the input string: A + B - C / D
and display the Each Tokens, Attributes and total number of tokens.
The program should be able to accept any string that has the following items: A, B, C, D, +, /, -

---USER-INPUT EDITION---
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab03B {
    public static void main(String[] args) {
        System.out.print("Please enter the string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //Turn the string into tokens
        StringTokenizer st = new StringTokenizer(input, "+-/", true);
        sc = new Scanner(System.in);

        int tokenCount = 0;

        //Printing out each token, along with its attribute
        while (st.hasMoreTokens()) {
            tokenCount++;
            String token = st.nextToken().trim();

            //Determining and classifying the token's attribute
            String attribute;
            if (token.equals("+") || token.equals("-") || token.equals("/")) {
                attribute = "Operator";
            } else {
                attribute = "Identifier";
            }

            //Desired token output with attributes
            System.out.println("TOKEN#" + tokenCount + " " + token + " " + attribute);
        }

        //Total number of tokens output
        System.out.println("Total number of Tokens: " + tokenCount);

        sc.close();
    }
}