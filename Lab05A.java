import java.util.Scanner;

public class Lab05A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers separated with a  space: (startNo and endNo): ");
        int startNo = sc.nextInt();
        int endNo  = sc.nextInt();
        sc.close();

        if (startNo < 0) 
        {
            System.out.println("startNo cannot be less than 0");
        } else
        if (endNo < 0)
        {
            System.out.println("endNo cannot be less than 0");
        } else
        if (endNo > 9)
        {
            System.out.println("endNo cannot be greater than 9");
        } else 
        if (startNo > endNo)
        {
            System.out.println("startNo must NOT be greater than endNo");
        } else 
        {
            int sumSquares = 0;
            for (int i = startNo; i  <= endNo; i++) 
            {
                // add the square of each number to sum
                sumSquares += i * i;
            }
            System.out.println("Sum of squares of Numbers = " + sumSquares);
        }
    }
}