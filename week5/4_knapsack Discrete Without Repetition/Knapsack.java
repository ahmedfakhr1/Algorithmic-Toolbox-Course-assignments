import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
        //write you code here
        //write you code here
        int result = 0;
        int [][] arr = new int [w.length+1][W+1];
        
        /**
        //USELESS LINES
        
        //filling first row in zeros
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i]=0;
        }
        //filling first column in zeros
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=0;
        }
        **/
        int rowWeight = -1;
        for (int i = 1; i < arr.length; i++) {
            rowWeight=w[i-1];
            for (int j = 1; j < arr[0].length; j++) {
                
                if ( (j-rowWeight) >=0 && (arr[i-1][j-rowWeight]+rowWeight) > arr[i-1][j]){
                arr[i][j]=(arr[i-1][j-rowWeight]+rowWeight);
                }
                else {
                arr[i][j]=arr[i-1][j];
                }
            }
        }
        result = arr [arr.length-1][arr[0].length-1];
        /**
        //printing the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        **/
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

