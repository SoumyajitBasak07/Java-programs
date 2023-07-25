import java.util.*;



public class JavaBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER :-");
        int n= sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                isPrime = false;
            }
        }
        if(isPrime ==true){
            System.out.print("THE NUMBER IS A PRIME NUMBER");
        }
        else {
            System.out.print("THE NUMBER IS A COMPOSITE NUMBER");
        }
    }
}








