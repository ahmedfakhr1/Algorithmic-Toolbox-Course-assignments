import java.util.*;
import java.io.*;

public class Partition3 {
            private static int partition3(List<Integer> b) {
        //write your code here
        
for (int j = 0; j < 100; j++) {
            
        
        Collections.shuffle(b);
        numbers[] a = new numbers[b.size()];
        for (int i = 0; i < a.length; i++) {
            a[i]=new numbers();
            a[i].value=b.get(i);
        }
        
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
            sum+=a[i].value;
        }
        
   if (sum % 3 != 0) return 0;
   else{
           
       
         int theFirstOne = 0;
         int theSecondOne = 0;
         int theThirdOne = 0;
         for (int i = 0; i < a.length; i++) {
                if (theFirstOne+a[i].value <= sum/3 && a[i].available==true) {
                    
                    theFirstOne+=a[i].value;

                    a[i].available=false;
                }
                }

         for (int i = 0; i < a.length; i++) {
                if (theSecondOne+a[i].value <= sum/3 && a[i].available==true) {
                    
                    theSecondOne+=a[i].value;
              //      System.out.print(a.get(i)+" ");
                    a[i].available=false;
                }
                }
         for (int i = 0; i < a.length; i++) {
                if (theThirdOne+a[i].value <= sum/3 && a[i].available==true) {
                    
                    theThirdOne+=a[i].value;
              //      System.out.print(a.get(i)+" ");
                    a[i].available=false;
                }
                }

         if ( theFirstOne == theSecondOne && theThirdOne==theSecondOne && theSecondOne==sum/3) {return 1;}
   
   
   
   
   }
   
        }
    
    
    
    
    return 0;
        
        }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        System.out.println(partition3(a));
    }
    static class numbers {
    boolean available = true;
    int value;
    }
}

