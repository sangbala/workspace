package composition_example;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee e1=new Employee();
        Employee e2=new Employee("Mike");
        Employee e3=new Employee("John",50000.00,new Address("London","Britain"));
        Employee e4=new Employee("Will",50000.00);
        e4.setAddress(new Address("Paris","France"));
        System.out.println(e1.getEmployeeInfo());
        System.out.println(e2.getEmployeeInfo());
        System.out.println(e3.getEmployeeInfo());
        System.out.println(e4.getEmployeeInfo());
    }
}
