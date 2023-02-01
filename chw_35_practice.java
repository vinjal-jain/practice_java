public class chw_35_practice {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i, n*i);
        }
    }

    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static int fib(int a ) {
        if (a == 1 || a == 2) {
            return a - 1;
        }
        else {
            return fib(a - 1) + fib(a - 2);
        }
    }
        public static void main(String[] args) {
        multiplication(45);
        int c = sumRec(6);
        System.out.println(c);

        //fibonacci series 0,1,1,2,3,5,8,13,21,34
       int   result= fib(5);
        System.out.println(result);


    }
}
