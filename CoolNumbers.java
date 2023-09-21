package for_fun;

import java.util.Scanner;

public class CoolNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input x\n> ");
        int x = input.nextInt();

        System.out.print("input a\n> ");
        int a = input.nextInt();

        System.out.print("input b\n> ");
        int b = input.nextInt();

        // if (isCool(x, a) == true) {
        //     System.out.println(a + " is a cool number");
        // } else {
        //     System.out.println(a + " is not a cool number");
        // }

        // if (isCool(x, b) == true) {
        //     System.out.println(b + " is a cool number");
        // } else {
        //     System.out.println(b + " is not a cool number");
        // }
        System.out.println(countCools(x, a, b));

    }

    // for(int i = a; i < b; i++) {
    // while (i>0) {
    // int digit2 = i % 10;
    // i /=10;
    // }
    // System.out.println(i);
    // count++;

    // }
    // System.out.println(count);

    // public static boolean isCool(int in1, int in2) {
    //     int a1 = in2;
    //     while (a1 > 0) {
    //         int digit = a1 % 10;
            
    //         if (digit == 0 || in1 % digit != 0) {
    //             return false;
    //         }
    //         a1 /= 10;
    //     }
    //     return true;
    // }

    public static boolean isCool(int in1, int in2) {
    int a2 = in2;
    for (int m = 0; a2 >= m; m++) {
    int digit;
    a2 /= 10;
    digit = a2 % 10;
    if (digit == 0 || in1 % digit != 0) {
    return false;
    }

    }
    return true;
}

    public static int countCools(int x, int start, int end) {
        int count = 0;
        int b1 = end;
        int a1 = start;
        if (a1 < b1) {
            while (a1 <= b1) {
                b1--;
                if (isCool(x, b1) == true) {
                    count++;
                }

            }
            return count;

        } else {
            while (a1 >= b1) {
                a1--;
                if (isCool(x, a1) == true) {
                    count++;
                }

            }
            return count;
        }
    }
}
