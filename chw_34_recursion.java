public class chw_34_recursion {
    static int fractional (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fractional(n - 1);
        }
    }

    public static void main(String[] args) {
        int x= 8;
        System.out.println("The value of factorial 8 is :- " + fractional(x));

    }
}
