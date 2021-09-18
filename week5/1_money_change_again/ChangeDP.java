import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m) {
        //write your code here
        final int deno1=1;
        final int deno2=3;
        final int deno3=4;
        final int maxMoney = 1000+1;
        int[] coins = new int[maxMoney];
        coins[0]=0;
        coins[1]=1;
        coins[2]=2;
        coins[3]=1;
        coins[4]=1;
        
        for (int i = 5; i <= m; i++) {
            int value1 = coins[i-deno1]+1;
            int value2 = coins[i-deno2]+1;
            int value3 = coins[i-deno3]+1;
            if (value1<=value2 && value1 <=value3) coins[i]=value1;
            else if (value2<=value1 && value2 <=value3) coins[i]=value2;
            else coins[i]=value3;
            
        }
        return coins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

