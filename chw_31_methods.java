public class chw_31_methods {
    static int logic(int x , int y ){
        int z;
        if(x>y){
            z= x+y ;
        }
        else {
            z= (x+y)*5;
        }
        return z ;
    }

    public static void main(String[] args) {
int a = 3 ;
int b = 6 ;
int c ;
//Method invocation using Object creation
        //chw_31_methods obj = new chw_31_methods) ;
        //c = obj.logic(a , b ) ;
c = logic(a,b);

int w = 7 ;
int q = 2 ;
int u ;
u = logic (w, q);
        System.out.println(c);
        System.out.println(u);
    }
}
