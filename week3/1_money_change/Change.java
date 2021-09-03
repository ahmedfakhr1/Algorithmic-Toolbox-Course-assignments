import java.util.Scanner;

public class Change {
   /** private static int getChange(int m) {
        //write your code here
        return m;
    }
**/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int noOfCoins=0;
 
        while(value>=10){
        value=value-10;
        noOfCoins++;  
        }
        
        while(value>=5){
        value=value-5;
        noOfCoins++; 
        }
        
        while(value>=1){
        value=value-1;
        noOfCoins++;  
        }
        System.out.println(noOfCoins);
}}

