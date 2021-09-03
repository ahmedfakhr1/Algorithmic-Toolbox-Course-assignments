import java.util.Scanner;
class Item{

int value;
int weight;
double valueOverWeight;

}
public class FractionalKnapsack {
	
	
       public static void swap(Item arr[],int i ,int j){
    Item tmp = new Item();
    tmp= arr[i];
    arr[i]=arr[j];
    arr[j]=tmp;
    }
 
    public static Item[] selSort(Item[] unSortArr){
    
        for (int i = 0; i < unSortArr.length; i++) {
            double max=0;
            int minIndex=-1;
            for (int j = i; j < unSortArr.length; j++) {
                if (max == 0 || unSortArr[j].valueOverWeight>max){
                max=unSortArr[j].valueOverWeight;
                minIndex=j;
                }
                
            }
            swap(unSortArr,i,minIndex);
        }

    return unSortArr;
    }
    
    /**
    public static void printArrayInt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void printArrayDouble(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }**/
    
     private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //trying out class idea
        Item[] items = new Item[values.length];
         for (int i = 0; i < values.length; i++) {
             items[i]=new Item();
             items[i].value=values[i];
             items[i].weight=weights[i];
             items[i].valueOverWeight=(double)values[i]/weights[i];
             
         }
         
        
        
        //creating an array of the actual important stuff
        
 //       double[] weightOverval = new double[values.length];
 //        for (int i = 0; i < weightOverval.length; i++) {
//             weightOverval[i]=(double)values[i]/weights[i];
 //        }
         //sorting it out O[n^2]
         Item[] SortedItems = selSort(items);
         //gettinng sorted weights
         /**
         int[] weightsSORTED = new int[weights.length];
         for (int i = 0; i < weightOvervalSORTED.length; i++) {
             for (int j = 0; j < values.length; j++) {
                 if (weightOvervalSORTED[i]==weightOverval[j]){
                 weightsSORTED[i]=weights[j];
                 }
             }
         }**/
         //gettinng sorted values
         /**
         int[] valuesSORTED = new int[values.length];
         for (int i = 0; i < valuesSORTED.length; i++) {
             valuesSORTED[i]=(int)(weightsSORTED[i]*(weightOvervalSORTED[i]));
         }
         **/
        // printArrayInt(valuesSORTED);
        // printArrayInt(weightsSORTED);
         //printArrayDouble(weightOvervalSORTED);
         //calculating the sum of the weights
         /**
         //printing sorted
         for (int i = 0; i < items.length; i++) {
             System.out.print(items[i].value);
             System.out.print(items[i].weight);
             System.out.print(items[i].valueOverWeight);
         }
         System.out.println("");**/
         
         int sumWeights = 0;
         for (int i = 0; i < items.length; i++) {
             sumWeights+=items[i].weight;
         }
       //  System.out.println("the weight: "+sumWeights);
         //calculating the value
         while (capacity !=0){
         if (capacity<=sumWeights){
             for (int i = 0; i < items.length; i++) {
             if (capacity>=items[i].weight){
              capacity=capacity-items[i].weight;
              value=value+items[i].value;
              if (capacity == 0) break;
             }
              else{
                 value+=capacity/(double)items[i].weight*items[i].value;
               //  System.out.println("last value : "+ capacity/(double)weightsSORTED[i]*valuesSORTED[i]);
/**                 System.out.println("the valuesSORTED[i]: "+valuesSORTED[i]);
                 System.out.println("the capacity: "+capacity);
                 System.out.println("the weightsSORTED[i]: "+weightsSORTED[i]);
                 System.out.println("the value: "+value);**/
                 //capacity = capacity-weightsSORTED[i]*(capacity/weightsSORTED[i]);
                 capacity=0;
                 break;
             //    System.out.println(value);
                 
             }
             }
         }
         
/**
         else if (capacity<sumWeights){
         for (int i = 0; i<weightsSORTED.length; i++) {
             if (capacity>=weightsSORTED[i]){
          //   while (capacity>=weightsSORTED[i]){
                 capacity=capacity-weightsSORTED[i];
                 value=value+valuesSORTED[i];
       //  }
         }
             else{
                 value=value+(double)valuesSORTED[i]*((double)capacity/weightsSORTED[i]);
                 capacity=0;
                 break;
             }
             
         }
         
         
         }**/
         else{
         for (int i = 0; i<items.length; i++) {

             
              //   System.out.println("done");
                // capacity=capacity-weightsSORTED[i];
               //  System.out.println(capacity);
                 value=value+items[i].value;
         
         
             
             
         }
         capacity=0;
         }}
         
        return value;
    }
    
    public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
        //taking input
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights= new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        
       System.out.printf(String.format("%.4f", getOptimalValue(capacity,values,weights)));
    }
} 
