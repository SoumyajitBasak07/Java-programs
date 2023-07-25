import java.util.Scanner;





public class functions {
    public static void product(int  a,  int b) {

        int product = a * b;
        System.out.print("The product is :-");
        System.out.println(product);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //user input of two no.s
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your numbers :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        product(a,b);
    }

}
