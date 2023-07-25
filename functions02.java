public class functions02 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int BinomialCoefficient(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int BC = n_fact/(r_fact)*(nmr_fact);
    return BC;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
        System.out.println(BinomialCoefficient(10,6));
    }
}


