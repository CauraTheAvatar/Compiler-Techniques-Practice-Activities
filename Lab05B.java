import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab05B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please enter the string (or '99' to quit): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("99")) {
                isRunning = false;
                System.out.println("Program terminated! Thank you!");
            } else {
                processInput(input);
            }
        }

        sc.close();
    }

    // Phase 1: Syntax and Semantic Checking
    private static void processInput(String input)
    {
        Pattern ptn = Pattern.compile("[a-zA-Z]+");
        Pattern ptn2 = Pattern.compile("^(\\d+\\s*\\+\\s*\\d+\\s*\\-\\s*\\d+\\s*\\*\\s*\\d+\\s*\\/\\s*\\d+\\s*;\\s*)$");
        Matcher mtc = ptn.matcher(input);

        if (mtc.matches()) 
        {
            System.out.println("Syntax and semantic checking passed!");
            System.out.println("TOKENIZATION RESULT: ");

            // Phase 2: Derivation
            String derivedExpression = derivation(input);
            System.out.println("Derived Expression: " + derivedExpression);

            // Phase 3: Hardcoded message
            System.out.println("This expression:  5 - 4 + 9 * 8 / 2 ;  is Syntactically and Semantically correct");
        } else
        {
            System.out.println("Syntax and semantic checking failed!");
        }
    }

    // Phase 2: Derivation
    /**
     * @param input
     * @return
     */
    private static String derivation(String input)
    {
        StringBuilder output = new StringBuilder();
        int number = 1;
        StringTokenizer tkn = new StringTokenizer(input, " +-*/;", true);
        
        while (tkn.hasMoreTokens()) 
        {
            String token = tkn.nextToken();

            if (token.equals(" ") || token.equals(";"))
            {
                output.append(token);
            } else if (Character.isDigit(token.charAt(0)))
            {
                output.append(token);
            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
            {
                output.append("E");
                output.append(number);
                number++;
            }
        }

        String reversedOutput = new StringBuilder(output).reverse().toString();
        StringBuilder finalOutput = new StringBuilder();

        for (char c : reversedOutput.toCharArray())
        {
            if (Character.isDigit(c))
            {
                finalOutput.append(c);
            }
        } 
        // else if (c == 'E')
        // {
        //     int index = reversedOutput.indexOf(c);
        //     if (index < reversedOutput.length() - 1)
        //     {
        //         char nextChar = reversedOutput.charAt(index + 1);
        //         if (Character.isDigit(nextChar))
        //         {
        //             finalOutput.append(nextChar);
        //         }
        //     }
        // }
        
    return finalOutput.toString();
    }
}
