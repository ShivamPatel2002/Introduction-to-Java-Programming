/* @author Patel Shivam
   ID = 20SC057

   5.  (Math:  pentagonal  numbers)  A  pentagonal  number  is  defined  as  n(3n–1)/2  for. . ., and so on.
    Therefore, the first few numbers are 1, 5, 12, 22, . . ..Write a method with the following header
     returns a pentagonal number:public static intgetPentagonalNumber(intn)Write a test program that
      uses this method to display the first 100 pentagonal num-bers with 10 numbers on each line.
 */
package Exercise05;

public class Exercise05_01 {
    public static int getPentagonalNumber(int n){
        return (n*(3*n-1))/2;
    }

    public static void main(String[] args){
        for(int l = 1 ; l < 100 ; l++ ){
            System.out.print(getPentagonalNumber(l)+" ");
            if(l%10==0){
                System.out.println();
            }
        }
    }
}
