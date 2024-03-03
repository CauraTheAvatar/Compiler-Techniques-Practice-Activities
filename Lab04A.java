import java.util.Scanner;

public class Lab04A 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User Input
        System.out.print("Enter two numbers separated with a space (startNo and endNo): ");
        int startNo = sc.nextInt();
        int endNo = sc.nextInt();

        //Conditions
        if (startNo<0)
        {
            System.out.println("startNo cannot be less than 0");
            return;
        }

        if (endNo<0)
        {
            System.out.println("endNo cannot be less than 0");
            return;
        }

        if (endNo>9)
        {
            System.out.println("endNo cannot be greater than 9");
            return;
        }

        if (startNo>endNo)
        {
            System.out.println("startNo must NOT be greater than endNo");
            return;
        }

        //Sum of Even Numbers
        int sumAll = 0;
        for (int i = startNo; i<= endNo; i++)
        {
            sumAll += i;
        }

        //Output
        System.out.println("Sum of ALL Numbers = " + sumAll);
    }
}