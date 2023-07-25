public class Calculator01 {
    public static int sum(int a, int b){
        return (a+b);
    }
    public static int sum(int a , int b, int c){
        return (a+b+c);
    }
    public static int subtraction(int a, int b){
        return (a-b);
    }
    public static int subtraction(int a , int b, int c){
        return (a-b-c);
    }
    public static int multiplication(int a, int b){
        return (a*b);
    }
    public static int multiplication(int a , int b, int c){
        return (a*b*c);
    }
    public static float divide(float a, float b){
        return (a/b);
    }
    public static void main(String args[]){
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,5));
        System.out.println(subtraction(4,3));
        System.out.println(subtraction(5,5,3));
        System.out.println(multiplication(3,4));
        System.out.println(multiplication(3,4,5));
        System.out.println(divide(10f,6f));
    }
}
