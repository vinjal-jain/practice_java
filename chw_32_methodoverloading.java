public class chw_32_methodoverloading {
    static void foo(){
        System.out.println("Good Morning lomde ");
    }
    static void foo (int a ){
        System.out.println("Good night " + a + "lomde");
    }
    static void foo (int a, int b  ){
        System.out.println("JAI SHREE RAM  " + a +  "  bar bol mhi toh "+ b + "  barr likhaunga");
    }
    static void chamge(int [] arr){

        arr [0] = 55;
    }
    public static void main(String[] args) {
int []marks = {53,67,78,89,90};
chamge (marks);
        System.out.println("The value of x after rumming change is " +  marks[0] );
        foo();
        foo(300);
        foo (4 , 50 );

    }
}
