public class chw_33_variables_argument {
    public static  int sum (int x,  int ... arr){
        int result= x;
        for (int a: arr ){
            result += a ;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("sum of 3 ,4,5,6,6 is :-  "  + sum(3,4,5,6,6));

    }
}
