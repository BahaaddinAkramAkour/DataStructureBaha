
package average6quiz;

import java.util.Scanner;


public class Average6Quiz {

    
public static float avg(int[]arr)
{
float sum=0;
float avg=0;
for (int i=0;i<arr.length;i++)
{
sum+=arr[i];
avg=sum/arr.length;

}
System.out.println("average for these quizzes :"+avg);
return avg;
}
public static int CountOfData(char []arr)
{
    int count=0;
    for(int i=0 ; i< arr.length;i++)
    {
        if(arr[i]>='0'&&arr[i]<='9')
            count++;
    }
return count;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
  
        int []arr =new int[6];
        System.out.println("Plz Enter 6 value for your quzzes:");
        for(int i=0;i<arr.length;i++)
        {
          arr[i]= in.nextInt();
        }
        avg(arr);
        
        System.out.println("####################count of digit##################");
        char[] arr1=new char[100];
        System.out.println("plz enter char and digit");
        for(int j=0; j<arr1.length;j++)
        {
            arr[j]=in.nextInt(j);
        }
        System.out.println("value of di"+CountOfData(arr1));
    }
    
}
