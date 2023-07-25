import java.awt.*;
import java.util.*;
public class JavaPracticeProblems {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Evensum =0;
        int Oddsum =0;
        int Choice = 0;
        int n;
        do {
            System.out.println("ENTER YOUR NUMBER :- ");
            n= sc.nextInt();
            if (n % 2 == 0) {
                Evensum = +Evensum;
            } else {
                Oddsum = +Oddsum;
            }

            System.out.println("Press 1 for YES or Press 0 to exit");
            Choice = sc.nextInt();



        }while(Choice == 1);
        System.out.println("EVEN SUM IS :-" + Evensum);
        System.out.println("ODD SUM IS :- " + Oddsum);

    }
}
