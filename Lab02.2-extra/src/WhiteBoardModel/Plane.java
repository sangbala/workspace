package WhiteBoardModel;

public class Plane {

    private String reg_num;
    private String manufacturer;
    private static int count;


    public Plane() {

    }

    public Plane(String reg_num){
        setReg_num(reg_num);
    }

    public Plane(String reg_num, String manufacturer){
        this(reg_num);
        setManufacturer(manufacturer);
    }



    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private void ascend(){
        System.out.println("The plane is ascending.");
    }
    private void descend(){
        System.out.println("The plane is descending.");
    }

    public void fly(){
        ascend();
        descend();
        numberOfTimesFlyMethodIsInvoked();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "reg_num='" + reg_num + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    private static void numberOfTimesFlyMethodIsInvoked(){
        count++;
    }

    public static int getCount() {
        return count;
    }

}
