import java.util.*;

public class GCD {
  /**private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }**/
  
  
  private static int getGCD(int a, int b) {
    if (b==0) {
        return a;
        }
 
    return -1;
  }

  public static void main(String args[]) {
        int a=0,b=0;
        int result = 0;
        Scanner input= new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        result = getGCD(a,b);
        while(true){
        if (result==-1){
            int tmp =0;
            tmp=b;
            b=a%b;
            a=tmp;
            result=getGCD(a,b);
        
        }
        else {
        break ;
        }}
        System.out.println(result);
        
        
        }

    //System.out.println(gcd_naive(a, b));
  }

