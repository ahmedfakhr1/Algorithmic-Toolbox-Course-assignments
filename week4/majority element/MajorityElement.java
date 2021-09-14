import java.util.*;
import java.io.*;
public class MajorityElement {
    static Random ran = new Random();

    private static int getMajorityElement(int[] a,int n,int l , int r) {
        
        
        int left = l;     //starting point in the array  
        int right = r;    //number of elements in the array
        int MiddlePoint =left+(right-left)/2;
        int count = 0;
        int numberOfElements=n;
        int result = 0;
        
        
        int[] arr = new int[1000];
        
        for (int i = 0; i < a.length; i++) {
            if (i<30){
          arr[i]=a[i];}

        }
        //int current = arr[0];
      //  int next= -1;
        int[] counter = new int[1000];
        
        int nondup = 0;
        int[] elements = new int[1000];
        int x = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i]=-1;
        }
        for (int i = 0; i < arr.length; i++) {
                    boolean found =false;
            for (int j = 0; j < elements.length; j++) {
                if(arr[i]==elements[j]) {
                    found=true;
                    break;}
            }
            if (found == false){
            
            elements[x]=arr[i];
               x++;
               nondup++;
            }
        }
       // for (int i = 0; i < elements.length; i++) {
         //  System.out.print("e"+ elements[i]+" ");
        //}
//        System.out.println("nondup "+nondup );

        if (nondup<1000 && numberOfElements==a.length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < 30; j++) {
                    if(a[i]== elements[j]) counter[j]++;
                }
                
               // if(a[i]== elements[0]) counter[i]++;
                //if(a[i]== elements[1]) secondCounter++;
                //if(a[i]== elements[2]) thirdCounter++;
            }
       //     System.out.println(" "+firstCounter+" "+secondCounter+" "+thirdCounter+" ");
            for (int i = 0; i < 30; i++) {
                if(counter[i]>a.length/2) return 1;
            }
        //if (firstCounter>a.length/2) return 1;
        //if (secondCounter>a.length/2) return 1;
        //if (thirdCounter>a.length/2) return 1;
        
        
        
        }
        else{
        
        if (numberOfElements==1) return 1;
        
        //searching the left half
        if(MiddlePoint<a.length){
        for (int i = left; i < right; i++) {
            if (a[MiddlePoint] == a[i]){
            count++;
            }}}


        
        if (count > (numberOfElements/2)) 
        {   result=1;
            return result;
        }
        /**
        else if (result == 0){
            int leftPart=getMajorityElement(a,(int)(numberOfElements/2), left, MiddlePoint);
        
            if (leftPart==1){
            count = 0;
            for (int i = left/1000; i < right*4; i++) {
                if (left+(MiddlePoint-left)/2<a.length && 0<=i && i<a.length && a[i] == a[left+(MiddlePoint-left)/2]){count++;}
                if(count>numberOfElements/2){break;}
            }
    //        System.out.println("count1:  "+count);
            
                if(count>numberOfElements/2){
                 result=1;    
                 return result;}
                    }
        
            int rightPart=getMajorityElement(a,(int)(numberOfElements-(numberOfElements/2)),MiddlePoint+1,right);
        
            if (rightPart==1){
            count = 0;
            for (int i = left/1000; i < right*4; i++) {
                if ((MiddlePoint+1+(right-MiddlePoint-1)/2)< a.length && 0<=i&&i<a.length && a[i] == a[MiddlePoint+1+(right-MiddlePoint-1)/2]){
            count++;
            }
                
            if(count>numberOfElements/2){
                 result=1;    
                 return result;}
            }
       //     System.out.println("count2:  "+count);
            }
        }**/
        
       // System.out.println("count4:  "+count);
        
        
        
        
        
        
        
        
        
        
        else if (getMajorityElement(a,(int)(numberOfElements/2), left, MiddlePoint) == 1 ){
            count = 0;
            for (int i = MiddlePoint; i < right; i++) {
            if (MiddlePoint<a.length && a[i] == a[left+(MiddlePoint-left)/2]){
            count++;
            }}
            for (int i = left; i < MiddlePoint; i++) {
            if (a[i] == a[left+(MiddlePoint-left)/2]){count++;}
            

            if(count>numberOfElements/2){break;}

            }
            
            
            if(count>numberOfElements/2){
                //System.out.print("__1__count is: "+ count+"  ");

                 return 1;}
            
          //  System.out.print("__2__count is: "+ count+"  ");
            return 0;
            

        }
        
        else if (getMajorityElement(a,(int)(numberOfElements-(numberOfElements/2)),MiddlePoint+1,right) ==1)
                {

            count = 0;
            for (int i = left; i < MiddlePoint; i++) {
            if (a[i] == a[MiddlePoint+1+(right-MiddlePoint-1)/2]){
            count++;

            }}


            for (int i = MiddlePoint; i < right; i++) {
            if (a[i] == a[MiddlePoint+1+(right-MiddlePoint-1)/2]){
            count++;
            }
            if(count>numberOfElements/2){break;}
            }

            }}


            if(count>numberOfElements/2){
            //    System.out.print("__3__count is: "+ count+"  ");

            return 1;            
            }
     
    
            return 0;}
    
    private static int getMajorityElementNaive(int[] a){
        
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j]==a[i]) count++;
            }
            if (count>a.length/2) {
                
           //     System.out.println("the dominant number is: "+ a[i]);
      //          System.out.println("count::: "+count);
                
                return 1;}
        }
    
    
                return 0;

    
    }

    public static void main(String[] args) {
        
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
       int result = getMajorityElement(a,a.length,0,a.length);
       System.out.print(result);
       
       
        
        /**
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }**/
        
        /**
        //Testing
        
            for (int i = 10; i < 15; i++) {
                int[] a = new int[i];
                /**
                for (int j = 0; j < i/2 +1; j++) {
                    a[j]=5;
                }
                **/
                
        /**
                
                
                

                int result = getMajorityElement(a,a.length,0,a.length);
                System.out.println("The Result is : "+result);
                System.out.println("___________________________________________");
                if (result !=1) break;

            
            } **/
        /**
        while(true){
        Random random = new Random ();
        
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
                    a[i]=random.nextInt(1000000000);
                    //a[i]=random.nextInt(2);
                }
        
        int myResult = getMajorityElement(a,a.length,0,a.length);
        int naiveResult = getMajorityElementNaive(a);
        //System.out.println("The Result is : "+result);
        //System.out.println("___________________________________________");
        System.out.println(myResult+" "+ naiveResult);
            
            
        if (myResult!=naiveResult){
            int theMax=0;
            int theMin=0;
                    
            for (int i = 0; i < a.length; i++) {
                if (a[i]==1) theMax++;
                if (a[i]==0) theMin++;
                
                
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println("");

            System.out.println("the max:  "  +theMax);
            System.out.println("the min:  "  +theMin);
            System.out.println("");
            break;

        }
            System.out.println("__________________________________");
        }
        
        **/
        

    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
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



