import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab05BPhase1 {
    public static void main(String[] args)
    {
        System.out.println("Please enter the string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //Exit Condition
        if (input.equals("99"))
        {
            System.out.println("Program terminated! Thank you!");
            System.exit(0);
        }

        //Syntax Error Check
        Pattern pt = Pattern.compile("^[a-zA-Z] + ([+-/*][a-zA-Z]+)*$");
        System.out.println("Wrong expression:" + input + "No Derivation done! PLS RE-ENTER A VALID STRING");
        Matcher mt = pt.matcher(input);

        if (!mt.matches())
        {
            System.out.println("SYNTAX ERROR- Use of Special Characters ie &, &&, $, %, !, , etc, not permitted");
            System.out.println("Wrong expression:" + input + "No Derivation done! PLS RE-ENTER A VALID STRING");
            System.exit(1);
        }

        //Tokeization
        StringTokenizer st = new StringTokenizer(input, "+-/*", true);
        sc = new Scanner(System.in);

        int tokenCount = 0;

        while (st.hasMoreTokens())
        {
            tokenCount++;
            String token = st.nextToken().trim();

            String attribute;
            if (token.equals("+") || token.equlas("-") || token.equals("/") || token.equals("*"))
            {
                attribute = "Operator";
            } else
            {
                attribute = "Identifier";
            }

            if (tokenCount > 1 && st.hasMoreTokens() &&
            (st.nextToken().trim().equals("+") || st.nextToken().trim().equals("-") || st.nextToken().trim().equals("/")  || st.nextToken().trim().equals("*")))
            {
                System.out.println("#1 SEMANTIC ERROR- two operators (*,-,+,/) or Identifier (A to Z and a to z) cannot be written together!");
                System.out.println("Wrong expression:" + input + "No Derivation done! PLS RE-ENTER A VALID STRING");
            } else
            { 
                System.out.println("TOKEN#" + tokenCount + " " + token + " " + attribute);
            }

            if (tokenCount > 1 && !attribute.equals("Operator"))
            {
                System.out.println("#2 SEMANTIC ERROR- two operators (*,-,+,/) or Identifier (A to Z and a to z) cannot be written together!");
                System.out.println("Wrong expression:" + input + "No Derivation done! PLS RE-ENTER A VALID STRING");
            }
        }
        System.out.println("Total number of Tokens: " + tokenCount);
        System.out.println("GIVEN THE GRAMMAR: E=E1 | E=E1*E2 | E=E1+E2 | E=digit | E={0,1,2,3,4,5,6,7,8,9}");

        sc.close();
    }
}
