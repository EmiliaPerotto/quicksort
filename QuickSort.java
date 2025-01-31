import java.io.*;
import java.util.*;
public class QuickSort{
  public static void partition(int[] arr1){
    int length = arr1.length;
    int pivot = quick(arr1)
    int pivot1 = arr[quick(arr1)];
    if(length <= 1){
      return;
    } //base case
    int o = 0
    int b = 0;
    int temp1 = 0;
    int temp2 = 0;
    for(int i = 0; i < arr1.legnth; i++){
        if(arr1[o] < pivot){
          b++;
        }
      }
    }
  public static int quick(int[] arr){
   int pivot = arr.length - 1;
   return pivot;
  }
  public static void main (String args[]) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename: ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    int lines = fin.nextInt();
    int[] arr = new int[lines];
    int j = 0;
    while(fin.hasNextLine()){
      arr[j] = fin.nextInt();
      j++;
    }
    for (int i = 0; i < arr.length; i++){
      if(i != arr.length -1){
        System.out.print(arr[i] + " , ");
      }
      else{
        System.out.println(arr[i]);
    }
  }
    System.out.println(arr[quick(arr)]);//pivot
  }
  }