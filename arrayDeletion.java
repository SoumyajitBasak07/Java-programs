import java.util.Scanner;

public class arrayDeletion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array :- ");
        int n = sc.nextInt();
        int [] arr  = new int[n];
        int [] arr2 = new int[n-1];
        System.out.print("Enter the values:-");
        for(int i=0; i<n;i++){
            arr [i]  = sc.nextInt();
        }
        System.out.print("index to be deleted :-");
        int m = sc.nextInt();
        for(int i = 0; i< arr.length;i++){
            if(i<m){
                arr2[i]=arr[i];
            }
            else if(i==m){
                continue;
            }
            else{
                arr2[i-1]= arr[i];
            }

        }
        System.out.println("ELEMENTS in the array are");
        for(int i=0; i<n-1;i++){
            System.out.println(arr2[i]);
        }

    }
}
