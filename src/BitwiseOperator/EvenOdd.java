package BitwiseOperator;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        int n=sc.nextInt();
        if (((n & 1) ==0))
        {
            System.out.println("even  number");
        }
        else {
            System.out.println("odd number");
        }
    }

}
