import java.util.Scanner;

public class arraysInsertion {
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the elements in array :- ");
            int n = sc.nextInt();
            int [] arr  = new int[n];
            int [] arr2 = new int [n+1];
            System.out.print("Enter the values:-");
            for(int i=0; i<n;i++){
                arr [i]  = sc.nextInt();
            }
            System.out.print("enter the new index value to be inserted :- ");
            int m  = sc.nextInt();
            System.out.print("Enter the new value to be inserted :-");
            int p = sc.nextInt();
            for(int i =0 ; i<n+1;i++){
                if(i<m){
                    arr2[i]=arr[i];
                }
                else if(i==m){
                    arr2[i]= p;
                }
                else{
                    arr2[i]= arr[i-1];
                }
            }
            System.out.println("ELEMENTS in the array are");
            for(int i=0; i<n+1;i++){
                System.out.println(arr2[i]);
            }

        }
    }

//INSERTION OF ELEMENTS IN THE ARRAY SUCCESSFUL//