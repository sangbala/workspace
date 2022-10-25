package composition_example;

public class CompanyClient {
    public static void main(String[] args) {

        Company com=new Company("Sony");
        com.addEmployee(new Employee("Will",50000.00));
        com.addEmployee(new Employee("Tom",50000.00));
        com.addEmployee(new Employee("Connor",100000.00,new Address("Geneva", "Swiss")));


        System.out.println(com.getCompanyName());
        System.out.println(com.getEmployees()[0].getEmployeeInfo());
        System.out.println(com.getEmployees()[1].getEmployeeInfo());
        System.out.println(com.getEmployees()[2].getEmployeeInfo());

        System.out.println(com.computeTotalSalaryOfAllEmployees());

        //another company
        Company lg=new Company("LG");
        lg.addEmployee(new Employee("Mark",5000.00));
        lg.addEmployee(new Employee("Leon",5000.00));
        lg.addEmployee(new Employee("Conrad",10000.00,new Address("Tokyo", "Japan")));


        System.out.println(lg.getCompanyName());
        System.out.println(lg.getEmployees()[0].getEmployeeInfo());
        System.out.println(lg.getEmployees()[1].getEmployeeInfo());
        System.out.println(lg.getEmployees()[2].getEmployeeInfo());
        System.out.println(lg.computeTotalSalaryOfAllEmployees());

        System.out.println(Employee.getInstanceCount());
    }
}
