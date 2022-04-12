/*lab_1_as_problem1
*baha aden akour
*student id: 31918001037
*/
package sumnumbers;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        System.out.println("This program for sumation intiger number for 1 to n");
        System.out.println("enter number plz:");
        Scanner in=new Scanner(System.in);
      int sum=0; 
      int n;
      n=in.nextInt();
      int x=1;
      while(x<=n)
      {
          sum+=x;
          x=x+1;
      }
      System.out.println("Sum ="+sum);
    }
    
}
