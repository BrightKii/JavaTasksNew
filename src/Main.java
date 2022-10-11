import java.util.Scanner;

public class Main {
   // task1.4
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int size = input.nextInt();
       int[] Array = new int[size];
       System.out.println("Enter numbers to fill the array");
       for(int i = 0; i < size; i++){
           Array[i] = input.nextInt();
       }
       int while_sum = 0;
       int counter = 0;
       while(counter < size){
           while_sum += Array[counter];
           counter++;
       }
       counter = 0;
       int do_while_sum = 0;
       do{
           do_while_sum += Array[counter];
           counter++;
       }while (counter < size);
       System.out.println("Result:");

       System.out.println("While sum: " + while_sum);
       System.out.println("Do while sum: " + do_while_sum);

       int max = 0;
       for(int i = 0; i < size; i++){
           if(max < Array[i]){
               max = Array[i];
           }
       }
       int min = max;
       for(int i = 0; i < size; i++){
           if(min > Array[i]){
               min = Array[i];
           }
       }
       System.out.println("Max and Min numbers in array: ");
       System.out.println(max);
       System.out.println(min);


       // task1.6
       double[] Arr;
       Arr = new double[10];
       for(int i = 1; i < 11; i++){
           double result = 1./i;
           String str = String.format("%.2f", result);
           System.out.println(str);
           result = Math.round(result*100.0)/100.0;
           Arr[i-1] = result;
       }
   }
}