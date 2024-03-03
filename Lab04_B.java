import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab04_B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Step 1: User Input Number of Lines
        System.out.print("Enter Number of lines of Program:");
        int numLines;
        try
        {
            numLines = Integer.parseInt(sc.nextLine());
        } catch(NumberFormatException e)
        {
            sc.close();
            return;
        }

        int lineCount = 1;

        //Processing Each String Entered
        while (lineCount<=numLines) 
        {
            //User Input with Condition
            System.out.println("Enter String#" + lineCount + ": ");
            String input = sc.nextLine().trim();
            
            //Tokenization of Input String
            StringTokenizer tokenizer = new StringTokenizer(input, "+-*/", true);
            StringTokenizer tokenizer2 = new StringTokenizer(input, "ABCD", true);
            int tokenNum = 0;

            while (tokenizer.hasMoreTokens())
            {
                tokenNum++;
                String token = tokenizer.nextToken().trim();
                
                if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
                {
                    System.out.println("TOKEN#" + tokenNum + " " + token + " operator");
                } else 
                {
                    System.out.println("Invalid tokens entered!");
                    return;
                }
                

                // String token2 = tokenizer2.nextToken().trim();

                // if(token.equals("A") || token.equals("B") || token.equals("C") || token.equals("D"))
                // {
                //     System.out.println("TOKEN#" + tokenNum + " " + token2 + " Identifier");
                // } else 
                // {
                //     System.out.println("Invalid tokens entered!");
                //     return;
                // }
            }

            System.out.println("TOTAL NUMBER OF TOKENS FOR STRING#" + numLines + ":" + tokenNum);
            System.out.println("END OF STRING#" + numLines);
            System.out.println();

            lineCount++;
        }
        sc.close();
    }
}