package composition_example;

public class Employee {

    private String name;
    private double salary;
    private Address address;
    private static int instanceCount = 0;

    public Employee(){
        instanceCount++;
    }
    public Employee(String name){
        this();
        setName(name);

    }
    public Employee(String name,double salary){
        this(name);
        setSalary(salary);
    }
    public Employee(String name,double salary, Address address){
        this(name,salary);
        setAddress(address);
    }



    public String getEmployeeInfo(){

        return getName()+ " "+getSalary()+" "+ getAddress();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void setInstanceCount(int instanceCount) {
        Employee.instanceCount = instanceCount;
    }
}
