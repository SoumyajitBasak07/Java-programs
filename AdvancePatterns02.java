import java.util.Scanner;
public class AdvancePatterns02 {
    public static void main(String args[]){
        System.out.println("Enter your Number :- ");
        Scanner in = new Scanner(System.in);
                int n = in.nextInt() ;
                for(int i=1; i<=n; i++) {
                    //spaces
                    for(int j=1; j<=n-i; j++) {
                        System.out.print(" ");
                    }


                    //stars
                    for(int j=1; j<=n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

