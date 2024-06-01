package Simple;

/*
Given a class 'Solution', you must implement a
single method, 'power(string, string)', which takes
two strings, 'A' and 'B'. You must return 'A^B'.
Throw and catch the following exceptions with a
handler message:
In case of an Arithmetic exception,
return 'Arithmetic Exception
occurred.'.
If 'A' or 'B' is negative, return 'A or
B can't be negative.'.
If 'A' and 'B' are zero, return A and
B both can't be zero.'.
If Number Format Exception occurred,
return Number Format Exception
occurred.'.
If another error occurs, return 'Some
other error occurred.'.
 */

import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String s)
    {
        super(s);
    }
}
class ZeroException extends Exception {
    public ZeroException(String s)
    {
        super(s);
    }
}
class Solution2 {
    public static String calculatePower(String A, String B) throws NegativeException, ZeroException {
        // Write your code here.
        int m = 0;
        int n = 0;
        int result=1;
        try{
            m = Integer.parseInt(A);
            n = Integer.parseInt(B);
            System.out.println("Value of m is: " + m);
            System.out.println("Value of n is: " + n);
            if (m < 0 || n < 0) {
                throw new NegativeException("A or B can't be negative.");
            }
            if (m == 0 && n == 0)
            {
                System.out.println();
                throw new ZeroException("A and B both can't be zero.");
            }
            while ( n != 0 ) {
                result *= m;
                --n;

            }
            String ans = Integer.toString(result);
            return ans;
        }
        catch (ArithmeticException e){
            return "Arithmetic Exception occurred.";
        }
        catch (NumberFormatException e) {
            return "Number Format exception occurred.";
        }

        catch(NegativeException e){
            return "A or B can't be negative.";
        }

        catch(ZeroException e){
            return "A and B both can't be zero.";
        }
    }
}

public class CalculatePower {
    public static void main(String args[]) throws NegativeException, ZeroException {
        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.next();
        b = sc.next();
        System.out.println(Solution2.calculatePower(a, b));
    }
}