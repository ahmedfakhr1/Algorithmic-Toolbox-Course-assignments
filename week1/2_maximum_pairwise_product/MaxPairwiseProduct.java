import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] arr) {
        long maxNum1 = 0;
        long maxNum2 = 0;
        int indexmaxNum1 = 0;
        int indexmaxNum2 = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (maxNum1 == 0 || arr[i]>maxNum1){
            maxNum1=arr[i];
            indexmaxNum1=i;
                
            }
            //System.out.println(maxNum1+" "+indexmaxNum1);
        }
        for (int i = 0; i < arr.length; i++) {
            if ((maxNum2 == 0 || arr[i]>maxNum2) && (i != indexmaxNum1)){
              maxNum2=arr[i];
              indexmaxNum2=i;
              }
           // System.out.println(maxNum2+" "+indexmaxNum2);
        }
        return maxNum2*maxNum1;
    }
    
    

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
