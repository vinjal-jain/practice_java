class Employee{
    int salary;
    String name ;

    public int getSalary(){
        return salary ;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}


public class chw_39_practiceset {
    public static void main(String[] args) {
        //Problem 1
        Employee vinjal = new Employee();
        vinjal.setName("grow with me");
        vinjal.salary = 245;
        System.out.println(vinjal.getSalary());
        System.out.println(vinjal.getName());


    }
}
