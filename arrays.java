import java.util.Scanner;
public class arrays {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the elements in array :- ");
       int n = sc.nextInt();
       int [] arr  = new int[n];
       System.out.print("Enter the values:-");
       for(int i=0; i<n;i++){
           arr [i]  = sc.nextInt();
       }
       System.out.println("ELEMENTS in the array are");
       for(int i=0; i<n;i++){
           System.out.println(arr[i]);
       }

    }
}
