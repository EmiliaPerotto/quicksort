import java.io.*;
import java.util.*;
public class QuickSort{
  public static void quicksort(int[] arr, int low, int high){
    if(low< high){
      int pivot = partition(arr, low, high);
      quicksort(arr, low, pivot - 1);
      quicksort(arr, pivot + 1, high);
    }
    }
  public static int partition(int[] arr, int low, int high){
   int pivot = arr[high];
   int j = (low-1);
   for(int i = low; i<high; i++){
    if(arr[i] <= pivot){
      j++;
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
   }
   int temp = arr[j+1];
  arr[j+1] = arr[high];
  arr[high] = temp;
  return (j+1);
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
    quicksort(arr, 0, lines - 1);
    for (int i = 0; i < arr.length; i++){
      if(i != arr.length -1){
        System.out.print(arr[i] + " , ");
      }
      else{
        System.out.println(arr[i]);
    }
  }
  }
  }