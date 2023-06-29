import java.util.*;

public class INCOMETAXCALCULATOR {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Income = sc.nextInt();
    System.out.println("YOUR INCOME IS "+ Income);
    int tax ;
    if(Income<500000){
         tax = 0;
    }
    else if((Income > 500000) && (Income < 3000000)){
          tax = (int)(Income *0.20);

    }
    else{
         tax = (int)(Income * 0.30);
    }
    System.out.println("YOUR TAX IS "+tax);
    }
}