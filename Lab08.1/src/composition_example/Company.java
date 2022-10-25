package composition_example;

public class Company {

    private String companyName;
    private Employee[] employees = new Employee[100];
    private int employeeCount;

    public Company() {

    }

    public Company(String companyName) {
        this();
        setCompanyName(companyName);
    }

    public Company(String companyName, Employee[] employees) {
        this(companyName);
        setEmployees(employees);
    }

    public void addEmployee(Employee employee) {
        //employees[Employee.getInstanceCount()-1]=employee;
        employees[employeeCount++] = employee;
        //System.out.println(Employee.getInstanceCount());
    }

    public double computeTotalSalaryOfAllEmployees() {

        double ans = 0;
//        for(int i=0;i<Employee.getInstanceCount();i++){
//            ans+=employees[i].getSalary();
//        }
//        return ans;
        for (int i = 0; i < employeeCount; i++) {
            ans += employees[i].getSalary();
        }
        return ans;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
}
