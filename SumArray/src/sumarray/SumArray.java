/*lab_1_as_problem2
*baha aden akour
*student id: 31918001037
*/
package sumarray;

import java.util.Scanner;

public class SumArray {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("This program for sumation your input array :) \n");
        System.out.println("How many elemants do you have for your array:");
        int h;
        h=in.nextInt();
        int arr[]=new int [h];
        
        System.out.println("plz enter integer number is save in array :");
        int sum=0;
        for(int n : arr)
        
        {    n= in.nextInt();
            
           sum+=n;
            
         }
        System.out.println("Array Sum="+sum); 
        }  
        
    
}
