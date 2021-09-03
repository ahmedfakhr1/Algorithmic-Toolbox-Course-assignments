import java.util.Scanner;

public class Fibonacci {
 /** private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  } **/
  
  
  
    private static long calc_fib(int n) {
    int arr_size=n+1;
    int[] arr = new int[arr_size];
   // arr[0]=0;
   // arr[1]=1;
   
        for (int i = 0; i < arr_size; i++) {
        if (i == 0){
        arr[0]=0;
        }
        else if(i == 1){
        arr[1]=1;
        }
        else{
            arr[i]=arr[i-1]+arr[i-2];
            }
        }
    
    return arr[n];
    
    
  }
  

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}

