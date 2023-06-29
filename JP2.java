import java.util.Scanner;


public class JP2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        if(n1%2 == 0){
            System.out.println("Even no.");
        }
        else {
            System.out.println("Odd No.");
        }
    }
}
