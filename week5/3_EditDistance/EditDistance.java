import java.util.*;

class EditDistance {
  public static int EditDistance(String s, String t) {
    //write your code here
    int[][] arr = new int[t.length()+1][s.length()+1];
        arr[0][0]=0;
         for (int i = 1; i < arr[0].length; i++) {
            arr[0][i]=i;
     }
          for (int i = 1; i < arr.length;i++) {
            arr[i][0]=i;
    }
          for (int i = 1; i < arr.length; i++) {
              for (int j = 1; j < arr[0].length; j++) {

                  int value1=arr[i-1][j];
                  int value2=arr[i][j-1];
                  int value3=arr[i-1][j-1];
                  if (value3<=value2 && value3<=value1) {
                      if(s.charAt(j-1)==t.charAt(i-1)) arr[i][j]=arr[i-1][j-1];
                      else arr[i][j]=arr[i-1][j-1]+1;}

                  else if(value2<=value1 && value2<=value3){
                  arr[i][j]=arr[i][j-1]+1;}

                  else if(value1<=value2 && value1<=value3){
                  arr[i][j]=arr[i-1][j]+1;}


              }
        }
          /**
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }**/

    return arr[arr.length-1][arr[0].length-1];
  }
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }


}
