import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no. :- ");
        int n = sc.nextInt();
        char c = 'a';
        for(int line = 1; line<= n;line++){
            for(int chars =1; chars<=line;chars++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
