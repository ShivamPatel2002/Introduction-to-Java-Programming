/*
    @author Patel Shivam
    Id 20CS057

    **5.3(Palindrome integer) Write the methods with the following headers// Return the reversal
    of an integer, i.e., reverse(456) returns 654public static intreverse(intnumber)// Return true
    if number is a palindromepublic static booleanisPalindrome(intnumber)Use  the  reversemethod
     to  implement  isPalindrome. A  number  is  a  palin-drome  if  its  reversal  is  the  same
       as  itself.  Write  a  test  program  that  prompts  theuser to enter an integer and
        whether the integer is a palindrome.
 */
package Exercise05;

import java.util.Scanner;

public class Exercise05_03 {
    public static int reverse (int a){  // Method to reverse the number
        int rev = 0;
        while(a!=0) {                   // while loop to reverse number
            rev = (rev * 10) + (a % 10);
            a=a/10;
        }
        return rev; // returns reverse number
    }

    public static boolean isPalindrome(int a){  // boolean method to check whether it is Palindrome or not
        return a == reverse(a); // the default value of boolean method is false
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ispalindrome = isPalindrome(num);

        if(ispalindrome){ // ispalindrome is true ....
            System.out.println("It is Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
