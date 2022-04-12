package primenumber;

import java.util.Scanner;
public class PrimeNumber {

public static void main(String[] args) {
    System.out.println("THIS IS PROGRAM FOR PRINT PRIME NUMBERS\nPLZ ENTER NUMBER : ");
    
    Scanner in= new Scanner(System.in);
    int n;
    
    
    n= in.nextInt();
    if (n>1)
    {
        System.out.println("====================================\nPrime number is \n"+n);
        
        for(int i=1;n>=1;i--)
        {if ((n%2)==1&&(n/n)==1&&(n/1)==n&&(n%4)!=1)
        System.out.println(n);
        n-=1;
        
        }
        
    System.out.println(2);
    
        
    }
    else
       System.out.print("IT\'S NUMBER NOT PRIME");
}
}