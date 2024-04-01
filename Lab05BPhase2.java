import java.util.Scanner;

public class Lab05BPhase2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();
        String output = derivation(input);
        System.out.println("Derived expression: " + output);
    }

    private static String derivation(String input)
    {
        StringBuilder output = new StringBuilder();
        int number = 1;
        for (char c : input.toCharArray())
        {
            if (Character.isLetter(c)) 
            {
                output.append('E');
                output.append(number);
                number++;
            } else if (Character.isDigit(c))
            {
                output.append(c);
            }
        }

        String reversedOutput = new StringBuilder(output).reverse().toString();
        StringBuilder finalOutput = new StringBuilder();
        for  (char c : reversedOutput.toCharArray())
        {
            if (Character.isDigit(c))
            {
                finalOutput.append(c);
            } else if (c == 'E')
            {
                int index = reversedOutput.indexOf(c);
                if (index < reversedOutput.length() - 1) 
                {
                    char nextChar = reversedOutput.charAt(index + 1);
                    if (Character.isDigit(nextChar))
                    {
                        finalOutput.append(nextChar);
                    }
                }
            }
        }
        return finalOutput.toString();
    }
}