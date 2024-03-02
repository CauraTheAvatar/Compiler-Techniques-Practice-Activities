//A program to sum even numbers between startNo and endNo (with conditions)

import java.util.Scanner;

public class Lab02A {
    private static Scanner sc;

    public static void main(String[] args) {
        int startNo, endNo, sumEven = 0;
        sc = new Scanner(System.in);

        // Accepting startNo and endNo input from user and performing validation
        System.out.print("Please enter the start number: ");
        startNo = sc.nextInt();
        if (startNo < 0) {
            System.out.println("startNo cannot be less than 0");
            return;
        }

        System.out.print("Please enter the end number: ");
        endNo = sc.nextInt();
        if (endNo < 0) {
            System.out.println("endNo cannot be less than 0");
            return;
        }

        if (endNo > 9) {
            System.out.println("endNo cannot be greater than 9");
            return;
        }

        if (startNo > endNo) {
            System.out.println("startNo must NOT be greater than endNo");
            return;
        }

        sumEven = 0;
        for (int n = startNo; n <= endNo; n++) {
            if (n % 2 == 0) {
                sumEven += n;
            }
        }

        System.out.println("\n Sum of Even Numbers = " + sumEven);
    }
}