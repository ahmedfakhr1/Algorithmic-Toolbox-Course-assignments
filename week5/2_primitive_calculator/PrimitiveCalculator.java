import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
           List<Integer> totalSequence = new ArrayList<Integer>();
        operations[] arr = new operations[n+1];
        //creating objects out of these references
        for (int i = 1; i < arr.length; i++) {
            arr[i]=new operations();
        }
        if (n==1){
            arr[n].numOfOperations=0;
            totalSequence.add(n);
        }
        else{
            totalSequence.add(1);
            for (int i = 2; i <arr.length; i++) {
                
                //getting the min of three values
                int value1 = 2147483647;
                int value2 = 2147483647;
                int value3 = 2147483647;
                
                if (i%3==0) {value1=arr[i/3].numOfOperations+1;}
                if (i%2==0) {value2=arr[i/2].numOfOperations+1;}
                value3=arr[i-1].numOfOperations+1;
                for (int j = 0; j < 3; j++) {
                    
                }
             //   System.out.println(value1+" "+value2+" "+value3);
                if (value1<=value2 && value1<=value3 && i%3==0) {
                arr[i].numOfOperations=value1;   
                arr[i].sequence.addAll(arr[i/3].sequence);
                }
                else if (value2<=value1 && value2<=value3 && i%2==0){
                arr[i].numOfOperations=value2;
                arr[i].sequence.addAll(arr[i/2].sequence);
                }
                else if (value3<=value2 && value3<=value1){
                arr[i].numOfOperations=value3;
                arr[i].sequence.addAll(arr[i-1].sequence);
                }
                
                arr[i].sequence.add(i);

            }
        totalSequence.addAll(arr[arr.length-1].sequence);
        
        }
        //Collections.reverse(sequence);
        return totalSequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
    static class operations{
        int numOfOperations;
        ArrayList<Integer> sequence;
        operations(){
        sequence=new ArrayList<Integer>(); 
        numOfOperations=0;
        }
    }
}

