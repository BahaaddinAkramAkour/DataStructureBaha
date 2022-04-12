// Student id : 31918001037 - Student name: Baha' adin Akour
package datastructuresrecursion;

public class DataStructuresRecursion {

    public static int FinbonacciRecursion(int x){
    if(x==0){
        return 0;
    }
    if(x==1){
        return 1;
    }
    return FinbonacciRecursion(x-1)+FinbonacciRecursion(x-2);
    }
    public static void main(String[] args) {
    int num=15;
    
    for(int i=0; i <num;i++){
    System.out.print(FinbonacciRecursion(i)+ " ");
    }
    System.out.println();
    }

    
    
}
