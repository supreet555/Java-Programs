package projects;

import java.util.ArrayList;
import java.util.Scanner;

public class XylemPhylem {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scn.nextInt();
        int firstDigit = num, lastDigit = num;

        // first digit
        for (int i = 0; i < num; i++) {
            if (firstDigit <= 9) {
                break;
            }
            firstDigit = firstDigit / 10;
        }

        // last digit
        lastDigit = lastDigit % 10;

        // first last digit sum
        int sum1 = firstDigit + lastDigit;

        // middle numbers
        ArrayList<Object> middleNums = new ArrayList<>();
        int numLess = num / 10;
        int temp = num + num;
        for (int i = 0; i < num; i++) {
            if (numLess < 10) {
                break;
            }
            temp = numLess % 10;
            numLess = numLess / 10;
            middleNums.add(temp);
        }

        // middle numbers sum
        int sum2 = 0, temp2 = 0;
        for (int i = 0; i < middleNums.size(); i++) {
            temp2 = (int) middleNums.get(i);
            sum2 = sum2 + temp2;
        }

        // checking for Xylem and Phylem
        if (sum1==sum2) {
            System.out.println("Xylem: equal");
        } else {
            System.out.println("Phylem: not equal");
        }

        scn.close();

    }
}