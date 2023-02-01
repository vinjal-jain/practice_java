class Emoloyee{
    int id ;
    String name ;
    public  void printdetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is " + name);
    }
}

public class chw_opps {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Emoloyee vinjal = new Emoloyee(); //Instamtimg a mew employee object
        vinjal.id = 14;
        vinjal.name = "grow with me ";
       // System.out.println(vinjal.id);
      //  System.out.println(vinjal.name);
vinjal.printdetails();
    }
}
