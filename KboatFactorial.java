
    import java.util.Scanner;

    public class KboatFactorial
    {
        public long fact(int n) {

            long f = 1;

            for (int i = 1; i <= n; i++) {
                f *= i;
            }

            return f;

        }

        public static void main(String args[]) {

            KboatFactorial obj = new KboatFactorial();

            Scanner in = new Scanner(System.in);
            System.out.print("Enter m: ");
            int m = in.nextInt();
            System.out.print("Enter n: ");
            int n = in.nextInt();

            double s = (double)(obj.fact(n)) / (obj.fact(m) * obj.fact(n - m));
            System.out.println("S=" + s);
        }
    }

