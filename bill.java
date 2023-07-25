import java.util.*;

public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        System.out.println("COST OF THE PENCIL :- "+ pencil);
        float pen = sc.nextFloat();
        System.out.println("COST OF THE PEN :- "+ pen);
        float eraser = sc.nextFloat();
        System.out.println("COST OF THE ERASER :- "+ eraser);
        float Total = (pencil+pen+eraser);
        System.out.println("THE TOTAL COST :- "+ Total);
        float newTotal= (float) (Total+(0.18*Total));
        System.out.println("TOTAL COST AFTER 18% GST:-"+newTotal);
    }
}
