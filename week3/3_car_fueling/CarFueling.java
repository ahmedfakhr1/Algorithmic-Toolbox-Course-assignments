import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int d, int m, int[] stops) {
     int refills=0;
     int start=0;
        if(d-stops[stops.length-1]>m){ //the case of the end point and last gas station
        return -1;
        }
        
        if (d<=m){ //the short distance case
        return 0;
        }
        
        else
        {   while(start+m<d){
            for (int i = stops.length-1; i >=0 ; i--) {
                
                if(i!=0 && stops[i]-stops[i-1] > m){
                return -1;
                }
                
                if(stops[i]<=start+m){
                refills++;
                start=stops[i];
                break;
                }
                
                if(start+m>=d){
                return refills;
                
                }
            }}

        
        }
        
        return refills;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
    
}
